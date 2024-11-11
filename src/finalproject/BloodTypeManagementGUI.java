
package finalproject;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class BloodTypeManagementGUI {
    private JFrame frame;
    private JTable table;
    private JTextField rhFactorField;
    private JComboBox<BloodGroup> bloodGroupComboBox;
    private Inventory inventory;
    private BloodTypeManager manager;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BloodTypeManagementGUI().frame.setVisible(true));
    }

    public BloodTypeManagementGUI() {
        inventory = new Inventory();
        manager = new BloodTypeManager(inventory);

        frame = new JFrame("Blood Type Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Setup table
        table = new JTable(new DefaultTableModel(new Object[] {"Blood Group", "Rh Factor", "Status"}, 0));
        frame.add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel panel = new JPanel(new FlowLayout());
        bloodGroupComboBox = new JComboBox<>(BloodGroup.values());
        panel.add(new JLabel("Blood Group:"));
        panel.add(bloodGroupComboBox);

        rhFactorField = new JTextField(3);
        panel.add(new JLabel("Rh Factor (+ or -):"));
        panel.add(rhFactorField);

        JButton addButton = new JButton("Add Blood Type");
        addButton.addActionListener(e -> addBloodType());
        panel.add(addButton);

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.addActionListener(e -> checkoutBloodProduct());
        panel.add(checkoutButton);

        JButton returnButton = new JButton("Return");
        returnButton.addActionListener(e -> returnBloodProduct());
        panel.add(returnButton);

        frame.add(panel, BorderLayout.SOUTH);
        frame.pack();
    }

    private void addBloodType() {
        String rhFactor = rhFactorField.getText().trim();
        if (rhFactor.equals("+") || rhFactor.equals("-")) {
            BloodGroup selectedGroup = (BloodGroup) bloodGroupComboBox.getSelectedItem();
            BloodType bloodType = new BloodType(selectedGroup, rhFactor);
            BloodProduct product = new BloodProduct(bloodType, new ProcessingDate(java.time.LocalDate.now()), 
                                                     new ExpirationDate(java.time.LocalDate.now().plusDays(30)));
            inventory.addProduct(product);
            updateTable();
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid Rh factor!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void checkoutBloodProduct() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            BloodProduct product = inventory.getProducts().get(selectedRow);
            manager.checkoutBloodProduct(product);
            updateTable();
        }
    }

    private void returnBloodProduct() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            BloodProduct product = inventory.getProducts().get(selectedRow);
            manager.returnBloodProduct(product);
            updateTable();
        }
    }

    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (BloodProduct product : inventory.getProducts()) {
            model.addRow(new Object[] {
                product.getBloodType().getBloodGroup(),
                product.getBloodType().getRhFactor(),
                product.isCheckedOut() ? "Checked Out" : "Available"
            });
        }
    }
}
