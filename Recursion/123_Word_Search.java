//123_Word_Search

public boolean exist(char[][] board, String word) {
    if(board == null || board.length == 0 || board[0].length == 0) {
        return false;
    }
    if(word.length() == 0) {
        return true;
    }
    for(int i = 0; i < board.length; i++) {
        for(int j = 0; j < board[0].length; j++) {
            if(board[i][j] == word.charAt(0)) {
                boolean res = find(word, board, i, j, 0);
                if(res) {
                    return true;
                }
            }
        }
    }
    return false;
}
//Time : O(n * m * length); n = board.length; m = board[0].length; length = word.length();
//Space : O(1);

public boolean find (String word, char[][] board, int i, int j, int idx) {
    if(idx == word.length()) {
        return true;
    }
    if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(idx)) {
        return false;
    }
    board[i][j] = '#';
    boolean result = find (word, board, i + 1, j, idx + 1) || find (word, board, i - 1, j, idx + 1) || find (word, board, i, j + 1, idx + 1) || find (word, board, i, j - 1, idx + 1);
    board[i][j] = word.charAt(idx);
    return result;
}