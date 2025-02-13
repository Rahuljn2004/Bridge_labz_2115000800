import java.util.*;

class ZeroSumSubarrayFinder {
    public static List<int[]> findZeroSumSubarrays(int[] array) {
        Map<Integer, List<Integer>> sumIndexMap = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int cumulativeSum = 0;

        sumIndexMap.put(0, new ArrayList<>(List.of(-1)));

        for (int index = 0; index < array.length; index++) {
            cumulativeSum += array[index];

            if (sumIndexMap.containsKey(cumulativeSum)) {
                for (int startIndex : sumIndexMap.get(cumulativeSum)) {
                    result.add(new int[]{startIndex + 1, index});
                }
            }

            sumIndexMap.putIfAbsent(cumulativeSum, new ArrayList<>());
            sumIndexMap.get(cumulativeSum).add(index);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        List<int[]> subarrays = findZeroSumSubarrays(array);
        for (int[] range : subarrays) {
            System.out.println("Subarray found from index " + range[0] + " to " + range[1]);
        }
    }
}
