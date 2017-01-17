package PalindromFirst;

import java.util.*;

public class PalindromOperation {

    public PalindromOperation() {

    }

    private HashMap<String, Long> palindromMap = new HashMap<>();


    public void findBiggestPalindromOfTwoNumber(int number) {

               if (number <= 1) {
            System.out.println("The number must be greater than 1");
        } else {
            long resultNumber = (long) Math.pow(10, number) - 1;
            for (long i = resultNumber, j = resultNumber; i > 0; i--, j--) {
                for (long k = j; k > 0; k--) {
                    long product = i * k;
                    if (isPalindrome(product)) {
                        palindromMap.put(i + " * " + k, product);
                    }
                }
            }
        }
    }


    private boolean isPalindrome(Long number) {
        String s = number.toString();
        if (s.length() > 1) {
            return s.equals((new StringBuilder(s)).reverse().toString());
        } else {
            return false;
        }
    }


    private <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public void printMap() {
        Map<String, Long> sortedMap = sortMapByValue(palindromMap);
        for (Map.Entry<String, Long> element : sortedMap.entrySet()) {
            System.out.println(element.getKey() + " = " + element.getValue());
        }
    }
}
