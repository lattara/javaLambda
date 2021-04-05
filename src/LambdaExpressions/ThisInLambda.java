package LambdaExpressions;


public class ThisInLambda {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public static void main(String[] args) {


        ThisInLambda thisInLambda = new ThisInLambda();
        thisInLambda.doProcess(10, i -> {
            System.out.println("");;
        });

    }
}
