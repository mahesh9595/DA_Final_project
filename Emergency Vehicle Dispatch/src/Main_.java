import javax.swing.JTable;

public class Main_  {
	public static void main() {
	Availability a = new Availability ();
    Request re = new Request() ;
    JTable table = a.jt3 ;
    
    for(int i = 0; i < table.getRowCount(); i++){//For each row
        for(int j = 0; j < table.getColumnCount(); j++){//For each column in that row
            if(table.getModel().getValueAt(i, j).equals("64109")){//Search the model
                System.out.println(table.getModel().getValueAt(i, j));//Print if found string
            }
        }//For loop inner
    }
	
}}