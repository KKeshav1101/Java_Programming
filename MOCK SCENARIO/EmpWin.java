//GUI
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
class EmpWin{
	JFrame jf;
	JButton add,rem,upd,srch;
	JScrollPane js;
	JTable jt;
	public static EmployeeList el;
	EmpWin(){
		jf=new JFrame("Home");
		jf.setVisible(true);
		jf.setSize(400,150);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("BasicPay");
		model.addColumn("GrossPay");
		model.addColumn("NetPay");

		jt=new JTable(model);
		js=new JScrollPane(jt);
		jf.add(js);
		
		
		add=new JButton("Add");
		jf.add(add);
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new addframe();
				if(el.el!=null){
					for(var i:el.el)
						model.addRow(new Object[]{i.eid,i.name,i.bp});	
				}
				jf.getContentPane().repaint();
			}
		});
		
		rem=new JButton("Remove");
		rem.setForeground(Color.RED);
		jf.add(rem);
		rem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new remframe();
				if(el.el!=null){
					for(var i:el.el)
						model.addRow(new Object[]{i.eid,i.name,i.bp});	
				}
				jf.getContentPane().repaint();
			}
		});
				
		upd=new JButton("Update");
		upd.setForeground(Color.BLUE);
		jf.add(upd);
		upd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new updframe();
				if(el.el!=null){
					for(var i:el.el)
						model.addRow(new Object[]{i.eid,i.name,i.bp});	
				}
				jf.getContentPane().repaint();
			}
		});
		
		srch=new JButton("Search");
		jf.add(srch);
		srch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new srchframe();
				if(el.el!=null){
					for(var i:el.el)
						model.addRow(new Object[]{i.eid,i.name,i.bp});	
				}
				jf.getContentPane().repaint();
			}
		});
	
		jf.getContentPane().repaint();
		jf.validate();
	}
	public static void main(String args[]){
		new EmpWin();
	}
}