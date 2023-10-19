package oop_midterms;

import java.util.ArrayList;
import java.util.Scanner;

public class BillingSystem_ninJAVAn { // These data structures functions as storage for our data in the menu and the cart. We also use them in our methods to properly relay the data to our mini database 
    private static ArrayList<Integer> itemNumbers = new ArrayList<>();
    private static ArrayList<String> itemNames = new ArrayList<>();
    private static ArrayList<Double> itemPrices = new ArrayList<>();
    private static ArrayList<Integer> itemStocks = new ArrayList<>();
    
    private static final int MAX_USERS = 10; // Maximum number of users
    private static String[][] users = new String[MAX_USERS][2]; // 2D array to store user data (username, password)
    private static int userCount = 0;

    private static ArrayList<Integer> cartItemNumbers = new ArrayList<>();
    private static ArrayList<Integer> cartQuantities = new ArrayList<>();
    

    
    public static void main(String[] args) {
        initializeMenu();
        displayLoginMenu();
    }

    private static void initializeMenu() { // these lines of codes adds values to the data structures above creating a mini database for our menu
        itemNumbers.add(1);itemNames.add("B1T1 burger");itemPrices.add(35.0);itemStocks.add(15);
        itemNumbers.add(2);itemNames.add("Burger");itemPrices.add(25.0);itemStocks.add(13);
        itemNumbers.add(3);itemNames.add("B1T1 Cheese Burger");itemPrices.add(45.0);itemStocks.add(16);
        itemNumbers.add(4);itemNames.add("Cheese Burger");itemPrices.add(30.0);itemStocks.add(11);
        itemNumbers.add(5);itemNames.add("Ham and Cheese Sandwich");itemPrices.add(30.0);itemStocks.add(20);
        itemNumbers.add(6);itemNames.add("Ham and Egg Sandwich");itemPrices.add(40.0);itemStocks.add(12);
        itemNumbers.add(07);itemNames.add("Ham and Egg with Cheese Sandwich");itemPrices.add(45.0);itemStocks.add(19);
        itemNumbers.add(8);itemNames.add("Chimichanggas");itemPrices.add(70.0);itemStocks.add(23);
        itemNumbers.add(9);itemNames.add("Spaghetti");itemPrices.add(70.0);itemStocks.add(14);
        itemNumbers.add(10);itemNames.add("Fries");itemPrices.add(60.0);itemStocks.add(17);
        itemNumbers.add(11);itemNames.add("Cheesy Meaty Fries");itemPrices.add(60.0);itemStocks.add(22);
        itemNumbers.add(12);itemNames.add("Nachos");itemPrices.add(60.0);itemStocks.add(18);
        itemNumbers.add(13);itemNames.add("Siomai");itemPrices.add(20.0);itemStocks.add(15);
        itemNumbers.add(14);itemNames.add("Siopao");itemPrices.add(25.0);itemStocks.add(21);
        itemNumbers.add(15);itemNames.add("Kikiam");itemPrices.add(20.0);itemStocks.add(16);
        itemNumbers.add(16);itemNames.add("Bottled Water");itemPrices.add(10.0);itemStocks.add(24);
        itemNumbers.add(17);itemNames.add("Milktea");itemPrices.add(70.0);itemStocks.add(12);
        itemNumbers.add(18);itemNames.add("Fruit Tea");itemPrices.add(60.0);itemStocks.add(20);
        itemNumbers.add(19);itemNames.add("Lemon Iced Tea");itemPrices.add(25.0);itemStocks.add(14);
        itemNumbers.add(20);itemNames.add("House Blend");itemPrices.add(25.0);itemStocks.add(19);
        itemNumbers.add(21);itemNames.add("Red Iced Tea");itemPrices.add(25.0);itemStocks.add(16);
        itemNumbers.add(22);itemNames.add("Calamansi Juice");itemPrices.add(25.0);itemStocks.add(23);
        itemNumbers.add(23);itemNames.add("Cucumber Lime");itemPrices.add(25.0);itemStocks.add(17);
        itemNumbers.add(24);itemNames.add("Pink Lemonade");itemPrices.add(25.0);itemStocks.add(13);
        itemNumbers.add(25);itemNames.add("Blue Lemonade");itemPrices.add(25.0);itemStocks.add(20);
        itemNumbers.add(26);itemNames.add("Coffee");itemPrices.add(15.0);itemStocks.add(15);
        itemNumbers.add(27);itemNames.add("Mountain Dew");itemPrices.add(20.0);itemStocks.add(22);
        itemNumbers.add(28);itemNames.add("Sotanghon Guisado");itemPrices.add(150.0);itemStocks.add(18);
        itemNumbers.add(29);itemNames.add("Bihon Guisado");itemPrices.add(150.0);itemStocks.add(21);
        itemNumbers.add(30);itemNames.add("Bam E Pansit");itemPrices.add(150.0);itemStocks.add(16);
        itemNumbers.add(31);itemNames.add("Batchoy");itemPrices.add(50.0);itemStocks.add(19);


        users = new String[10][2]; // Initialize the 2D array to store up to 10 users (each has 2 columns: username, password)
        users[0] = new String[]{null, null}; // Initialize the first user
 

    }

