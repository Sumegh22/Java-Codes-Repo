# Basics for Logical Thinking

## Patterns
1. outer loop is for number of rows
2. inner loop is for columns
3. Use sout (System.out.print()) to print * or numbers in same line
4. Use sout (System.out.println()) to add a next line wherever required

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
