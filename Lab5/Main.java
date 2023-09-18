package org.example;
import java.util.*;

import static org.example.CharacterCount.countCharacters;
import static org.example.CommonElementsFinder.findCommonElements;

public class Main {

    //1
    public static void listOutputFromNtoEnd(int n, List<?> list){
        int k;
        for(k=n;k< list.size();k++){
            System.out.println(list.get(k));
        }
    }

    //2
    public static void ListFromList(int a, int b,List<?> list){
        System.out.println(list.subList(a,++b));
    }

    //3

    public static void addElementToPosition(int index, String value, List list){
        System.out.println("Before: "+ list);
        list.add(index,value);
        System.out.println("After: "+ list);
    }

    public static void searchByIndex(int index, LinkedList<?> linkedList){
        System.out.println("Value of index {"+ index + "} = \""+ linkedList.get(index)+"\" Its position: "+ (++index));
    }

    public static <T> List<T> findDuplicates(List<T> list) {
        Set<T> uniqueElements = new HashSet<>();
        List<T> duplicates = new ArrayList<>();

        for (T element : list) {
            if (!uniqueElements.add(element)) {
                duplicates.add(element);
            }
        }

        return duplicates;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cow");
        animals.add("Chicken");**/
            //1
        /**System.out.println("From this number will be output: ");
        int n = sc.nextInt();
        listOutputFromNtoEnd(n,animals);**/
            //2
        /**System.out.println("Enter a left bound: ");
        int a = sc.nextInt();
        System.out.println("Enter a right bound: ");
        int b = sc.nextInt();
        ListFromList(a,b,animals);**/
            //3
        /**List<String> Cars = new LinkedList<>();
        Cars.add("BMW");
        Cars.add("Mercedes-Benz");
        Cars.add("Skoda");
        Cars.add("Opel");
        System.out.println("Enter index: ");
        int index = sc.nextInt();
        addElementToPosition(index,"New element", Cars);**/

            //4
        /**System.out.println("Enter index: ");
        int index = sc.nextInt();
        searchByIndex(index, (LinkedList<?>) Cars);**/

            //5
        List<Integer> numbers = new ArrayList<>() {};
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        List<Integer> duplicateNumbers = findDuplicates(numbers);
        System.out.println("Duplicates in numbers list: " + duplicateNumbers);

            //6
        String sentence = "This is a sentence";
        Map<Character, Integer> charCountMap = countCharacters(sentence);

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Symbol '" + entry.getKey() + "' - " + entry.getValue());
        }

            //7
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> commonElements = findCommonElements(set1, set2);

        System.out.println("Common elements: " + commonElements);

    }
}