class Solution {
    public boolean exist(char[][] board, String word) {
        char[] charArray = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (confirm(board, charArray, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean confirm(char[][] board, char[] word, int r, int c, int index) {
        if (index == word.length) {
            return true;
        }

        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != word[index]) {
            return false;
        }
        char temp = board[r][c];
        board[r][c] = '#';
        boolean found = confirm(board, word, r + 1, c, index + 1) ||
                        confirm(board, word, r - 1, c, index + 1) ||
                        confirm(board, word, r, c + 1, index + 1) ||
                        confirm(board, word, r, c - 1, index + 1);

        board[r][c] = temp;

        return found;
    }
}
