import java.awt.EventQueue;

import javax.swing.JFrame;


public class Pong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable(){
		
		@Override
		public void run(){
			JFrame frame=new ReboteFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
		});
	}

}
