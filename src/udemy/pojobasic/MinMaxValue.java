package udemy.pojobasic;

public class MinMaxValue {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Underflowed Minimum Value = " + (myMinIntValue - 1));
        System.out.println("Overflowed Maximum Value = " + (myMaxIntValue + 1));
        int myTest = 2147483647;
        String str =  "Integer Minimum Value = " + myMinIntValue;
        Integer k = new Integer(4);
        System.out.println(k);
    }
}
