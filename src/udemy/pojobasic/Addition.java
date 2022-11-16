package udemy.pojobasic;
//ΠΡΟΓΡΑΜΜΑ ΠΡΟΣΘΕΣΗΣ ΑΚΕΡΑΙΩΝ

import java.util.Scanner;
/*α)Δήλωση import + πακέτο βιβλιοθήκης της java
java.util, ώστε να χρησιμοποιήσουμε την έτοιμη κλάση
εκχώρησης χαρακτήρων από το πληκτρολόγιο του χρήστη*/

public class Addition {

    public static void main( String[] args ) {

    Scanner input = new Scanner(System.in);
    /*β)Πρόταση εκχώρησης-αρχικοποίησης μεταβλητής
    όπου έχουμε με σειρά: τον τύπο, το όνομα, τον
    τελεστή της εκχώρησης, τη λέξη κλειδί, το αντικείμενο
    Scanner και το κανάλι εισόδου (input stream)*/

    int number1;
    int number2;
    int sum;
    /*γ)Πρόταση δήλωσης τύπου και ονόματος μεταβλητής
    βάσει της σειράς εκχώρησης*/

    System.out.println( "Enter first integer: "  );
    number1= input.nextInt();
    /*δ)η γραμμή 26 χρησιμοποιεί τη μέθοδο nextInt() της κλάσης
    Scanner(αντικειμένου input), για να δεχθεί έναν ακέραιο
    από τον χρήστη*/
    System.out.println( "Enter Second integer: "  );
    number2= input.nextInt();

    sum= number1 + number2;
    System.out.println("The result is: " + sum);
    /*ε)Συμβολοσειρά μορφοποίησης:printf +Προσδιοριστικό
    μορφοποίησης: %d*/
    }
    //Τέλος μεθόδου
}
//Τέλος κλάσης
