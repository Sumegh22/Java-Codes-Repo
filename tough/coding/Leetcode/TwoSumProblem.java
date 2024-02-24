package Leetcode; 

import java.util.Arrays;

public class TwoSumProblem {

    public static void main(String[] args) {
        int[] ls = {1,2,5,12,15,17};
        int[]  result = twoSumIndices(ls, 18);

        for (int i : result) {
            System.out.print(i+", ");
        }

    }
    public static int [] twoSumIndices(int[] ls , int target) {
        int [] result = new int[2];
        for (int i = 0; i<ls.length; i++) {   
            for(int j = 1; j<ls.length; j++){
                if(ls[i]+ls[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result; 
    }
}
