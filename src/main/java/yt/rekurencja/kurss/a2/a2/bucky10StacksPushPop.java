package yt.rekurencja.kurss.a2.a2;

import java.util.Stack;

public class bucky10StacksPushPop {
    public static void main(String[] args) {

        Stack<String> stack= new Stack<String>();

        // mamy wyzej pusty stack wiec tutaj cos do niego dajemy za pomoca push

        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }

    private static void printStack(Stack<String> s){
        if(s.isEmpty())
            System.out.println("you have nothing in stack");
        else
            System.out.printf("%s TOP\n", s);  // (format,args)
    }
}
