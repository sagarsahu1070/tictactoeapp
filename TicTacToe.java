public class TicTacToe {

    // 3x3 Board initialization
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        // Test cases
        System.out.println("Move (1,1): " + isValidMove(1, 1)); // true
        board[1][1] = 'X'; // occupy cell
        System.out.println("Move (1,1) again: " + isValidMove(1, 1)); // false
        System.out.println("Move (3,3): " + isValidMove(3, 3)); // false (out of bounds)
    }

    /**
     * UC5: Validate move
     * Checks:
     * 1. Row and column are within bounds (0–2)
     * 2. Cell is empty ('-')
     */
    static boolean isValidMove(int row, int col) {

        // Boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}