import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class BagAppLogics {

    private static final String FILE_PATH = "E:\\icbt assignment\\sem2\\sem 2.2\\oop\\AssignmentExample\\bags.txt";

    public void loadBagsIntoTable(DefaultTableModel tableModel) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bagData = line.split(",");
                tableModel.addRow(bagData);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading bags data: " + e.getMessage());
        }
    }
}
