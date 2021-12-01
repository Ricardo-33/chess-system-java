package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	// O construtor não recebe position pois no início 
	// a peça ainda não foi colocada no tabuleiro
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// É deixado como protected porque somente classes dentro 
	// desse pacote e a subclasses de piece podem acessar o 
	// tabuleiro associado a uma peça
	protected Board getBoard() {
		return board;
	}
}
