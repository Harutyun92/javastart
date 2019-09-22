package pl.sda.javastart.Programowanie;

// Zaimplementuj Stos jako klase, ktora moze przechowywac elementy dowolnego typu.Dodaj i zaimplementuj metody push(), pop(),peek(),isEmpty()
public class Stos {
    public static void main(String[] args) {

        Stos stos = new Stos();
        stos.push(5);
        stos.push(8);
        stos.push(10);
        stos.peek();
        stos.pop();
        stos.peek();
    }


    private int size = 100;
    private int top = -1;

    private Object[] stackArr= new Object[size];

    public boolean isEmpty() {
        return stackArr == null || stackArr.length == 0 ? true : false;
    }

    public boolean push(Object o) {
        if (top >= (size - 1)) {
            System.out.println("stack is full");
            return false;
        }
        stackArr[++top] = o;
        System.out.println(o + " push into stack");
        return true;
    }

    public Object pop() {
        if (top < 0) {
            System.out.println("stack underflow");
            return 0;
        } else {
            Object x = stackArr[top--];
            return x;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(stackArr[top]);
        } else {
            System.out.println("stack is empty");
        }
    }
}
