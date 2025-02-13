import java.util.*;

class PairSumChecker {
    public static boolean hasPairWithSum(int[] array, int targetSum) {
        Set<Integer> seenNumbers = new HashSet<>();
        for (int number : array) {
            if (seenNumbers.contains(targetSum - number)) {
                return true;
            }
            seenNumbers.add(number);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 15, 3, 7};
        int targetSum = 17;
        System.out.println(hasPairWithSum(array, targetSum));
    }
}
