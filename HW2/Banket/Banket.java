public class Banket {

    public static void main(String args[]) {    
        int servings = Integer.parseInt(args[0]);
        Pot pot = new Pot(5, 2);
        Thread a = new Savage("alice", pot, servings);
        Thread b = new Savage("bob", pot, servings);
        Thread c = new Cook(pot);
        a.start();
        b.start();
        c.start();
    }
}


     

