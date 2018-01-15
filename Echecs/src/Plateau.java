import java.awt.Color;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plateau implements ActionListener{

	private JFrame frame;
	JButton piece[][] = new JButton[8][8];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plateau window = new Plateau();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Plateau() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(8, 8, 0, 0));
		String file ;
		for(int i=0;i<8;i++) {
			for (int j = 0; j < 8; j++) {
				file = "/Img/";
				piece[i][j] = new JButton();
				piece[i][j].addActionListener(this);
				if((i+j)%2==0) {
					piece[i][j].setBackground(new Color(200, 200, 200));
				}else {
					piece[i][j].setBackground(new Color(255, 255, 255));
				}
				if(i==0 && j == 7|| j==0 && i==7|| j==7 && i==7|| j==0 && i==0) {
					file+="blanc/tour";
					piece[i][j].setText("tour" + i/7);
				}else if(i==0 && j==1 ||i==0 && j==6||i==7 && j==1||i==7 && j==6){
					file+="blanc/cavalier";
					piece[i][j].setText("caval"+ i/7);
				}else if(i==0 && j==2 ||i==0 && j==5||i==7 && j==2||i==7 && j==5){
					file+="blanc/fou";
					piece[i][j].setText("fou"+ i/7);
				}else if(i==1 || i ==6){
					file+="blanc/pion";
					piece[i][j].setText("pion"+ i/7);
				}else if(j==3 && i==7 ||j==3 && i==0){
					file+="blanc/roi";
					piece[i][j].setText("roi"+ i/7);
				}else if(j==4 && i==7 ||j==4 && i==0){
					file+="blanc/reine";
					piece[i][j].setText("reine"+ i/7);
				}else {
				}
				file+=".gif";
				  try {
					    Image img = ImageIO.read(getClass().getResource(file));
					    piece[i][j].setIcon(new ImageIcon(img));
					  } catch (Exception ex) {
						  System.out.println(file);
					    System.out.println(ex);
					  }
			}
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(((JButton)arg0.getSource()).getText() + " ");
		System.out.print(((JButton)arg0.getSource()).getX() + " ");
		System.out.print(((JButton)arg0.getSource()).getY());
		
	}

}
