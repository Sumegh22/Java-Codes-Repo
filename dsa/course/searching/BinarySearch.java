
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 6, 2, 8,17,19,10,15,21,25};

        int location = findByBinarySearchByRecursion(nums, 25,0,nums.length);
        System.out.println("value is found at index : " + location);
    }

    private static int findByBinarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int i =0;
        while(start <= end){
            System.out.println("iteration :" +i);
            i++;
            int midPoint = (start+end)/2;
            if(nums[midPoint]==target) {
                return midPoint;
            } else if (nums[midPoint]<target) {
                start = midPoint+1;
            } else {
                end = midPoint-1;
            }
        }
        return -1;
    }

    private static int findByBinarySearchByRecursion(int[] nums, int target, int start, int end) {
        Arrays.sort(nums);
        int i =0;
        while(start <= end){
            int midPoint = (start+end)/2;
            if(nums[midPoint]==target) {
                return midPoint;
            } else if (nums[midPoint]<target) {
                return findByBinarySearchByRecursion(nums, target, midPoint+1,end);
            } else {
                return findByBinarySearchByRecursion(nums, target, start,midPoint-1);
            }
        }
        return -1;
    }


}

