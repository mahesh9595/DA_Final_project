import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Vehicle extends JFrame {
	
	JTable jt;
	//table declarations
	String [] column_headers= {"vehicle ID", "Type", "zipcode"};
	String [][] vehicle_details = {{"1", "1", "64151"}, {"2", "1", "64151"}, {"3", "1", "64151"}, {"4", "2", "64151"}, {"5", "3", "64151"}, {"6", "3", "64151"}, {"7", "1", "64149"}, {"8", "2", "64149"}, {"9", "1", "64110"}, {"10", "1", "64110"}, {"11", "2", "64110"}, {"13", "3", "64110"}, {"14", "1", "64109"}, {"15", "2", "64109"}, {"16", "2", "64109"}, {"17", "3", "64109"}, {"18", "3", "64109"}, {"19", "1", "66109"}, {"20", "2", "66109"},{"21", "3", "66109"}};
	
	public Vehicle()
	{
		//Visualization of table
		jt = new JTable(vehicle_details, column_headers);
		jt.setBounds(100,200,300,400);
		JScrollPane js = new JScrollPane(jt);
		this.add(js);
		this.setSize(400,500);
		this.setVisible(true);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Vehicle();
	}

}
