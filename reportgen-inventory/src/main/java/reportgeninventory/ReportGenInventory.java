package reportgeninventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReportGenInventory {
    public static void main(String[] args) {
        SpringApplication.run(ReportGenInventory.class, args);
        System.out.println("ReportGenInventory User Inventory Module is running!");
    }
}
