//creating a notepad liking gui
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Notepad{
    JFrame jf;
    JTextArea jt;
    JMenuBar jmb;
    JMenu mnuFile,mnuColor;
    JMenuItem mOpen;
    JCheckBoxMenuItem mBack,mFore;
    Notepad(){
        jf=new JFrame("Notepad");
        jf.setVisible(true);
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        jf.setLayout(null);
        jmb=new JMenuBar();
        jf.setJMenuBar(jmb);

        mnuFile=new JMenu("File");
        mnuColor=new JMenu("Color");
        jmb.add(mnuFile);
        jmb.add(mnuColor);

	jt=new JTextArea();
	jt.setFont(new Font("Times New Roman",Font.PLAIN,12));
        jt.setBounds(0,0,jf.getWidth(),jf.getHeight());
        jf.add(jt);
        jf.getContentPane().repaint();

	mOpen=new JMenuItem("Open");
	mnuFile.add(mOpen);
	mFore=new JCheckBoxMenuItem("Foreground");
	mnuFile.add(mOpen);
	mnuColor.add(mFore);
	mFore.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent ie){
			if(mFore.getState()==true)
				jt.setForeground(Color.red);
			else
				jt.setForeground(Color.black);
			jf.getContentPane().repaint();
		}
	});
	
	mOpen.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			JFileChooser jfc=new JFileChooser();
			int opt=jfc.showOpenDialog(jf);
			if(opt==JFileChooser.APPROVE_OPTION){
				try{
					File f=jfc.getSelectedFile();
					FileInputStream fis=new FileInputStream(f);
					byte data[]=new byte[(int)f.length()];
					fis.read(data);
					jt.setText(""+new String(data)); 
					fis.close();//using constructor for byte array to string
				}
				catch(Exception e){}
			}
			jf.getContentPane().repaint();
		}
	});
    }
    public void paint(Graphics g){
        jf.getContentPane().repaint();
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Notepad();
            }
        });
    }
}