package udemy.pojo;
//ΕΛΕΓΧΟΣ ΚΛΑΣΗΣ
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        GradeBook myGradeBook = new GradeBook();
        /* Η μεταβλητή myGradeBook εκκινείται-αρχικοποιείται
         από τη στιγμιοτυπική έκφραση για τη δημιουργία
         του αντικειμένου new GradeBook της κλάσης GradeBook.
         Η λέξη-κλειδί new δημιουργεί το αντικείμενο Gradebook
         με έναν () κονστράκτορα, εντός του οποίου καθορίζονται
         τα δεδομένα του αντικειμένου*/
        System.out.println("Please enter the name of the course");
        String nameOfCourse = input.nextLine();
        System.out.println();

        myGradeBook.displayMessage(nameOfCourse);
        /* Ακριβώς όπως μπορούμε να καλέσουμε τις μεθόδους
        print (σκέτο, f, ln), χρησιμοποιώντας την προκαθορισμένη
        κλάση System και τον τελεστή της τελείας που καλεί την
        ιδιότητα out, έτσι κάνουμε και με τη μεταβλητή
        που δημιουργήσαμε στην προηγούμενη κλάση. Στην
        προκειμένη περίπτωση 1)ο κώδικας της γραμμής 21
        καλεί τη μέθοδο displayMessage της μεταβλητής myGradeBook
        και η μεταβλητή nameOfCourse γίνεται τιμή-όρισμα της παραμέτρου
        courseName της μεθόδου displayName*/
    }
}
