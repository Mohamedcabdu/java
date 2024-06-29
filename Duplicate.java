package ch6Methods;

//Name:mohamed abdullahi abdi shire
//ID:c1220933
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {


    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();

        // Add elements to the set (duplicates will be automatically handled)
        for (int num : array) {
            set.add(num);
        }

        // Convert set back to array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int[] result = removeDuplicates(array);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 3, 4, 5]
}

}
