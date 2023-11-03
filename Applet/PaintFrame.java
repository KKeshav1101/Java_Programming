//PaintFrame
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
class PaintFrame extends JFrame{//dont have to implement those interfaces either//
	int xPressed,yPressed;
	int xDragged,yDragged;
	Random r;
	PaintFrame(){
		setVisible(true);
		setSize(500,500);
		r=new Random();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		g1.setStroke(new BasicStroke(5));
		g1.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		g1.drawLine(xPressed,yPressed,xDragged,yDragged);
		xPressed=xDragged;
		yPressed=yDragged;	
	}
}