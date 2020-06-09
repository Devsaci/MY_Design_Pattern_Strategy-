import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        boolean fin = false;
        while (!fin) {
            System.out.println("donner Votre strategie :");
            String strategyClassName = scanner.nextLine();
            IStrategy strategy = (IStrategy) Class.forName(strategyClassName).newInstance();
            context.setStrategy(strategy);
            System.out.println(". . . . . . . . . . . . ");
            context.process();
        }


    }
}

/*context.process();
        System.out.println("_____________________");
        context.setStrategy(new StrategyImpl1());
        context.process();
        System.out.println("_______________________");
        context.setStrategy(new StrategyImpl2());
        context.process();
        System.out.println("_______________________");
        context.setStrategy(new StrategyImpl3());
        context.process();
        System.out.println("_______________________");
        context.setStrategy(new DefaultStrategyImpl());
        context.process();*/

 /*  context.process(1);
        System.out.println("_______________________");
        context.process(2);
        System.out.println("_______________________");
        context.process(3);
        System.out.println("_______________________");
        context.process(8);*/