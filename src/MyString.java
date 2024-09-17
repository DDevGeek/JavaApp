import java.util.ArrayList;

public class MyString {
    public static void main(String[] args) {
        ArrayList<String> myNames = new ArrayList<>();
        ArrayList<String> sameName = new ArrayList<>();
        ArrayList<Integer> counter = new ArrayList<>();

        myNames.add("jonathan");
        myNames.add("jonathan");
        myNames.add("loffi");
        myNames.add("loffi");
        myNames.add("jack");
        myNames.add("jackeline");
        myNames.add("computer");
        myNames.add("mouse");
        myNames.add("mouse");


        for (int i = 0; i < myNames.size(); i++) {
            if (sameName.contains(myNames.get(i))) {
                sameName.add(myNames.get(i));
                counter.add(i);
            }
        }





    }
}




