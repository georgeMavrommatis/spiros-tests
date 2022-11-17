package udemy.pojobasic;
//ΠΡΟΓΡΑΜΜΑ ΕΜΦΑΝΙΣΗΣ ΚΕΙΜΕΝΟΥ

/* 1) Δύο προτάσεις σε μία γραμμή.
   2) Μία πρόταση σε πολλές γραμμές με ενδοπαραγραφοποίηση.
   2α) Πρώτα με τη βασική μέθοδο.
   2β) Έπειτα με τη μέθοδο printf.*/

public class WelcomeTwo {

    public static void main(String[] args) {

        System.out.print( "Welcome to " );
        System.out.println("Java Programming" );
        System.out.println("\n I'm just\n keeding you guys!" );
        System.out.printf(" %s\n %s\n ", "xaxaxa",  "xaxaxaxa!" );

    } //Τέλος μεθόδου: main
} //Τέλος κλάσης: WelcomeTwo
