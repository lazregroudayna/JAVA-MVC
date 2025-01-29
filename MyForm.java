package revision;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
public class MyForm extends JFrame  {
    

    JLabel FomL= new JLabel("formulaire");
    JLabel nomL= new JLabel("Nom");
    JLabel genreL= new JLabel("Genre");
    JLabel addl= new JLabel("Adresse");
   public  JTextField nomT= new JTextField();
   public  JComboBox pGenre = new JComboBox(new String[]{"H","F"});  
    public JButton Aj = new JButton("Ajouter");
    public  JButton liste = new JButton("Liste");
 
   
 
    public MyForm() {
        setSize(500, 300);
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel Pgenre= new JPanel();
        Pgenre.setLayout(new GridLayout(1, 2));
   
        JPanel Pcentre = new JPanel();
        Pcentre.setLayout(new GridLayout(3, 2));
        Pcentre.add(nomL);
        Pcentre.add(nomT);
    
        Pcentre.add(genreL);
        Pcentre.add(pGenre);
        JPanel Psouth = new JPanel();
        Psouth.setLayout(new FlowLayout(FlowLayout.RIGHT));
        Psouth.add(Aj);
        Psouth.add(liste);
        FomL.setHorizontalAlignment(SwingConstants.CENTER);
        Pcentre.setBorder(BorderFactory.createTitledBorder("Informations"));
        Container c =getContentPane();
        c.setLayout(new BorderLayout());
        c.add("North",FomL);
        c.add("Center",Pcentre);
        c.add("South",Psouth);
       MyEvents x = new MyEvents(this);
        Aj.addActionListener(x); // Ajout de l'écouteur pour le bouton "Ajouter"
        liste.addActionListener(x);  
        setVisible(true);
 
}




public static void main(String[] args) {
	// TODO Auto-generated method stub
new MyForm();
}

}
 