package Game;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scisosrs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			String[] rps = {"r", "p", "s"};
			String computerMove = rps[new Random().nextInt(rps.length)];
									// Random generator, next int sizeof length
			String playerMove;
			
			while(true)
			{			
				System.out.println("Please Enter your move r, p, s");
			
				playerMove = sc.nextLine();
			
				if(playerMove.equals("p") || playerMove.equals("r") || playerMove.equals("s"))
				{
					break;
				}
				else
				{
					System.out.println(playerMove+ "  Is not a valid move");
				}
			
			}
				System.out.println(computerMove + " Move played by computer");
			
				if(playerMove.equals(computerMove))
				{
					System.out.println("The game is tie");
				}
				else if(playerMove.equals("r"))
					{
						if(computerMove.equals("p"))
								{
									System.out.println("YOU LOOSE");
								}
						else if(computerMove.equals("s"))
								{
									System.out.println("YOU WIN");
								}
					}
				else if(playerMove.equals("p"))
					{
						if(computerMove.equals("r"))
							{
								System.out.println("YOU WIN");
							}
						else if(computerMove.equals("s"))
							{
								System.out.println("YOU LOOSE");
							} 
					}
				else if(playerMove.equals("s"))
					{
						if(computerMove.equals("r"))
							{
								System.out.println("YOU LOOSE");
							}
						else if(computerMove.equals("p"))
							{
								System.out.println("YOU WIN");
							} 
					}
			System.out.println("Play again (y/n)");
			String playAgain = sc.nextLine();
			
			if(!playAgain.equals("y"))
			{
				System.out.println("BYE");
				break;
			}
			
		}
		sc.close();
	}
}
