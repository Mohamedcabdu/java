package ch6Methods;
// Name:mohamed abdullahi abdi shire
// ID:c1220933

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class common {
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        for (int num : arr1) {
            set1.add(num);
        }


        for (int num : arr2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        return new ArrayList<>(set1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};
        List<Integer> commonElements = findCommonElements(arr1, arr2);
        System.out.println(commonElements);
}
}
