public class Neighbour extends Thread {

    private String name;
    private Flags flags;
    private Turn turn;
    private int myturn;
    

    public Neighbour(String name, Flags flags, Turn turn, int myturn) {
        this.name = name;
        this.flags = flags;
        this.turn = turn;
        this.myturn = myturn;
    }
    
    public void run() {
        while (true) {
            flags.set_true(name);
            turn.set_other(name);
            try {
                    Thread.sleep((int)(10*Math.random()));
                }
            catch (InterruptedException e) {};
            while (flags.query_flag(name) && myturn != turn.query_turn()) {/*wait*/}
                System.out.println(name + " enters");
                
                System.out.println(name + " exits");
            flags.set_false(name);
            
        }
    }
}
