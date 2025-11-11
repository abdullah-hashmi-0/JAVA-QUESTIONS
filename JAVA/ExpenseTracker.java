import java.util.*;

class Expense {
    String date, category, description;
    double amount;

    public Expense(String date, String category, double amount, String description) {
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String toString() {
        return date + " | " + category + " | " + amount + " | " + description;
    }
}

public class ExpenseTracker {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Expense> expenses = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Total Expense");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    showTotal();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void addExpense() {
        System.out.print("Enter date (dd/mm/yyyy): ");
        String date = sc.nextLine();
        System.out.print("Enter category: ");
        String category = sc.nextLine();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();  
        System.out.print("Enter description: ");
        String description = sc.nextLine();

        Expense newExpense = new Expense(date, category, amount, description);
        expenses.add(newExpense);

        System.out.println("Expense added successfully!");
    }

    public static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }

        System.out.println("\nDate | Category | Amount | Description");
        System.out.println("-------------------------------------------");
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public static void showTotal() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.amount;
        }

        System.out.println("\nTotal Expense: " + total);
    }
}