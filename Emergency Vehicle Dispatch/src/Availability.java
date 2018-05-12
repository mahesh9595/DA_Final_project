import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Availability extends JFrame {

	JTable jt3;
    String [] column_headers= {"vehicle id", "type", "availability", "zipcode"};
    String [][] check_table = {{"1", "1", "A", "64151"}, {"2","1","A", "64151"},{"3", "1", "NA", "64151"}, {"4", "2", "NA", "64151"}, {"5", "3", "NA", "64151"}, {"6", "3", "A", "64151"}, {"7", "1", "A", "64149"}, {"8", "2", "NA", "64149"}, {"9", "1", "A", "64110"}, {"10", "1", "NA", "64110"}};
    
public Availability()
{
	jt3 = new JTable(check_table, column_headers);
	jt3.setBounds(100,200,300,400);
	JScrollPane js = new JScrollPane(jt3);
	this.add(js);
	this.setSize(400,500);
	this.setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new Availability();
	}

}
