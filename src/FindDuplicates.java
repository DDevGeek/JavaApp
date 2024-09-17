//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class FindDuplicates {
//    /*
//    10- Find the Frequency of Elements
//
//    Task: Create an ArrayList of strings with some duplicate values.
//    Count the frequency of each element and print
//    the results.
//     */
//
//    public static void main(String[] args) {
//        ArrayList<String> duplicateNames = new ArrayList<>();
//        duplicateNames.add("josi");
//        duplicateNames.add("huseyin");
//        duplicateNames.add("huseyin");
//        duplicateNames.add("huseyin");
//        duplicateNames.add("huseyin");
//        duplicateNames.add("huseyin");
//        duplicateNames.add("josi");
//        duplicateNames.add("josi");
//        duplicateNames.add("wafi");
//        duplicateNames.add("wafi");
//        duplicateNames.add("dina");
//
//        ArrayList<String> uniqueNames = new ArrayList<>();
//        ArrayList<Integer> uniqueNamesCount = new ArrayList<>();
//
//        for(String name : duplicateNames) {
//            if( uniqueNames.contains(name)) {
//                int index = uniqueNames.indexOf(name);
//                uniqueNamesCount.set(index, uniqueNamesCount.get(index)+1);
//            } else {
//                uniqueNames.add(name);
//                uniqueNamesCount.add(1);
//            }
//        }
//
////        System.out.println(duplicateNames);
////        System.out.println(uniqueNames);
////        System.out.println(uniqueNamesCount);
//
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
//
//        numbers2.add(1);
//        numbers2.add(2);
//        numbers2.add(1);
//        numbers2.add(4);
//        numbers2.add(8);
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(10);
//
//
//
//        for (int num : numbers) {
//            if (!numbers.contains(num)) {
//                numbers.remove(numbers2.indexOf(num));
//            }
//        }
//
//        System.out.println(numbers);
//
//
//        System.out.println("Hello world!");
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
//
//        numbers2.add(1);
//        numbers2.add(2);
//        numbers2.add(1);
//        numbers2.add(1);
//        numbers2.add(4);
//        numbers2.add(8);
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(10);
//        numbers.add(1);
//        numbers.add(1);
//
//
//        for(int i = 0 ; i < numbers.size() ; i++){
//            if (!numbers2.contains(numbers.get(i))) {
//                numbers.remove(i);
//                i--;
//            }
//
//            if (numbers2.contains(numbers.get(i))) {
//                numbers2.remove(numbers2.indexOf(numbers.get(i)));
//            }
//        }
//        System.out.print(numbers);
//
//
//    }
//
//        public ArrayList<Integer> getSublist(ArrayList<Integer> number, int startIndex, int endIndex) {
//            ArrayList<Integer> myNums = new ArrayList<>();
//             for (int i = 0; i < endIndex - 1; i++) {
//                myNums.add(number.get(i));
//            }
//        }
//
//    }
//
//
//
//
////12. Remove Even Numbers from ArrayList
////Task: Create an ArrayList of integers. Remove all even numbers from the list and print the updated list.
//
//
