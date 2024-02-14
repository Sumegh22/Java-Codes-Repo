package com.dsa.course.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] nums = {1,2,1,4,55,41,21,32,11,19};

        sortByBubbleSort(nums);
    }
    public static void sortByBubbleSort(int[] nums) {
        int size = nums.length; 

        for (int j =0; j<size; j++){
            for(int i =0;i<size-1; i++){
                if(nums[i]>nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }     
        }

        for (int i : nums) {
            System.out.print(i +",");
        }
        
    }
}


