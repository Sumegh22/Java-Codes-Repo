public class NthTermInFiboNacci {

    public static void main(String[] args) {
        
       int nth =  nthTermInFibo(7);
       System.out.println(nth);
    } 

    static int nthTermInFibo(int n){

        if (n<=1) {
            return n;
        }
        else{
            return nthTermInFibo(n-1) + nthTermInFibo(n-2);
        }
    }
    
}
