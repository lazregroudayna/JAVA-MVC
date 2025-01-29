package revision;
import javax.swing.table.DefaultTableModel;
import java.sql.* ;
public class DataBase {
    private Statement stm ;
   private  Connection conn ;

   public DataBase() {
       try {
       	Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           System.out.println("Erreur Pilote: " + e.getMessage());
       }
       try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/projet2java","root","");
           System.out.println("Connected to DataBase"  );

       } catch (SQLException e) {
           System.out.println("Erreur Connection: " + e.getMessage());
       }
		try {
			stm = conn.createStatement();
		}catch(Exception e1) {System.out.println("Erreur Stm");}
   }

   public int ajouter(personne p) {
       String query = "INSERT INTO personne (nom, genre) VALUES (?, ?)";
       try (PreparedStatement pst = conn.prepareStatement(query)) {
           pst.setString(1, p.getNom());
           pst.setString(2, p.getGenre());
           return pst.executeUpdate();
       } catch (SQLException e) {
           System.out.println("Error inserting user: " + e.getMessage());
           return 0;
       }
   }
   
      public int remplir(DefaultTableModel model) {
   	   model.setRowCount(0);
   	   String cmd = "Select * from personne order by nom";	
   	   try {
   		   ResultSet res = stm.executeQuery(cmd);
   		   while(res.next()) {
   			   model.addRow(new Object[] {
   					   res.getString(1),
   					   res.getString(2),
   					   res.getString(3)
   			   });
   		   }
   	   }catch(Exception e) {}
           return 0;

   }  
}