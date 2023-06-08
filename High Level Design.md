# InventoryManagementSystem.github.io
Here's a high-level design of the Inventory Management System:

Class: InventoryManagementSystem

Responsibilities:
Maintain the inventory by adding and selling products.
Display the current inventory status.
Handle user input and interaction.
Attributes:
inventory: A map to store the products and their quantities.
Methods:

addProduct(String product, int quantity): Adds a product to the inventory. If the product already exists, updates the quantity.
sellProduct(String product, int quantity): Sells a product from the inventory. Checks if the product exists and has sufficient quantity before deducting the sold quantity.
displayInventory(): Displays the current inventory status.
main(String[] args): The entry point of the application. Handles user input and interaction.
User Interface:

The user is presented with a menu of options.
The user can select an option by entering the corresponding number.
Based on the selected option, the system invokes the appropriate method to perform the desired action.
Error Handling:

Handle invalid user input, such as non-numeric or out-of-range options.
Check for sufficient quantity before selling a product.
Provide appropriate error messages for exceptional scenarios.
Class Diagram:

+----------------------+
|  InventoryManagement |
|  System              |
+----------------------+
|  - inventory: Map    |
+----------------------+
|  + addProduct()      |
|  + sellProduct()     |
|  + displayInventory()|
|  + main()            |
+----------------------+


This high-level design outlines the key components and interactions in the Inventory Management System. It provides an overview of the classes, their responsibilities, and the flow of control.