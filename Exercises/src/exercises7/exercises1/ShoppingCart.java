package exercises7.exercises1;

/*
Exercise 7-1

1. Use the indexOf method to get the index for the space character (" ")
     within custName.  Assign it to spaceIdx.
2. Use the substring method and the spaceIdx to get the first name
     portion of custName.  Assign it to firstName.  Print firstName.
package exercises7;
/*
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
        System.out.println(firstName);
    }

}
