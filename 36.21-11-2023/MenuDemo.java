//exploring JMenus
import javax.swing.*;
class MenuDemo{
	JMenuBar mb;
	JMenu file,edit,view,zoom;
	JMenuItem wwrap,zin,zout,dzoom;
	JCheckBoxMenuItem sb;
	JFrame f;
	MenuDemo(){
		f=new JFrame("Notepad");
		mb=new JMenuBar();
		
		file=new JMenu("File");
		edit=new JMenu("Edit");
		view=new JMenu("View");
		zoom=new JMenu("Zoom");

		sb=new JCheckBoxMenuItem("Status Bar");
		wwrap=new JMenuItem("Word Wrap");
		zin=new JMenuItem("Zoom In");
		zout=new JMenuItem("Zoom Out");
		dzoom=new JMenuItem("Restore Default zoom");
		
		file.setMnemonic('F');
		edit.setMnemonic('E');
		view.setMnemonic('V');

		mb.add(file);
		mb.add(edit);
		mb.add(view);

		view.add(zoom);
		view.add(sb);
		view.add(wwrap);

		zoom.add(zin);
		zoom.add(zout);
		zoom.add(dzoom);

		f.setJMenuBar(mb);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,600);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new MenuDemo();
	}
}