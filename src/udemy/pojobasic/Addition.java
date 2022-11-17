package udemy.pojobasic;
//ΠΡΟΓΡΑΜΜΑ ΠΡΟΣΘΕΣΗΣ ΑΚΕΡΑΙΩΝ

import java.util.Scanner;


public class Addition {

    public static void main( String[] args ) {

    Scanner input = new Scanner(System.in);


    int number1;
    int number2;
    int sum;
    /*Πρόταση δήλωσης τύπου και ονόματος μεταβλητής
    βάσει της σειράς εκχώρησης*/

    System.out.println( "Enter first integer: "  );
    number1= input.nextInt();

    System.out.println( "Enter Second integer: "  );
    number2= input.nextInt();

    sum= number1 + number2;
    System.out.println("The result is: " + sum);
    /*Συμβολοσειρά μορφοποίησης:printf +Προσδιοριστικό
    μορφοποίησης: %d*/
    }//Τέλος μεθόδου
}//Τέλος κλάσης
