public class Field {

    public static void main(String args[]) {    
        Flags flags = new Flags();
        Turn turns = new Turn();
        Thread a = new Neighbour("alice", flags,turns, 1); //the last argument specifies my turn number
        Thread b = new Neighbour("bob", flags,turns, 2);
        a.start();
        b.start();
    }
}


     

