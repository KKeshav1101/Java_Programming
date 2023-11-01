import javax.swing.*;
class FirstSwing{
	JFrame jf;
	FirstSwing(){
		jf=new JFrame("Welcome");
		jf.setVisible(true);
		jf.setSize(500,500);
	}
	public static void main(String args[]){
		new FirstSwing();
	}
}