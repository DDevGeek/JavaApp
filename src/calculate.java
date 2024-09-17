import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class calculate {
    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<>(Arrays.asList(1,2,3,5));
//        Collections.reverse(myNumbers);

        System.out.println(primeNumbers(2, 7));
    }

    public static ArrayList<Integer> primeNumbers(int start, int end) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }

        return numbers;
    }

//    public static int secondLargestElement(int number) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        Collections.sort(numbers);
//
//        for (int i = 0; i < 40; i++) {
//            numbers.add(i);
//        }
//
//        for (int number : numbers) {
//           if (number )
//        }
//    }


//TODO:    STADY THIS QUESTION MORE ======
//    public class SecondLargest {
//        public static void main(String[] args) {
//            ArrayList<Integer> number = new ArrayList<>();
//            number.add(5);
//            number.add(10);
//            number.add(15);
//            number.add(3);
//            number.add(40);
//            int SecondLargest = Integer.MIN_VALUE;
//            int Largest = Integer.MIN_VALUE;
//            for (int num : number) {
//                if (num > Largest) {
//                    Largest = num;
//                }
//            }
//        }
}



//Find the Second Largest Element
//Task: Create an ArrayList of integers and find the second-largest element. return the second largest element.
