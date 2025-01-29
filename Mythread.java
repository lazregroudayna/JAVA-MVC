package revision;

public class Mythread  extends Thread{
DataBase db;
MyList l;
public Mythread(MyList l)
{
	this.l=l;
	this.db= new DataBase();
			}

public void run() {
	while(true) {
		db.remplir(l.model);
		try {
                sleep(1000);
		}
                catch (Exception e) 
                {};
	}
}



}
