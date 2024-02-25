import java.util.Scanner;

public class LexiographicallyOrderedStrings {

    public static String getSmallestAndLargest(String s, int k) {
String largest = "";
        for (int i = 0; i <= s.length() - k; i++) {
            int end = i + k;
            String substr = s.substring(i, end);
            if (largest.compareTo(substr) < 0) {
                largest = substr;
            }
        }
        String smallest = largest;
        for (int i = 0; i <= s.length() - k; i++) {
            int end = i + k;
            String substr = s.substring(i, end);
            if (smallest.compareTo(substr) > 0) {
                smallest = substr;
            }
        }
        return smallest + "\n" + largest;     
        
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
