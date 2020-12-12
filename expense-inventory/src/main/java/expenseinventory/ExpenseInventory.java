package expenseinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseInventory {
    public static void main(String[] args) {
        SpringApplication.run(ExpenseInventory.class, args);
        System.out.println("Expense Inventory Module is running!");
    }
}
