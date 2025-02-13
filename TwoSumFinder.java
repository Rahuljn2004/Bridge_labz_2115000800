import java.util.*;

class TwoSumFinder {
    public static int[] findTwoSumIndices(int[] array, int targetSum) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int index = 0; index < array.length; index++) {
            int complement = targetSum - array[index];
            if (indexMap.containsKey(complement)) {
                return new int[]{indexMap.get(complement), index};
            }
            indexMap.put(array[index], index);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int targetSum = 9;
        int[] result = findTwoSumIndices(array, targetSum);
        System.out.println(Arrays.toString(result));
    }
}
