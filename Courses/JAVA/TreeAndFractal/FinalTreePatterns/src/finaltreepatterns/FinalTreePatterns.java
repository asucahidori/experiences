
package finaltreepatterns;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FinalTreePatterns {

    public static void main(String[] args) {
        TreeStringIntSet tree = new TreeStringIntSet();
        try {
            tree.add("Merry", 3);
            tree.add("Jerry", 5);
            tree.add("Berry", 1);
            tree.add("Cherry", 8);
            tree.add("Peter", 5);
            tree.add("Tom", 7);
            tree.add("Rose", 8);
            tree.add("York", 9);
        } catch (DuplicateValueException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
