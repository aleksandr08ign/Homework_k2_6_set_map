import com.sun.source.doctree.SeeTree;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4(new ArrayList<>(List.of("один", "два", "два", "три", "три", "три")));
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        {
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) % 2 > 0) {
                    System.out.print(nums.get(i) + " ");
                }

            }
        }
        System.out.println();
    }


    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(4, 4, 1, 1, 2, 3, 5, 5, 6, 7));
        Collections.sort(nums);                  //  сортировка списка
        Set<Integer> numsNotRepeated = new HashSet<>();
        {
            for (Integer num : nums) {
                if (num % 2 == 0 && !numsNotRepeated.contains(num)) {
                    numsNotRepeated.add(num);
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }

    public static void task3() {
        List<String> value = new ArrayList<>(List.of("list", "notebook", "list", "book", "book"));
        Set<String> onlyValue = new HashSet<>(value);
        System.out.println(onlyValue);
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> wordsMap = new HashMap<>(); // ключ, количество повторов
        for (String string : strings) {
            if (wordsMap.containsKey(string)) {
                Integer currentRepiats = wordsMap.get(string);  //значение по ключу
                wordsMap.put(string, currentRepiats + 1);
            } else {
                wordsMap.put(string, 1);
            }
        }
        System.out.println(wordsMap);
    }
}
