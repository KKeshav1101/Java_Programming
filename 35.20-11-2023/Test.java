//Timer..JToggle,,BorderLayout
/*JtoggleButton, JCheckBox, JRadioButton, JChoice, JList*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class Test{
	JFrame jf;
	JLabel jl;
	int x=0;
	int y=0;
	JToggleButton jt;
	Random r;
	JCheckBox jb1,jb2;
	Test(){
		r=new Random();
		
		jf=new JFrame("XXX");
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setSize(500,500);
		jl=new JLabel("SASTRA");
		jt=new JToggleButton("Color");
		jf.add(jt);
		jt.setBounds(100,100,100,50);
		jl.setFont(new Font("Arial",Font.BOLD,25));
		jf.add(jl);
		jl.setBounds(100,100,100,50);
		jb1=new JCheckBox("CSE",true);jf.add(jb1);
		jb2=new JCheckBox("IT",false);jf.add(jb2);
		
		jt.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				if(ie.getStateChange()==ItemEvent.SELECTED)
					System.out.println("select...");
				else
					System.out.println("deselect...");
			}
		});
		Timer t=new Timer(10,new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jl.setForeground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
				jl.setLocation(x+=10, y+=5);
				jf.validate();
				jf.repaint();
			}
		});
		t.start();
		jf.validate();
		jf.repaint();
	}
	public static void main(String args[]){
		new Test();
	}
}