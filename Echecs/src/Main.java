
public class Main {
	static Piece[][] tableau = new Piece[8][8];
	public static void main(String[] args) {
		initialise();
	}
	public static void initialise() {
		for (int i=1;i<9;i++) {
			for (int j=1;j<9;j++) {
				tableau[i][j] = new Piece();
			}
		}
		
	}
}
