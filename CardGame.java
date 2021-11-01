import java.util.Random;
import java.util.Scanner;
public class CardGame extends Game implements Card {
int RoundsPlayed=0;
double InitialBalance=0;
String[][] AllCards;
String cards[];


	public CardGame(String name, double balance, boolean betField) {
		super.setName(name);
		super.setBetField(betField);
		gameStart(balance);
		AllCards = new String[SYMNUM][CARDNUM];
		InitialBalance=balance;
		cards= new String[] {"spade","heart","diamond","club"};
	}

	@Override
	public String getCard() {
		Random randGnd = new Random();
	    int num;
	    num = randGnd.nextInt(13);
	    int num2;
	    num2= randGnd.nextInt(4);
	    String cardType = cards[num2];
	    return num+","+cardType;
	    
	}

	@Override
	public void gameStart(double balance) {
		super.setBalance(balance);
	System.out.println("Game Start");
	}

	@Override
	public int roundWinner(int a,int b,int c) {
	if(c > a && c < b) 
	return 1;
	else 
		return 0;
	}

	@Override
	public void gameStart() {
		
		
	}

	
public void NewRound() {
    Scanner scan=new Scanner(System.in);
RoundsPlayed++;
String cards=getCard();
String cardsTokens[]=cards.split(",");
String cards2=getCard();
String cardsTokens2[]=cards.split(",");
String cards3=getCard();
String cardsTokens3[]=cards.split(",");
int num1=Integer.parseInt(cardsTokens[0]);
int num2=Integer.parseInt(cardsTokens2[0]);
int num=0;    
System.out.println("Card 1: "+cards);
System.out.println("Card 2:  "+cards2);
System.out.println("Enter 0 or 1");
int choice=scan.nextInt();
if(choice==1) {
num=Integer.parseInt(cardsTokens3[0]);
System.out.println("Card 3: "+cards3);
}
int winner=roundWinner(num1,num2,num);
if(winner==1) {super.setBalance(super.getBalance()+1);
System.out.println("You Win Round "+RoundsPlayed);}
else {super.setBalance(super.getBalance()-1);
System.out.println("Computer Win Round "+RoundsPlayed);
}
System.out.println("---------------------------------");
}
	
	
	public String toString() {
return "Rounds Played = "+RoundsPlayed;		
		
		
	}
	
	
}
