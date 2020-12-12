package com.technosmithlabs.roomie.userinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoomieUserInventory {
    public static void main(String[] args) {
        SpringApplication.run(RoomieUserInventory.class, args);
        System.out.println("Roomie User Inventory Module is running!");
    }
}
