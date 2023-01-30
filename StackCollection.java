import java.util.Stack;

public class StackCollection {
  
    public static void main(String args[])  {
        
        Stack<String> stack = new Stack<String>();
        stack.push("Java");
        stack.push("PHP");
        stack.push("Python");
        stack.push("Pascal");
        //remove last element
        stack.pop();
        System.out.println("le dernier element est " + stack.lastElement());
        String search = stack.get(0);
        System.out.println("l'element a la position 0 est "+ search);
        stack.forEach(System.out::println);
    }
}
