import java.util.*;

public class TwoSum {

    public static void findPair(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("Pair found: " + complement + " + " + num);
            }

            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        findPair(arr,500);
    }
}