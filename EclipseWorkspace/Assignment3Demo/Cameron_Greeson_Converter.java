
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cameron_Greeson_Converter
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter input filename: ");
		String inputFileName = userInput.nextLine();

		System.out.print("Enter output filename: ");
		String outputFileName = userInput.nextLine();

		try (Scanner infixFile = new Scanner(new File(inputFileName));
				PrintWriter postfixFile = new PrintWriter(outputFileName))
		{

			while (infixFile.hasNextLine())
			{
				String infixExpression = infixFile.nextLine();

				try
				{
					String postfixExpression = makePostfix(infixExpression);
					postfixFile.println(postfixExpression);
					System.out.println(postfixExpression);
				} catch (IllegalArgumentException error)
				{
					String errorMessage = "ERROR: " + error.getMessage();
					postfixFile.println(errorMessage);
					System.out.println(errorMessage);
				}
			}

		} catch (FileNotFoundException error)
		{
			System.out.println("Unable to open the input or output file.");
		}

		userInput.close();
	}

	public static String makePostfix(String infixExpression)
	{
		MyLinkedStack<Character> operatorStack = new MyLinkedStack<>();
		StringBuilder postfixExpression = new StringBuilder();

		for (int position = 0; position < infixExpression.length(); position++)
		{
			char symbol = infixExpression.charAt(position);

			if (Character.isWhitespace(symbol))
			{
				continue;
			}

			if (Character.isLetterOrDigit(symbol))
			{
				postfixExpression.append(symbol);
			} else if (symbol == '(')
			{
				operatorStack.push(symbol);
			} else if (symbol == ')')
			{
				while (!operatorStack.isEmpty() && operatorStack.peek() != '(')
				{
					postfixExpression.append(operatorStack.pop());
				}

				if (operatorStack.isEmpty())
				{
					throw new IllegalArgumentException("mismatched parentheses");
				}

				operatorStack.pop();
			} else if (isOperator(symbol))
			{
				while (!operatorStack.isEmpty() && operatorStack.peek() != '('
						&& shouldPopOperator(operatorStack.peek(), symbol))
				{
					postfixExpression.append(operatorStack.pop());
				}

				operatorStack.push(symbol);
			} else
			{
				throw new IllegalArgumentException("invalid expression");
			}
		}

		while (!operatorStack.isEmpty())
		{
			char topOperator = operatorStack.pop();
			if (topOperator == '(')
			{
				throw new IllegalArgumentException("mismatched parentheses");
			}
			postfixExpression.append(topOperator);
		}

		return postfixExpression.toString();
	}

	private static boolean isOperator(char character)
	{
		return character == '+' || character == '-' || character == '*' || character == '/' || character == '^';
	}

	private static int getPrecedence(char operator)
	{
		if (operator == '^')
		{
			return 3;
		}
		if (operator == '*' || operator == '/')
		{
			return 2;
		}
		return 1;
	}

	private static boolean shouldPopOperator(char stackOperator, char newOperator)
	{
		if (newOperator == '^')
		{
			return getPrecedence(stackOperator) > getPrecedence(newOperator);
		}
		return getPrecedence(stackOperator) >= getPrecedence(newOperator);
	}
}