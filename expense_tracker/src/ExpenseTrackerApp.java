import javax.swing.table.DefaultTableModel;

/**
 * The ExpenseTrackerApp class allows users to add/remove daily transactions.
 */
public class ExpenseTrackerApp {

    public static void main(String[] args) {

        // Create MVC components
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Serial");
        tableModel.addColumn("Amount");
        tableModel.addColumn("Category");
        tableModel.addColumn("Date");

        ExpenseTrackerView view = new ExpenseTrackerView(tableModel);

        // Initialize view
        view.setVisible(true);

        // Handle add transaction button clicks
        view.getAddTransactionBtn().addActionListener(e -> {

            // Get transaction data from view
            double amount = view.getAmountField();
            String category = view.getCategoryField();

            // Validate both fields
            if (!InputValidation.validateAmt(amount)) {
                System.out.println("Amount entered is not valid!");
                return;
            }
            if (!InputValidation.validateCategory(category)) {
                System.out.println("Category entered is not valid!");
                return;
            }

            // Create transaction object
            Transaction t = new Transaction(amount, category);

            // Call controller to add transaction
            view.addTransaction(t);
        });
    }
}
