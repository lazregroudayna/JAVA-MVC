package revision;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyList extends JFrame {
	JLabel insc = new JLabel("Liste des utilisateurs");
	String entete[]={"Id","Nom","Genre"};
	DefaultTableModel model=new DefaultTableModel(entete,10);
	JTable table=new JTable(model);
	JScrollPane sp=new JScrollPane();
	
	MyList() {
		 setTitle("Examen");
	        setSize(500, 400);
	        setLocationRelativeTo(getParent());
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
		sp.getViewport().add(table);
		JPanel tab=new JPanel();
    	tab.setLayout(new BorderLayout());
    	tab.add("Center",sp);
    	
    	 JPanel Pinfo = new JPanel(new GridLayout()); // Adjusted to have 3 rows and proper spacing
         Pinfo.add(insc);
         
    	Container c=getContentPane();
    	c.setLayout(new BorderLayout());
    	c.add("North",Pinfo);
    	c.add("Center",tab);
    	
         
    	setSize(600,400);
    	Mythread th = new Mythread(this);
		th.start();
    	setVisible(true);
	}





}