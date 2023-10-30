//using MouseAdapter class on PaintFrame1.java
//PaintFrame2.java
//PaintFrame1.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
class PaintFrame2 extends JFrame{//dont have to implement those interfaces either :)//
	int xPressed,yPressed;
	int xDragged,yDragged;
	Random r;
	PaintFrame2(){
		setVisible(true);
		setSize(500,500);
		r=new Random();
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent me){
				xPressed=me.getX();
				yPressed=me.getY();
			}
		});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent me){
				xDragged=me.getX();
				yDragged=me.getY();
				repaint();
			}
		});
	}

	public void paint(Graphics g){
		Graphics2D g1=(Graphics2D)this.getGraphics();
		g1.setStroke(new BasicStroke(10));
		g1.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		g1.drawLine(xPressed,yPressed,xDragged,yDragged);
		xPressed=xDragged;
		yPressed=yDragged;	
	}
	
/*	
NOT NECESSARY TO USE THIS BLOCK BECAUSE OF ADAPTER- ALLOWS TO ONLY OVERRIDE REQUIRED FUNCTIONS
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){
		xPressed=me.getX();
		yPressed=me.getY();
	}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mouseDragged(MouseEvent me){
		xDragged=me.getX();
		yDragged=me.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent me){}
*/

	public static void main(String args[]){
		new PaintFrame2();
	}

}