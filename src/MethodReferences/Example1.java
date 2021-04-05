package MethodReferences;

public class Example1 {
    public static void main(String[] args) {
         Thread t = new Thread(Example1::printMessage);
         t.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
