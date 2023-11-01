import java.awt.*;
import java.awt.event.*;
class TextEditor extends Frame{
	String msg="";
	Scrollbar sc;
	List lstStyle;
	//set properties using constructor
	TextEditor(){
		setLayout(null);
		setVisible(true);
		setSize(500,500);
		setTitle("MyText Editor");
		setFont(new Font("Arial",Font.BOLD,20));
		sc=new Scrollbar(Scrollbar.VERTICAL,0,5,0,50);
		add(sc);
		sc.setBounds(50,50,25,300);
		lstStyle=new List();
		lstStyle.add("Font.BOLD");
		lstStyle.add("Font.PLAIN");
		lstStyle.add("Font.ITALIC");
		add(lstStyle);
		lstStyle.setBounds(150,50,200,50);

		lstStyle.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ae){
				if(lstStyle.getSelectedItem()=="Font.BOLD")
					setFont(new Font("Arial",Font.BOLD,20));	
				else if(lstStyle.getSelectedItem()=="Font.PLAIN")
					setFont(new Font("Arial",Font.PLAIN,20));	
				else
					setFont(new Font("Arial",Font.ITALIC,20));
			}
		});

		addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent ke){
				msg+=ke.getKeyChar();
				repaint();	
			}
		});
		sc.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent ae){
				setFont(new Font("Arial",Font.BOLD,ae.getValue()));
				repaint();
			}
		});
	}
	
	public void paint(Graphics g){
		g.drawString(msg,50,50);
	}
		
	public static void main(String args[]){
		new TextEditor();
	}
}