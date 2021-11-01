
public class Test {

	public static void main(String[] args) {

CardGame c=new CardGame("John",12,true);
c.gameStart();
c.NewRound();
c.NewRound();
c.NewRound();
System.out.println(c.toString());



	}

}
