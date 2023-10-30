//PaintFrame1.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class PaintFrame1 extends JFrame implements MouseListener,MouseMotionListener{
	int xPressed,yPressed;
	int xDragged,yDragged;
	PaintFrame1(){
		setVisible(true);
		setSize(500,500);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void paint(Graphics g){
		Graphics2D g1=(Graphics2D)this.getGraphics();
		g1.setStroke(new BasicStroke(10));
		g1.setColor(Color.yellow);
		g1.drawLine(xPressed,yPressed,xDragged,yDragged);
		xPressed=xDragged;
		yPressed=yDragged;	
	}
	
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

	public static void main(String args[]){
		new PaintFrame1();
	}

}