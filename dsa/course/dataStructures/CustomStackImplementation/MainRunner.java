package dsa.course.dataStructures.CustomStackImplementation;

public class MainRunner {
    public static void main(String[] args) {
        
        CustomStack stack = new CustomStack(4);
        System.out.println(stack.length);
        stack.push(0);
        stack.push(1);
        stack.push(6);
        stack.push(5);

        System.out.println(stack.toString());

    }
}
