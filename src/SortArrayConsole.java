import java.util.Scanner;

    public class SortArrayConsole {

        public static int[] newArray() {
            Scanner inputIndex = new Scanner(System.in);
            System.out.print("Введіть довжину масиву: ");
            int arraySize = inputIndex.nextInt();
            int[] inputArrays = new int[arraySize];

            for (int i = 0; i < inputArrays.length; i++) {
                System.out.print("Введіть " + (i + 1) + " елемент: ");
                inputArrays[i] = inputIndex.nextInt();
            }

            System.out.print("Введений масив:");
            for (int inputArray : inputArrays) {
                System.out.print(" " + inputArray);
            }
            return inputArrays;
        }

        public static void sortArray(int[] insertArray) {

            for (int i = 0; i < insertArray.length - 1; i++) {
                for (int j = i + 1; j < insertArray.length; j++ ){
                    if (insertArray[i] > insertArray[j]){
                        int temp = insertArray[j];
                        insertArray[j] = insertArray[i];
                        insertArray[i] = temp;
                    }
                }
            }
            System.out.print("\nВідсортований масив:");
            for (int element : insertArray) {
                System.out.print(" " + element);
            }
            System.out.println();

            for (int i = 0; i < insertArray.length; i++) {
                System.out.println((i + 1) + "-й елемент: "  + insertArray[i]);
            }
        }
    }
