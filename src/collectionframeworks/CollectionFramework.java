package collectionframeworks;


import java.util.*;

public class CollectionFramework {

    public void arrayListExample() {
        List<String> fruitList = new ArrayList<>();

//        ArrayList<String> fruitListExample = new ArrayList<>();

        fruitList.add("Apple");//0
        fruitList.add("Orange");//1
        fruitList.add("Banana");//2
        fruitList.add("Grapes");
        fruitList.add("Mango");
        fruitList.add("Cherry");
        fruitList.add("Apple");//Duplication allowed

        System.out.println("Fruits: " + fruitList);
        System.out.println("The size: " + fruitList.size());

        System.out.println("Element at index 1: " + fruitList.get(1));

        fruitList.remove("Cherry");
        fruitList.remove(0);

        System.out.println("After removing Cherry and 0 index: " + fruitList);
        System.out.println("The size: " + fruitList.size());

        fruitList.add("Papaya");
        fruitList.add("Papaya1");
        fruitList.add("Papaya2");

        System.out.println("After adding again: ");
        System.out.println("Fruits: " + fruitList);
        System.out.println("The size: " + fruitList.size());

        System.out.println("Iterating through ArrayList: ");

        // normal for loop
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.println(fruitList.get(i));
        }
        System.out.println("Printing with enhanced for loop: ");
        //enhanced for loop
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }

    public void arrayListWrapper() {
//        List<int> list = new ArrayList<>;
        List<Integer> integers = new ArrayList<>();
//        List<long> longs = new ArrayList<>();
        List<Long> longList = new ArrayList<>();

        integers.add(1);
        integers.add(2);
    }


    public void hashMapExample() {
        Map<String, String> countryCodes = new HashMap<>();
        Map<String, Integer> integerHashMap = new HashMap<>();
        Map<Integer, String> integerStringMap = new HashMap<>();

//        HashMap<String, String> countryCodesHash = new HashMap<>();

        countryCodes.put("USA", "United States");
        countryCodes.put("IND", "India");
        countryCodes.put("AUS", "Australia");
        countryCodes.put("NEP", "Nepal");
        countryCodes.put("USA", "United States 1");
        countryCodes.put("NPT", "Nepal");
        countryCodes.put(null, "nulltest");
        countryCodes.put(null, "nulltest2");
        countryCodes.put("ABC", null);
        countryCodes.put("DEF", null);


        System.out.println("Country Codes: " + countryCodes);

        System.out.println("Code for USA: " + countryCodes.get("USA"));

        countryCodes.remove("AUS");
        System.out.println("After removing AUS: " + countryCodes);

        System.out.println("Contains 'IND': " + countryCodes.containsKey("IND"));

        System.out.println("Iterating through the HashMap");
        for (String key : countryCodes.keySet()) {
            System.out.println(key + " ->" + countryCodes.get(key));
        }
    }
}
