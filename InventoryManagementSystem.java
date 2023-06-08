package rv;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {
    
    private Map<String, Integer> inventory;
    
    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }
    
    public void addProduct(String product, int quantity) {
        if (inventory.containsKey(product)) {
            int currentQuantity = inventory.get(product);
            inventory.put(product, currentQuantity + quantity);
        } else {
            inventory.put(product, quantity);
        }
        System.out.println("Product added successfully!");
    }
    
    public void sellProduct(String product, int quantity) {
        if (inventory.containsKey(product)) {
            int currentQuantity = inventory.get(product);
            if (currentQuantity >= quantity) {
                inventory.put(product, currentQuantity - quantity);
                System.out.println("Product sold successfully!");
            } else {
                System.out.println("Insufficient quantity. Unable to sell the product.");
            }
        } else {
            System.out.println("Product not found in inventory.");
        }
    }
    
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();
        
        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. Sell product");
            System.out.println("3. Display inventory");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from the input
            
            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    inventoryManagementSystem.addProduct(productName, quantity);
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    String productToSell = scanner.nextLine();
                    System.out.print("Enter quantity to sell: ");
                    int sellQuantity = scanner.nextInt();
                    inventoryManagementSystem.sellProduct(productToSell, sellQuantity);
                    break;
                case 3:
                    inventoryManagementSystem.displayInventory();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
    }
}

