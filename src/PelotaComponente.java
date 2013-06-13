import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;


public class PelotaComponente extends JPanel{
	
	private ArrayList<Pelota>pelotas=new ArrayList<Pelota>();
	Rectangle2D rec= new Rectangle(10, 10, 10, 10);
	
	public void addPelota(Pelota p){
		pelotas.add(p);
	}
	public void addRect(Rectangle2D r){
		this.rec=r;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		for(Pelota p:pelotas){
			g2.fill(p.getShape());
			g2.fill(rec.getBounds2D());
		}
	}
	

}
