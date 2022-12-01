import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Index  0  1  2  3  4
        // Array:[0, 5, 3, 2, 4] --> length 5

        // Random Objects from Array:
        // Math.abs(rand.nextInt) % length;

        // Index:   0      1      2
        // Array:["sam", "bob", "ram"] --> length 3

        // Declaring, Allocating and Initializing
        int[] intArr;
        int[] intArr2 = new int[4];
        int[] intArr3 = {5, 4, 3, 2, 1};

        String[] shoppingList = {"apples", "bananas", "grapes"};

        intArr2[0] = 10;
        intArr2[1] = 34;
        intArr2[2] = 3;
        intArr2[3] = 4;
        // intArr2[4] = 4; --> Array index out of bounds

        // Print out Arrays
        System.out.println(Arrays.toString(intArr2));
        System.out.println(Arrays.toString(intArr3));
        System.out.println();

        // Custom print out arrays
        printArray(intArr2);
        printArray(intArr3);

        // Retrieve objects
        System.out.println(intArr2[3]);
        System.out.println(Array.get(intArr2, 3));
        System.out.println();

        // Given functions
        Arrays.sort(intArr3);
        printArray(intArr3);

        // Print string array
        printArray(shoppingList);

        System.out.println("Special for loop: ");
        // for each loop
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
}