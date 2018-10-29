package base;

import java.util.Set;
import java.util.TreeMap;

public class CollectionTest {

    public static void main(String[] args) {

        //AltaMetoda();

        TreeMap<Integer, String> mapOfString = new TreeMap<>();

        mapOfString.put(2, "second");
        mapOfString.put(3, "third");
        mapOfString.put(1, "first");

        //modify by key
        mapOfString.put(1, "newfirst");

        Set<Integer> keys = mapOfString.keySet();


        System.out.println("Keys: " + mapOfString.keySet());
        System.out.println("values: " + mapOfString.values());

        for (int key : keys) {

            System.out.println(key + ":" + mapOfString.get(key));

            // keys.forEach(System.out::println);
        }

    }

// --Commented out by Inspection START (29/10/2018 17:50):
//    private static void AltaMetoda() {
//        ArrayList<String> listOfStrings = new ArrayList<>();
//
//        listOfStrings.add("first");
//        listOfStrings.add("second");
//        listOfStrings.add("third");
//
//
//        for (String listOfString : listOfStrings) {
//            System.out.println(listOfString);
//        }
//    }
// --Commented out by Inspection STOP (29/10/2018 17:50)
}
