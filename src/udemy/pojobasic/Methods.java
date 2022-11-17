package udemy.pojobasic;

public class Methods {
    public static void main(String[] args){

        /*FIRST STEP: 7-16 lines of code
        int a = 5;
        int b = 3;
        System.out.println(a * b);

        int d = 5;
        int e = 4;
        System.out.println(d * e);

        int sum = ((a * b) + (d * e));
        System.out.println("The sum is: " +sum);*/

        /*SECOND STEP: MORE OPERATIONS IN LESS LINES*/

        multiply(5, 3);
        multiply(199, 45);
        curse();
        divide(5, 2);

    }
    public static void multiply(int a, int b){
        System.out.println(a * b);
    }
    public static void divide(float a, float b){
        System.out.println(a / b);
    }
    public static void curse(){
        System.out.println("     Shame on you!!!");

    }
}
