# Basics for Logical Thinking

## Patterns
1. outer loop is for number of rows
2. inner loop is for columns
3. Use sout (System.out.print()) to print * or numbers in same line
4. Look for symmetry (optional). Count Rows and Columns and map them together to build a pattern
5. Use sout (System.out.println()) to add a next line wherever required

```
for (int i=0; i<n; i++){
  for (int j=0; j<n; j++){
    System.out.print("* ");
  }
System.out.println();
}
```

### Example
The following pattern can be achieved by this code

    public static void nStarTriangle(int n) {

        for (int i = 0; i<n; i++){
            // for white spaces
            for(int s1 = n-i-1; s1>0; s1--){
                System.out.print(" ");
            }
            for(int p =0; p<i*2+1; p++){
                System.out.print("*");
            }
             // for white spaces
            for(int s2=n-i-1; s2>0 ;s2--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

```
       *       
      ***      
     *****     
    *******    
   *********   

```
----------------------------

### Example 2 

```
public class Solution {
    public static void nStarTriangle(int n) {
        
    for(int i = 0; i <n; i++){
        for(int s1 = 0; s1 <i; s1++){
            System.out.print(" ");
        }

        for(int p = ((n-i)*2)-1; p>0; p--){
            System.out.print("*");
        }

        for(int s2 = 0; s2 <i; s2++){
            System.out.print(" ");
        }

        System.out.println();

    }

    }
}
```
For an input 8 it will print 

    ***************
     ************* 
      ***********  
       *********   
        *******    
         *****     
          ***      
           *       
----------------------------------

### Example 3 

```
public class Solution {
    static void pattern1(int n){
        for(int i = 0; i < n; i++){
            
            for(int s1 = n-1-i; s1 > 0; s1--){
                System.out.print(" ");
            }

            for(int p1 =0; p1<(i*2)+1; p1++ ){
                System.out.print("*");
            }

            for(int s2 = n-1-i; s2 > 0; s2--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++){

            for(int s3= 0; s3<i; s3++){
            System.out.print(" ");    
            }

            for(int p2 = (n-i)*2 - 1; p2>0; p2--){
                System.out.print("*");
            }

            for(int s4 = 0; s4<i; s4++){
            System.out.print(" ");    
            }

            System.out.println();   
        }       
    }
    public static void nStarDiamond(int n) {
        // Write your code here
        pattern1(n);
        pattern2(n);
    }
    
}
```

For an input 8 it will print 
    
           *       
          ***      
         *****     
        *******    
       *********   
      ***********  
     ************* 
    ***************
    ***************
     ************* 
      ***********  
       *********   
        *******    
         *****     
          ***      
           * 
---------------------------------

