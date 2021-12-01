package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	// O construtor n�o recebe position pois no in�cio 
	// a pe�a ainda n�o foi colocada no tabuleiro
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// � deixado como protected porque somente classes dentro 
	// desse pacote e a subclasses de piece podem acessar o 
	// tabuleiro associado a uma pe�a
	protected Board getBoard() {
		return board;
	}
}
