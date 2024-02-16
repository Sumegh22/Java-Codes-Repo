public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {1,2,1,4,55,41,21,32,11,19};

        sortByInsertionSort(nums);
    }
    

    static void sortByInsertionSort( int[] nums){

        for(int i = 1; i<nums.length; i++){
            int key = nums[i]  ;
            int j = i-1;
            while((nums[j] > key)&& (j>=0)){
            
            nums[j+1] = nums[j];
            j--;
                
            }
            nums[j+1] = key;

        }

        for (int i : nums) {
            System.out.print(i+" " );
        }

        
        


    }
}
