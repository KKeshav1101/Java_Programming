import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TextDemo{
	JTextField tf;
	JTextArea ta;
	JFrame f;
	TextDemo(){
		f=new JFrame("Demo");
		f.setLayout(null);
		Font ft=new Font("Times New Roman",Font.BOLD,25);
		
		tf=new JTextField();
		ta=new JTextArea();
		
		JScrollPane scrollBar=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollBar.setBounds(100,150,500,400);
		
		tf.setBounds(100,20,400,50);
		ta.setFont(ft);
		ta.setEditable(false);
		tf.setFont(ft);

		tf.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent ke){
				if(ke.getKeyCode()==ke.VK_ESCAPE){
					tf.setText("");
				}
				ta.setText(tf.getText());
			}
		});
		
		f.add(scrollBar);
		f.add(tf);
		
		f.setSize(700,700);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);					f.setVisible(true);
	}
	public static void main(String ar[]){
		new TextDemo();
	}
}