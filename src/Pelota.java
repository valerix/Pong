import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


public class Pelota {
	private static final int XSIZE=15;
	private static final int YSIZE=15;
	private double x=0;
	private double y=0;
	private double dx=1;
	private double dy=1;
	
	public void move(Rectangle2D bounds,Rectangle2D barra){
		x+=dx;
		y+=dy;
		
		if(x>barra.getMinX() && x<barra.getMaxX() && y>barra.getMinY() && y<barra.getMaxY()){
			dx=-dx;
			dy=-dy;
		}
		
		if(x<bounds.getMinX()){
			x=bounds.getMinX();
			dx=-dx;
		}
		if(x+XSIZE>=bounds.getMaxX()){
			x=bounds.getMaxX()-XSIZE;
			dx=-dx;
		}
		if(y<bounds.getMinY()){
			y=bounds.getMinY();
			dy=-dy;
		}
		if(y+YSIZE>=bounds.getMaxY()){
			y=bounds.getMaxY()-YSIZE;
			dy=-dy;
		}
	}
	
	public Ellipse2D getShape(){
		return new Ellipse2D.Double(x,y,XSIZE,YSIZE);
		
	}
	

}
