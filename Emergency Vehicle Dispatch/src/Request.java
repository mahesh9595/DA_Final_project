import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Request extends JFrame {

	JTable jt2;
    String [] column_headers= {"ID", "type", "zipcode"};
    String [][] request_table = {{"1", "1", "64149"}, {"2", "1 ", "66109"}, {"3","3", "64109"}, {"4","3", "64110"}, {"5","2", "64109"}};
public Request()
{
	jt2 = new JTable(request_table, column_headers);
	jt2.setBounds(100,200,300,400);
	JScrollPane js = new JScrollPane(jt2);
	this.add(js);
	this.setSize(400,500);
	this.setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Request();
	}

}
