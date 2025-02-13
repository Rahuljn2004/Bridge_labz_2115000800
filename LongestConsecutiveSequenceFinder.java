import java.util.*;

class LongestConsecutiveSequenceFinder {
    public static int findLongestConsecutiveSequence(int[] array) {
        Set<Integer> numberSet = new HashSet<>();
        for (int number : array) numberSet.add(number);

        int maxLength = 0;
        for (int number : array) {
            if (!numberSet.contains(number - 1)) {
                int length = 0;
                while (numberSet.contains(number + length)) {
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] array = {100, 4, 200, 1, 3, 2};
        System.out.println(findLongestConsecutiveSequence(array));
    }
}
