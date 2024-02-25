package dsa.course.dataStructures.CustomStackImplementation;

public class CustomStack {

    int length; 
    int top ;
    int[] stack = null;
    
    
    

    public CustomStack(int length) {
        this.length = length;
        this.stack = new int[length];
        this.top = 0;
    }

    public void push (int data){
        stack[this.top] = data;
        this.top++; 
    }

    public int peek(){
        return 0;
    }
    
    public void pop(){}

    public boolean isEmpty(){
        if (top == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString() {
    String s = "["; 
    for (int i : stack) {
        s+=i+",";
    }
    s+="]";
    return s; 
    }


    
}
