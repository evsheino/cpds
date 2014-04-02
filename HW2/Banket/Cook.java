public class Cook extends Thread {

    private String name = "cook";
    private Pot pot;

    public Cook(Pot pot) {
        this.pot = pot;
    }
    
    public void run() {
        while (!this.pot.isBanketFinished()) {
            try {  
                pot.fillpot();
                System.out.println(name + " fillpot");
            }
            catch(InterruptedException e) {};
        }
        System.out.println(name + " is finished");
    }
}
