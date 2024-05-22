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

### Q1. * Pyramid 
ref : https://takeuforward.org/pattern/pattern-7-star-pyramid/

```
       *       
      ***      
     *****     
    *******    
   *********   

```

Thsis  pattern can be achieved by following code -> input = 5

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


----------------------------

### Q2.  Reverse Pyramid
https://takeuforward.org/pattern/pattern-8-inverted-star-pyramid/
For an input 8 it should print 

    ***************
     ************* 
      ***********  
       *********   
        *******    
         *****     
          ***      
           *    

The following code can achieve desired result
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
   
----------------------------------

### Q2 print diamond of " * " : https://takeuforward.org/pattern/pattern-9-diamond-star-pattern/

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


Following code will achive the pattern for an input 8 
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


    
---------------------------------

## Q 3

Prints the below pattern : https://takeuforward.org/pattern/pattern-10-half-diamond-star-pattern/
```
*
**
***
****
*****
******
*****
****
***
**
*
```

This Half symmetric diamond will be printed by below code for an input 6

```
public class Solution {
    public static void nStarTriangle(int n) {
    
    printPattern1(n);
    printPattern2(n-1);
    }

    static void printPattern1(int n){
        for(int i = 0; i<n; i++){
            for(int p = 0; p<=i; p++){
                System.out.print("*");
            }
            for(int s = n-1-i; s>0; s--){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void printPattern2(int n){
        for(int i = 0; i<n; i++){
            for(int p=n-i; p>0; p--){
                System.out.print("*");
            }
            for(int s =0; s<=i; s++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
```


