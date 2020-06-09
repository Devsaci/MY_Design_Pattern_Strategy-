public class Context {
    private IStrategy strategy;

    public Context() {
        this.strategy = new DefaultStrategyImpl();
    }

    public void process() {
        System.out.println("Etape initial de l'Algorithme");
        strategy.applyStrategy();
        System.out.println("Etape finale de l'Algorithme");
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

}

  /*
        public void process(int type){
        if (type==1)
            System.out.println("Etape intermediaire de l'Algorithme avec strategy 1");
        else if (type==2)
            System.out.println("Etape intermediaire de l'Algorithme avec strategy 2");
        else if (type==3)
            System.out.println("Etape intermediaire de l'Algorithme avec strategy 3");
        else
            System.out.println("Etape intermediaire de l'Algorithme avec strategy par defaut");
            }
        */