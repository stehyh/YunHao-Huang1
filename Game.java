
public abstract class Game {

private String Name;
private double Balance;
private boolean BetField;
public Game() {
	
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public double getBalance() {
	return Balance;
}
public void setBalance(double balance) {
	Balance = balance;
}
public boolean isBetField() {
	return BetField;
}
public void setBetField(boolean betField) {
	BetField = betField;
}

	public abstract void gameStart();
	public abstract int roundWinner(int a,int b,int c);
	
}
