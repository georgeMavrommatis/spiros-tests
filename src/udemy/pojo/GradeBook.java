package udemy.pojo;
//ΔΗΛΩΣΗ ΚΛΑΣΗΣ ΚΑΙ ΜΕΘΟΔΟΥ ΜΕ ΠΑΡΑΜΕΤΡΟ

/*Δεν έχουμε τη βασική μέθοδο εκτέλεσης του
προγράμματος, ωστόσο έχουμε την GradebookTest
κλάση (εντός της οποίας υπάρχει η main
που θα ελέγξει την εκτέλεση) και τη μεταβλητή
της έκφρασης στιγμιότυπου που θα καλέσει
τη μέθοδο displayMessage*/
/**
*<pre>
* This is Javadoc
* This is a link <a href="https://www.oracle.com/uk/technical-resources/articles/java/javadoc-tool.html">Link<a/>
*</pre>
* @author Your Name
*/
public class GradeBook {
    public void displayMessage(String courseName){
        /*Η μέθοδος displayMessage εμπεριέχει τον
        access modifier, τον type of redundant return
        και την παράμετρο της μεθόδου*/

        System.out.println("Welcome to the grade book for " + courseName);
        /*Η παράμετρος αυτή θα πάρει τιμή-όρισμα από την κλάση ελέγχου*/
    }
}
