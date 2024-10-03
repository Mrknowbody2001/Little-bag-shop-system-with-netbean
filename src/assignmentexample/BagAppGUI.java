import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BagAppGUI extends JFrame {
    private JTable bagTable;
    private DefaultTableModel tableModel;
    private BagAppLogics bagAppLogics;

    public BagAppGUI() {
        // Initialize components
        bagAppLogics = new BagAppLogics();
        tableModel = new DefaultTableModel(new String[] {"Bag Name", "Category", "Quantity", "Price"}, 0);
        bagTable = new JTable(tableModel);

        // Set up the layout and add components
        setLayout(new BorderLayout());
        add(new JScrollPane(bagTable), BorderLayout.CENTER);

        // Load bags into the table
        bagAppLogics.loadBagsIntoTable(tableModel);

        setTitle("Bag Inventory");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BagAppGUI().setVisible(true);
            }
        });
    }
}
