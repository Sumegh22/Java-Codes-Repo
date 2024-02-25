/**
 * Print1toNinRecurrsion
 */
public class Print1toNinRecurrsion {

    public static void main(String[] args) {
        
        recurrsive(9);
        System.out.println();
        System.out.println("Recursion in reverse order is as below !... ");

        recurrsiveReverse(1,11);
    }

    static void recurrsive(int n){
        if (n == 0){
            return;
        }
        System.err.print(n +" ");
        recurrsive(n-1);
    }

    

    static void recurrsiveReverse( int i, int n){
        
        if (i > n){
            return;
        }
        System.err.print(i +" ");
        recurrsiveReverse(i+1, n);
    }



}