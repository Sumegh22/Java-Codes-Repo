public class SelectionSort {

    public static void main(String[] args) {

        int[] nums = {21,2,1,4,55,41,24,32,11,19};

        sortByInsertionSort2(nums);
        
    }

    public static void sortByInsertionSort2(int[] arr){
        int len = arr.length;
        int temp = 0;
        int minIndex = -1;

        for(int i = 0; i<len-1 ; i++){
            minIndex = i;

            for (int j=i+1;j<len; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            temp = arr[i];
            arr[i]=arr[minIndex] ;
            arr[minIndex] = temp;
        
        }
        
        for (int a : arr) {
            System.out.print(a +" ");
        }
        

    }


    // public static void sortByInsertionSort(int[] arr){
    //     int len = arr.length;
        
    //     for(int i = len-1; i>0 ; i--){
    //         int maxIndex = 0;
    //         for(int j = 1; j<len-i; j++){
    //             if (arr[j]> arr[maxIndex]){
    //                 maxIndex = j;    
    //             }
    //         }
            
    //         int temp = arr[i];
    //         arr[i] = arr[maxIndex];
    //         arr[maxIndex] = temp;
        
    //     }
        
    //     for (int a : arr) {
    //         System.out.print(a +" ");
    //     }
        

    // }


    
}
