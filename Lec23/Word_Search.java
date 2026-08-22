package Lec23;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					if(Search(board, i, j, word, 0)) {
						System.out.println(true);
						return;
					}
				}
			}
		}
		System.out.println(false);
	}

	public static boolean Search(char[][] board, int cr, int cc, String word, int idx) {
		// TODO Auto-generated method stub
		if (idx == word.length()) {
			return true;
		}
		if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || word.charAt(idx) != board[cr][cc]) {
			return false;
		}
		board[cr][cc] = '*';
		boolean a = Search(board, cr - 1, cc, word, idx + 1);
		boolean b = Search(board, cr, cc - 1, word, idx + 1);
		boolean c = Search(board, cr + 1, cc, word, idx + 1);
		boolean d = Search(board, cr, cc +1, word, idx + 1);
		board[cr][cc] = word.charAt(idx);
		return a || b || c || d;
	}

}
