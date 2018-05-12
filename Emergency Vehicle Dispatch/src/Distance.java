import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Distance extends JFrame {
	JTable jt1;
    String [] column_headers= {"zipcode-1", "zipcode-2", "distance"};
    String [][] zipcode_distances = {{"64151", "64149", "10"}, {"64151", "66109", "120"}, {"64149", "64109", "20"}, {"64149", "64110", "50"}, {"64110", "64109", "5"}, {"64109", "66109", "100"}, {"64109", "64151", "30"}, {"66109", "64149", "90"}};
  
public Distance()
{
	jt1 = new JTable(zipcode_distances, column_headers);
	jt1.setBounds(100,200,300,400);
	JScrollPane js = new JScrollPane(jt1);
	this.add(js);
	this.setSize(400,500);
	this.setVisible(true);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Distance();
	}

}
