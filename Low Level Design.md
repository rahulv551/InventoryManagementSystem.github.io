# InventoryManagementSystem.github.io
Here's a low-level design of the Inventory Management System:

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


Detailed Method Description:

	- addProduct(String product, int quantity):
	    - If the `product` exists in the `inventory`:
	        - Get the current quantity from the `inventory`.
	        - Add the new `quantity` to the current quantity.
	        - Update the `inventory` with the updated quantity.
	    - Else:
	        - Add the `product` to the `inventory` with the specified `quantity`.

	- sellProduct(String product, int quantity):
	    - If the `product` exists in the `inventory`:
	        - Get the current quantity from the `inventory`.
	        - If the current quantity is greater than or equal to the `quantity` to sell:
	            - Deduct the sold `quantity` from the current quantity.
	            - Update the `inventory` with the updated quantity.
	            - Display a success message.
	        - Else:
	            - Display an error message indicating insufficient quantity.
	    - Else:
	        - Display an error message indicating that the product is not found in the inventory.

	- displayInventory():
	    - If the `inventory` is empty:
	        - Display a message indicating that the inventory is empty.
	    - Else:
	        - Display the inventory in the following format:
	          - Product1 - Quantity1
	          - Product2 - Quantity2
	          - ...

	- main(String[] args):
	    - Create an instance of the `InventoryManagementSystem` class.
	    - Start an infinite loop to handle user interaction until the user chooses to quit:
	        - Display a menu of options for the user to choose from.
	        - Read the user's choice from the console.
	        - Based on the choice, invoke the corresponding method:
	          - For option 1: Prompt for product name and quantity, and call `addProduct()` with the provided values.
	          - For option 2: Prompt for product name and quantity to sell, and call `sellProduct()` with the provided values.
	          - For option 3: Call `displayInventory()`.
	          - For option 4: Display an exit message and terminate the program.
	          - For any other invalid option: Display an error message.
    
	
	
This low-level design provides a more detailed description of the methods, their responsibilities, and the flow of control within the InventoryManagementSystem class. It outlines the logic and operations performed in each method and guides the implementation at a finer level of detail.	