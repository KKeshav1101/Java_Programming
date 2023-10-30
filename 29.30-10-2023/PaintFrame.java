//static paint frame that draws predefined graphics
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class PaintFrame extends JFrame{
	//int xPressed,yPressed;
	//int xDragged,yDragged;
	PaintFrame(){
		setVisible(true);
		setSize(500,500);
		repaint();
	}
	
	//paint function is a predefined function in all containers,can't call it directly, can only indirectly call with repaint method
	public void paint(Graphics g){
		Graphics2D g1=(Graphics2D)this.getGraphics();
		g1.setStroke(new BasicStroke(10));
		g1.setColor(Color.yellow);
		g1.drawLine(50,50,100,100);	
	}
	public static void main(String args[]){
		new PaintFrame();
	}
}