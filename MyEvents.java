package revision;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyEvents implements  ActionListener  {
	MyForm mf;
	DataBase db;
	public MyEvents(MyForm mf) {
	    this.mf = mf;
	    db=new DataBase();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource()==mf.Aj)
	    {
	        personne p =new personne(mf.nomT.getText(),(String)mf.pGenre.getSelectedItem());
	        int res=db.ajouter(p);
	        if(res>0){
	            System.out.println("ok");
	        }
	        else {
	            System.out.println(" not ok");
	        }
	    }
	else if (e.getSource()==mf.liste)
	{     new MyList();
	  
	}

	    
	}

}