    private static void displayLoginMenu() { //method for displaying the menu
        Scanner scanner = new Scanner(System.in);
        while (true) { //a loop for repeatedly displaying the login menu until the user picks to exit
            System.out.println("Welcome to JADA'S CAFE");
            System.out.println("---------------------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    registerUser(scanner); // calls the registerUser method               
                    break;
                case 2:    
                    loginUser(scanner); // calls the loginUser method
                    break;
                case 3:
                    System.out.println("Thank you for shopping with us. Goodbye!");
                    System.exit(0); //ends the program
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    private static void registerUser(Scanner scanner) { //method for registering a new user
        System.out.println("\nUser Registration");
        System.out.println("------------------");

        if (userCount < MAX_USERS) { //checks if the current number of registered users (userCount) is less than the max number of users (MAX_USERS)
            System.out.print("Enter a username: ");
            String username = scanner.next();

            if (isUsernameTaken(username)) { //checks if the username is already taken by calling the isUsernameTaken method
                System.out.println("Oops! It looks like someone already has the username you entered. Please try a different one.");
                return;
            }

            System.out.print("Enter a password: "); //if username is not taken, registration process proceeds
            String password = scanner.next();

            users[userCount][0] = username; // username and password will be stored in this 2D array after successful registration
            users[userCount][1] = password;
            userCount++; //userCount is incremented to keep track of the number of users
            System.out.println("Congratulations, your registration was successful!");
        } else {
            System.out.println("Sorry, we've reached our user capacity. New user registrations are temporarily unavailable."); //if userCount reaches 10 (max), and exceeds, this message will be prompt
        }
    }

    private static boolean isUsernameTaken(String username) { //method for checking whether a given username is already taken in the system
        for (int i = 0; i < userCount; i++) {  //loop traverses the array to check if there are similar usernames in the system by checking the index
            if (users[i][0] != null && users[i][0].equals(username)) { //checks if the username at the current index i is not null to avoid an exception, checks if the username at the current index i is equal to the provided username
                return true; //works with registerUser for prompt
            }
        }
        return false; // continue registration
    }

    private static void loginUser(Scanner scanner) { // method for allowing registered user to log in
        System.out.println("\nUser Login");
        System.out.println("-----------");
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        for (int i = 0; i < users.length; i++) { //a for loop to iterate through the array of registered users
            if (users[i][0] != null && users[i][0].equals(username) && users[i][1].equals(password)) { // checks if the user is really registered by !=null then compares the name and password
                displayProductMenu(scanner); // after confirming all are true calls the displayProductMenu method
                return;
            }
        }

        System.out.println("The username or password you provided is incorrect. Try again, please.");
    }

    private static void displayProductMenu(Scanner scanner) { // we used this method to display the menu for the user.
        while (true) {
            System.out.println("\nProduct Menu");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Item Number |           Product Name            |  Price  | Available Stock");
            System.out.println("---------------------------------------------------------------------------");

            for (int i = 0; i < itemNumbers.size(); i++) {
                System.out.printf("%-11s | %-33s | P%-6.2f | %d\n", itemNumbers.get(i), itemNames.get(i), itemPrices.get(i), itemStocks.get(i)); // we used printf to print the menu in a more organized and understandable manner.
            }

            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Cart: ");
            for(int i=0; i<cartItemNumbers.size(); i++) { // we used line 157-159 to list the items inside the user's cart and is updated everytime the user adds something to the cart, or removes something from the cart.

            	System.out.print((itemNumbers.get(cartItemNumbers.get(i)-1))+"-"+itemNames.get(cartItemNumbers.get(i)-1)+ ", ");
            }
            System.out.println("\n\n1. Add Product to Cart");
            System.out.println("2. Remove Product from Cart");
            System.out.println("3. View Invoice");
            System.out.println("4. Checkout and Pay");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    buyProduct(scanner);
                    break;
                case 2:
                    removeProduct(scanner);
                    break;
                case 3:
                    showInvoice();
                    break;
                case 4:
                    checkoutAndPay();
                    break;
                case 5:
                    System.out.println("You have been successfully logged out.");
                    clearCart(); // to clear the cart and return items to itemStocks
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    
    private static void buyProduct(Scanner scanner) {
        System.out.print("Enter the item number of the product you want to add to your cart: ");
        Integer itemNumber = scanner.nextInt();  //lets users enter the item number of the product
        int itemIndex = itemNumbers.indexOf(itemNumber); //gets the index of the item

        if (itemIndex != -1) { //ensures that only items from the list are entered
            int availableStock = itemStocks.get(itemIndex);
            System.out.print("Enter the quantity you want to add to your cart: ");
            int quantity = scanner.nextInt(); //enter the quantity of the item
            if (quantity <= availableStock) {//ensures that the quantity bought will not exceed that of the stocks
                cartItemNumbers.add(itemNumber); //adds the item number to the cart
                cartQuantities.add(quantity); //adds the quantity to the cart
                System.out.println("Added " + quantity + " " + itemNames.get(itemIndex) + "(s) to your cart.");//displays the inside of the cart
                itemStocks.set(itemIndex, itemStocks.get(itemIndex) - quantity); //diminishes the quantity from the stocks              
            } else {
                System.out.println("Not enough stock available."); //outputs the stock is not enough
            }
        } else {
            System.out.println("Product not found in the menu."); //outputs the product is not found
        }
    }

    private static void removeProduct(Scanner scanner) {
        System.out.print("Enter the item number of the product you want to remove from your cart: ");
        int itemNumber = scanner.nextInt();
        int itemIndex = itemNumbers.indexOf(itemNumber); //gets the Item number to be referenced as the index of the product
        
        for (int i = 0; i < cartItemNumbers.size(); i++) {
            if (cartItemNumbers.get(i).equals(itemNumber)) { //compares the index of the item to the index if the item in the Menu
                System.out.print("Enter the quantity you want to remove: ");
                int quantityToRemove = scanner.nextInt(); //prompts user to enter number of items to be removed
                if (quantityToRemove <= cartQuantities.get(i)) { //does not allow the quantity of items to be removed be higher to the quantity of the item in the cart
                    cartQuantities.set(i, cartQuantities.get(i) - quantityToRemove);
                    if (cartQuantities.get(i) == 0) { //removes the item completely from the cart if it is zero
                        cartItemNumbers.remove(i);
                        cartQuantities.remove(i);
                        System.out.println("Removed " + quantityToRemove + " " + itemNames.get(i) + "(s) from your cart."); //displays the items and the quantity that were removed
                        itemStocks.set(itemIndex, itemStocks.get(itemIndex) + quantityToRemove); // adds back the quantities to be removed to the stock
                    } else {
                        System.out.println("Removed " + quantityToRemove + " " + itemNames.get(i) + "(s) from your cart.");//displays the items and the quantity that were removed
                        itemStocks.set(itemIndex, itemStocks.get(itemIndex) + quantityToRemove); // adds back the quantities to be removed to the stock
                    }
                    return;
                } else {
                    System.out.println("Invalid quantity. You can't remove more than what's in your cart.");//alerts user that he/she cannot remove anymore
                }
            }
            else{
            	System.out.println("Product not found in your cart.");//alerts users that their product is not in the cart
            }
        }
        
    }
    
    private static void showInvoice() { //we used this method to show the invoice to assess the total quantities of the items and each of their prices
        if (cartItemNumbers.isEmpty()) { //checks if the cart is empty
            System.out.println("\nYour cart is empty."); //outputs that the cart is empty
        } else {
            System.out.println("\nInvoice");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("           Product Name           |  Price  | Quantity | Item Total");
            System.out.println("-------------------------------------------------------------------");//outputs the table
            for (int i = 0; i < cartItemNumbers.size(); i++) {//loops until all the products inside the cart are displayed
                int itemIndex = itemNumbers.indexOf(cartItemNumbers.get(i));
                double price = itemPrices.get(itemIndex);
                int quantity = cartQuantities.get(i);
                System.out.printf("%-33s | P%-6.2f | %d        | P%.2f\n", itemNames.get(itemIndex), price, quantity, price * quantity); //outputs the Product name, price, quantity purchased, and amount to pay
            }
            System.out.println("-------------------------------------------------------------------");
        }
    }

    private static void checkoutAndPay() { //this method sums up the total price of the transaction
        if (cartItemNumbers.isEmpty()) {
            System.out.println("\nYour cart is empty. Nothing to checkout."); //this line prevents error by checking if the cart actually contains something
        } else {
            double totalAmount = 0;
            System.out.println("\nCheckout and Payment"); //this acts as  receipt and summarizes the transaction
            System.out.println("-------------------------------------------------------------------");
            System.out.println("           Product Name           |  Price  | Quantity | Item Total");
            System.out.println("-------------------------------------------------------------------");
            for (int i = 0; i < cartItemNumbers.size(); i++) {
                int itemIndex = itemNumbers.indexOf(cartItemNumbers.get(i));//these codes from 273-276 collects the data that we need for easier use.
                double price = itemPrices.get(itemIndex);
                int quantity = cartQuantities.get(i);
                System.out.printf("%-33s | P%-6.2f | %d        | P%.2f\n", itemNames.get(itemIndex), price, quantity, price * quantity);
                totalAmount += price * quantity;
                
            }
            System.out.println("-------------------------------------------------------------------");
            System.out.printf("Total Purchase Amount: P%.2f\n", totalAmount);

 
            cartItemNumbers.clear(); //after the transaction, we cleared the cart for it to be used by another user log in. Without this, the next user would have the previous users items to the cart right after logging in
            cartQuantities.clear(); //clears the quantity of items inside the cart
            System.out.println("Thank you for your purchase! Your order has been successfully processed."); //outputs the GRANDTOTAL of the purchase
        }
    }
    
    private static void clearCart() { // responsible for removing all the items from the user's cart and restoring the quantities of those items back to the available stock in the store's inventory if the user logs out without checking out and paying.
        for (int i = 0; i < cartItemNumbers.size(); i++) { //this loop traverses the items in the cart which then retrieves the index of the current item in the cart from the cartItemNumbers list that correspondingly came from itemNumbers.
            int itemIndex = itemNumbers.indexOf(cartItemNumbers.get(i));
            int quantity = cartQuantities.get(i);  //retrieves the quantity of the same item from the cartQuantities (of user) list, represents the quantity the user has added in the cart
            itemStocks.set(itemIndex, itemStocks.get(itemIndex) + quantity); //updates the available stock for the item in the store's inventory by adding back the quantity that the user had in their cart
        }
        cartItemNumbers.clear(); //removes all the items and their quantities from the cart,
        cartQuantities.clear();
    }
}
