
public class LinerSearch {

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 6, 2, 8};

        int location = findByLinearSearch(nums, 2);
        System.out.println("value is found at index : " + location);
    }

    private static int findByLinearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}
