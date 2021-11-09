package coma.strings;

public class LogestSubString {

    public static void main(String[] args) {
        String s1 ="aac";
        String s2 = "azc";
        int result = longestCommonSubsequenceLength(s1, s2);
        System.out.println(result);
    }

    public static int longestCommonSubsequenceLength(String s1, String s2) {
        /*
         * s2 will be on the rows, s1 will be on the columns.
         *
         * +1 to leave room at the left for the "".
         */
        int cache[][] = new int[s2.length() + 1][s1.length() + 1];

        /*
         * cache[s2.length()][s1.length()] is our original subproblem. Each entry in the
         * table is taking a substring operation against whatever string is on the rows
         * or columns.
         *
         * It goes from index 0 to index s2Row/s1Col (exclusive)
         *
         * So if my s1 = "azb" and s1Col = 2...then my substring that I pass to the
         * lcs() function will be:
         *
         * 0 1 2 "a  z  b"
         *
         * "az" (index 2...our upper bound of the snippet...is excluded)
         */
        for (int row = 0; row <= s2.length(); row++) {
            for (int col = 0; col <= s1.length(); col++) {
                if (row == 0 || col == 0) {
                    cache[row][col] = 0;
                } else if (s2.charAt(row - 1) == s1.charAt(col - 1)) {
                    cache[row][col] = cache[row - 1][col - 1] + 1;
                } else {
                    cache[row][col] = Math.max(
                            cache[row - 1][col], cache[row][col - 1]
                    );
                }
            }
        }

        return cache[s2.length()][s1.length()];
    }
}
