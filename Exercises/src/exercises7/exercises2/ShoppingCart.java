package exercises7.exercises2;

import exercises7.exercises1.*;
/*Exercise 7-2

1. Instantiate the StringBuilder object (sb), initializing it
     to firstName, using the StringBuilder constructor.
2. Use the append method of the StringBuilder object to append the 
     last name back onto the first name.  You can just use a String 
     literal for the last name.  
     Print the StringBuilder object and test your code.  
     It should show the full name.

Challenge:  Can you append the last name without using a String literal?
*/
/**
 *
 * @author Fabio Moscariello
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String elements[] = {"Shirt", "Scarf", "Polo"};
        boolean outOfStock = false;
        double price = 10, tax = 120;
        int quantity = 0;
        double total;
        String custName = "Mary Smith";
        String firstName;
        String lastName;
        int spaceIdx;
        
        quantity=elements.length;
        String message = custName + " wants to purchase " + quantity + " "+elements[2];
        if (quantity > 1) {
            System.out.println(message + "s");
            
        }
        if (outOfStock == false) {
            total = price * quantity * tax;
            System.out.println("Total cost with tax is: " + total);
        } else {
            System.out.println("The item is unavailable");
        }
        spaceIdx=custName.indexOf(" ");
        firstName=custName.substring(0, spaceIdx);
        StringBuilder sb= new StringBuilder(firstName);
        lastName=custName.substring(spaceIdx);
        sb.append(lastName);
        System.out.println(sb);
    }

}
