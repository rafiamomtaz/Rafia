// Superclass Rafia
class Rafia {
    int school = 4000;    // Variable to store school fees
    int coaching = 3500;  // Variable to store coaching fees
}

// Subclass p6 which extends Rafia
public class p6 extends Rafia {
    int privateFees = 2000;  // Variable to store private fees

    // Constructor for Ans_6
    public Ans_6() {
        super();  // Call the constructor of the superclass Rafia
        this.privateFees = 2000;  // Use 'this' keyword to refer to the instance variable privateFees
    }

    public static void main(String[] args) {
        Ans_6 t = new Ans_6();  // Create an instance of the subclass Ans_6

        // Accessing and printing the variables from both the superclass and subclass
        System.out.println("Rafia's school fees: " + t.school);
        System.out.println("Rafia's coaching fees: " + t.coaching);
        System.out.println("Rafia's private fees: " + t.privateFees);
    }
}
