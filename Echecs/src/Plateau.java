import javax.swing.JFrame;

public class Plateau {
	static Pion[][] plateau;
	public static void main(String[] args) {
		initialise();
	}
	public static void initialise() {
		plateau = plateau();
		plateau.toString();
		
	}
	public String toString() {
		String res="";
		for (int i=0;i<=7;i++) {
			for (int j=0;j<=7;j++) {
				res += this.plateau[i][j].toString();
			}
		}
		return res;
		
	}
	public static Pion[][] plateau() {
		Pion[][] plateau = new Pion[8][8];
		for (int i=0;i<=7;i++) {
			for (int j=0;j<=7;j++) {
				if(i==1 || i==6) {
					plateau[i][j] = new Pion();
				}
			}
		}
		return plateau;
		
	}
}
