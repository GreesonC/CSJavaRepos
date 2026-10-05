public class StringCheese {

    public static boolean isSubstring(String first, String second) {

        if (first.length() > second.length()) {
            return false;
        }

        for (int i = 0; i <= second.length() - first.length(); i++) {

            boolean same = true;

            for (int j = 0; j < first.length(); j++) {
                if (first.charAt(j) != second.charAt(i + j)) {
                    same = false;
                    break;
                }
            }

            if (same) {
                return true;
            }
        }

        return false;
    }

    public static boolean isPrefix(String first, String second) {

        if (first.length() > second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSuffix(String first, String second) {

        if (first.length() > second.length()) {
            return false;
        }

        int start = second.length() - first.length();

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(start + i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isProperPrefix(String first, String second) {

        if (first.length() >= second.length()) {
            return false;
        }

        return isPrefix(first, second);
    }

    public static boolean isProperSuffix(String first, String second) {

        if (first.length() >= second.length()) {
            return false;
        }

        return isSuffix(first, second);
    }

    public static String concatenate(String first, String second) {
        return first + second;
    }
}
