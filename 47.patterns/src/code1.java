public class code1 {

    public static void main(String[] args) {

        /*
         * Prints an inverted right-angle triangle pattern using recursion.
         *
         * Example Output:
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         * *
         *
         * The number of rows can be changed by modifying the first argument.
         * The column index should always start from 0.
         */
        printPattern(6, 0);
    }

    /**
     * Recursively prints an inverted triangle pattern.
     *
     * <pre>
     * Example:
     * * * * * *
     * * * * *
     * * * *
     * * *
     * * *
     * *
     * </pre>
     *
     * @param row    Number of stars to print in the current row.
     * @param column Current column index (always starts from 0).
     */
    public static void printPattern(int row, int column) {

        // Base case: stop recursion when no rows are left.
        if (row == 0) {
            return;
        }

        // Print stars in the current row.
        if (column < row) {
            System.out.print(" * ");
            printPattern(row, column + 1);
        } else {
            // Move to the next row.
            System.out.println();
            printPattern(row - 1, 0);
        }
    }
}