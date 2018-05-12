import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TestTableSortFilter extends JPanel {

    private String[] columnNames
            = {"vehicle id", "type", "availability", "zipcode"};

    private Object[][] data = {
        {1, 1, "AV,", 64151},
        {2, 1, "AV", 64151},
        {3, 1, "NA", 64151},
        {4, 2, "NA", 64151 },
        {5, 3, "NA", 64151},
        {6, 3, "AV", 64151},
        {7, 1, "AV", 64149},
        {8, 2, "NA", 64149},
        {9, 1, "NA", 64110},
        {10, 1, "AV", 64110},
        {11, 2, "NA", 64110},
        {13, 3, "NA", 64110},
        {14, 1, "AV", 64109},
        {15, 2, "AV", 64109},
        {16, 2, "AV", 64109},
        {17, 3, "NA", 64109},
        {18, 3, "NA", 64109},
        {19, 1, "AV", 66109},
        {20, 2, "AV", 66109},
        {21, 3, "NA", 66109}
    };

    private DefaultTableModel model = new DefaultTableModel(data, columnNames);
    private JTable jTable = new JTable(model);

    private TableRowSorter<TableModel> rowSorter
            = new TableRowSorter<>(jTable.getModel());

    private JTextField jtfFilter = new JTextField();
    private JButton jbtFilter = new JButton("Filter");

    public TestTableSortFilter() {
        jTable.setRowSorter(rowSorter);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("Specify a word to match:"),
                BorderLayout.WEST);
        panel.add(jtfFilter, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.SOUTH);
        add(new JScrollPane(jTable), BorderLayout.CENTER);

        jtfFilter.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
               JFrame frame = new JFrame("Row Filter");
               frame.add(new TestTableSortFilter());
               frame.pack();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setLocationRelativeTo(null);
               frame.setVisible(true);
            }

        });
    }
}

