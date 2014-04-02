public class Savage extends Thread {

    private String name;
    private Pot pot;
    private int servings;

    public Savage(String name, Pot pot, int servings) {
        this.name = name;
        this.pot = pot;
        this.servings = servings;
    }
    
    public void run() {
        int i = 0;
        while (i < servings) {
            if (Math.random() < 0.5) Thread.yield();
            System.out.println(name + " is hungry");
            try {
                pot.getserving();
            } 
            catch(InterruptedException e) {};
            ++i;
        }
        pot.finished();
        System.out.println(this.name + " is finished");
    }
}
