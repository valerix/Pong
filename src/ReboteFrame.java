import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class ReboteFrame extends JFrame implements KeyListener{
	private PelotaComponente comp;
	
	public static final int DEFAULT_WIDTH=450;
	public static final int DEFAULT_HEIGHT=350;
	Rectangle2D barrita;
	int y=80;
	
	JButton arriba;
	JButton abajo;
	
	public static final int PASOS=3000;
	public static final int RETRASO=3;
	
	
	
	public ReboteFrame(){
		
		this.setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		this.setTitle("Rebotes");
		comp=new PelotaComponente();
		this.add(comp,BorderLayout.CENTER);
		JPanel buttonPanel=new JPanel();
	
	
		barrita = new Rectangle(400, y, 10, 100);
		
		
		
		this.addButton(buttonPanel, "Iniciar", new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				addPelota();
				
			}
		});
		
		this.addButton(buttonPanel,"Cerrar",new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		
		
		add(buttonPanel,BorderLayout.SOUTH);
		
		
		
	}
	
	public void addButton(Container c,String titulo,ActionListener listener){
		JButton btn=new JButton(titulo);
		c.add(btn);
		btn.addActionListener(listener);
	}
	
	public void addPelota(){
		Pelota p=new Pelota();
		comp.addPelota(p);
		for(int i=1;i<PASOS; i--){
			try {
				p.move(comp.getBounds(),barrita);
				comp.addRect(barrita);
				comp.paint(comp.getGraphics());
				Thread.sleep(RETRASO);
			} catch (InterruptedException e) {
				

			}
		}
	}

	@Override
	public void keyPressed(KeyEvent evt) {
		// TODO Auto-generated method stub
		switch(evt.getKeyCode()){
		case KeyEvent.VK_UP:
			barrita = new Rectangle(400, y-10, 10, 100);
			break;
		case KeyEvent.VK_DOWN:
			barrita = new Rectangle(400, y+10, 10, 100);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}





}