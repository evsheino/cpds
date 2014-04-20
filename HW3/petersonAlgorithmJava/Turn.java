
public class Turn {

	private int turn;
	
	public Turn()
	{
		turn = 1;
	}
	
	public synchronized int query_turn()
	{
		return turn;
	}
	
	public synchronized void set_other(String name)
	{
		if (name == "alice") turn = 2;
		else turn = 1;
	}
}
