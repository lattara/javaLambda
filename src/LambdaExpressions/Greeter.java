package LambdaExpressions;

public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting lambdaGreeting = () -> System.out.print("Hello World");
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("HelloWorld");
            }
        };
    }
}
