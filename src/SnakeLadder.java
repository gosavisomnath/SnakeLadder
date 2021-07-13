
public class SnakeLadder {
	public static void main(String[] args)
	{
		int Player1Position = 0;
		System.out.println("Welcome to Snake and Ladder game");
		int PlayerPosition = 0;
		System.out.println("Game begins Player Position is: "+PlayerPosition);
		DiceThrow();
	}
		public static void DiceThrow()
		{
			int Dice = (int)Math.floor(Math.random()*10)%6+1;
			System.out.println("You got Dice Value "+Dice);
			
		}
}
		System.out.println("Player1Position is " + Player1Position);
		int dice=(int) (Math.random() * 10) % 6+1;
		Player1Position = (Player1Position + dice);
		System.out.println("dice value is " + dice);
		int opt=(int) (Math.random() * 10) % 3+1;
}
}