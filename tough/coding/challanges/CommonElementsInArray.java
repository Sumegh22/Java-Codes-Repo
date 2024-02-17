import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInArray {
    

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,9};
        int[] arr2 = {1,4,6,9,8};
        List<Integer> common = commonElementsFromArrays(arr1, arr2);
        System.out.println("List of common elements in Arrays are "+ common);
        
    }

    static List<Integer> commonElementsFromArrays(int[] arr1, int[] arr2){
        
        List<Integer> output = Arrays.stream(arr1).filter( a -> Arrays.stream(arr2).anyMatch(b -> b==a)).boxed().collect(Collectors.toList());
        return output;
    }
}
