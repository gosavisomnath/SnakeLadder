
public class SnakeLadder{
	public static final int Player1Position = 0;
	public static final int PlayerPosition = 0;
	public static void main(String[] args)
	{
		
		System.out.println("Welcome to Snake and Ladder game");
		
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
		switch(opt)
		 {
				case 1:
					Player1Position = dice;
					System.out.println( "No Play You are in the same Position " +Player1Position );
					break;
				case 2:
					Player1Position = (Player1Position + dice);
					System.out.println( "your Position after ladder is :" + Player1Position );
					break;
				case 3:
					Player1Position = (Player1Position - dice);
					System.out.println( "Your Position after snake is" + Player1Position );
					break;
				
			

		   }
		

