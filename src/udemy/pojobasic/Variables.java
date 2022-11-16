package udemy.pojobasic;

public class Variables {

    public static void main(String[] args) {

        int myFirstNumber = (10 + 5) + (25 * 5);
        int mySecondNumber = (35 + 32) + 15;
        int myThirdNumber = myFirstNumber - 9;
        int myTotalNumber = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotalNumber);
        int myDeduction = 1000 - myTotalNumber;
        System.out.println(myDeduction);
    }
}
