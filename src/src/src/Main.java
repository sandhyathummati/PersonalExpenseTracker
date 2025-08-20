import java.util.Scanner;


public class Main {
public static void main(String[] args) {
ExpenseManager manager = new ExpenseManager();
Scanner sc = new Scanner(System.in);


while (true) {
System.out.println("\n1. Add Expense");
System.out.println("2. Show Expenses");
System.out.println("3. Show Total Expense");
System.out.println("4. Exit");
System.out.print("Choose an option: ");
int choice = sc.nextInt();
sc.nextLine(); // consume newline


switch (choice) {
case 1:
System.out.print("Enter category: ");
String category = sc.nextLine();
System.out.print("Enter amount: ");
double amount = sc.nextDouble();
sc.nextLine(); // consume newline
System.out.print("Enter description: ");
String desc = sc.nextLine();
manager.addExpense(new Expense(category, amount, desc));
break;
case 2:
manager.showExpenses();
break;
case 3:
manager.showTotalExpense();
break;
case 4:
System.out.println("Exiting... Goodbye!");
System.exit(0);
default:
System.out.println("Invalid choice!");
}
}
}
}
