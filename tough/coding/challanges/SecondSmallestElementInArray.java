import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondSmallestElementInArray {

    public static void main(String[] args) {
        
        int[] nums = {21,2,1,4,55,41,24,32,11,19};

        int val = secondSmallest(nums);
        System.out.println(val);
    }

    static int secondSmallest(int [] arr ){

        int val = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("No element found exception "));

         return val;
    }
    
}
