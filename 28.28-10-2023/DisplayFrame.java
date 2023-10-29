//GUI Design
//Component...Button,TextField
//Container...Frame,Window,Applet,Panel
import java.awt.*;
import java.awt.event.*;
class DisplayFrame extends Frame implements ActionListener{
	Button btnClick,btnClear;
	Label lblDisp;
	DisplayFrame(){
		//frame properties
		setVisible(true);
		setSize(500,500);
		setTitle("FirstFrame");
		setLayout(null);
		
		//Button
		btnClick=new Button("Hack nasa");
		add(btnClick);
		btnClick.setBounds(50,50,100,30);  //POSITION AND SIZE
		
		//Label
		lblDisp=new Label("Welcome to first GUI");
		add(lblDisp);
		lblDisp.setBounds(50,100,500,300);  //POSITION AND SIZE
		btnClick.addActionListener(this);

		btnClear=new Button("Unhack nasa");
		add(btnClear);
		btnClear.setBounds(200,50,100,30);
		btnClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				lblDisp.setText("SURRENDERED TO NASA :(");
			}
		});
	}
	public void actionPerformed(ActionEvent ae){
		lblDisp.setText("NASA HACKED SUCCESSFULLY CONGRATS! YOU ARE BATMAN");
	}
	public static void main(String args[]){
		new DisplayFrame();
	}
}