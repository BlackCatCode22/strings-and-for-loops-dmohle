
public class StringsAndLoops {
    public static void main(String[] args) {

        System.out.printf("\nWelcome to Strings and Loops!\n");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 20; i++) {
            System.out.println("i = " + i);
        }

        int myLoopControlVariable = 0;

        while (myLoopControlVariable <= 12){
            System.out.println("myLoopControlVariable is..." + myLoopControlVariable);
            myLoopControlVariable++;
        }

        String[] myStrArray = {"this", "that", "the other"};
        int[] myIntegerArray = {22, 33, 12, 15, 7, 1};

        for (int i = 0; i <= 5; i++) {
            System.out.println("myIntegerArray[" + i + "] = " + myIntegerArray[i]);
        }
    }
}