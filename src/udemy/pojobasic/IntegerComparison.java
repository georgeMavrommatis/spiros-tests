package udemy.pojobasic;
//ΠΡΟΓΡΑΜΜΑ ΣΥΓΚΡΙΣΗΣ ΑΚΕΡΑΙΩΝ ΑΡΙΘΜΩΝ

import java.util.Scanner;

public class IntegerComparison {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int number1;
        int number2;


        System.out.print("Enter fisrt integer: " );
        number1 = input.nextInt();

        System.out.print("Enter Second integer: " );
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.printf("%d == %d\n",  number1 , number2);
        if (number1 != number2)
            System.out.println(" != " + number1 + number2);
        if (number1 < number2)
            System.out.println(" < " + number1 + number2);
        /*α)Στην δεύτερη και τρίτη πρόταση εξόδου έχουμε τη μέθοδο println
        και ακολούθως τα ορίσματά μας*/

        if (number1 > number2)
            System.out.printf("%d > %d\n", number1 , number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1 , number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1 , number2);
        /*β)Στις τρεις τελευταίες προτάσεις εξόδου έχουμε τη μέθοδο printf
        και ακολούθως τα ορίσματά μας*/
    }
    //Τέλος μεθόδου
}
//Τέλος κλάσης
