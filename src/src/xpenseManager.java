import java.util.ArrayList;
import java.util.List;


public class ExpenseManager {
private List<Expense> expenses;


public ExpenseManager() {
expenses = new ArrayList<>();
}


public void addExpense(Expense expense) {
expenses.add(expense);
}


public void showExpenses() {
if (expenses.isEmpty()) {
System.out.println("No expenses recorded yet.");
} else {
System.out.println("Your Expenses:");
for (Expense e : expenses) {
System.out.println(e);
}
}
}


public void showTotalExpense() {
double total = 0;
for (Expense e : expenses) {
total += e.getAmount();
}
System.out.println("Total Expense: $" + total);
}
}
