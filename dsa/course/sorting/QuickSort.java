public class QuickSort {

    public static void main(String[] args) {

        int[] nums = {21,2,1,4,55,41,24,32,11,19};

        sortByQucikSort(nums, 0, nums.length-1);

        for (int i : nums) {
            System.out.print(i +" ");
        }
        
    }

    static void sortByQucikSort(int[] arr, int low, int high){
    

        if(low < high){
            
            int pi = doPartition(arr, low, high);

            sortByQucikSort(arr, low, pi-1);
            sortByQucikSort(arr, pi+1, high);

        }


    }

    private static int doPartition(int[] arr, int low, int high){
        int i = low - 1; 
        int pivot = arr[high];
        
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    
}
