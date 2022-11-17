package udemy.pojo;
//ΔΗΛΩΣΗ ΚΛΑΣΗΣ ΚΑΙ ΜΕΘΟΔΟΥ ΜΕ ΠΑΡΑΜΕΤΡΟ
/*Δεν έχουμε τη βασική μέθοδο εκτέλεσης του
προγράμματος, ωστόσο έχουμε την GradebookTest
κλάση(αρχείο), εντός της οποίας υπάρχει η main
που θα ελέγξει την εκτέλεση και τη μεταβλητή
της έκφρασης στιγμιότυπου που θα καλέσει
τη μέθοδο displayMessage*/

public class GradeBook {
    public void displayMessage(String courseName){
        /* Η μέθοδος displayMessage εμπεριέχει τον
        access modifier, τον type of redundant return
        και την παράμετρο της μεθόδου */

        System.out.println("Welcome to the grade book for " + courseName);
        /*Το όρισμα αυτό θα μεταβληθεί*/
    }
}
