import java.util.Scanner;

public class BasketballRunner
	{

		public static void main(String[] args)
			{
				PlayerStats.fillArray();
				System.out.println("Welcome");
				Scanner userInput = new Scanner(System.in);
			    String response = userInput.nextLine();
			    
				System.out.println("Five players, choose one and take a shot, earn your money if he makes it!");
				for(int i=0; i< PlayerStats.player.size(); i++)
					{
						System.out.println("Your option: " + PlayerStats.player.get(i).getName() + "      Player's 3 point percentage: " + PlayerStats.player.get(i).getPercentage());
					}
				System.out.println("press 1 to choose S.Curry; press 2 to choose K.Bryant; press 3 to choose L.Ball; press 4 to choose A.Iguodala; press 5 to choose D.Jordan");
				Scanner userInput1 = new Scanner(System.in);
			    int response1 = userInput1.nextInt();
			    
			    if(response1 == 1)
			    	{
			    		System.out.println("How much money do u want to put in");
			    		Scanner userInput2 = new Scanner(System.in);
					    double response2 = userInput2.nextDouble();
					    int shot = (int)(Math.random()*100 + 1);
					    if(shot < PlayerStats.player.get(response1-1).getPercentage())
					    	{
					    		System.out.println("Congradulations! You win " + ((int)(response2*((double)100/PlayerStats.player.get(response1-1).getPercentage()))));
					    	}
					    else
					    	{
					    		System.out.println("Sorry u lost");
					    	}
			    	}
			    if(response1 == 2)
			    	{
			    		System.out.println("How much money do u want to put in");
			    		Scanner userInput2 = new Scanner(System.in);
			    		double response2 = userInput2.nextDouble();
					    int shot = (int)Math.random()*100;
					    if(shot < PlayerStats.player.get(response1-1).getPercentage())
					    	{
					    		System.out.println("Congradulations! You win " + ((int)(response2*((double)100/PlayerStats.player.get(response1-1).getPercentage()))));
					    	}
					    else
					    	{
					    		System.out.println("Sorry u lost");
					    	}
			    	}
			    if(response1 == 3)
			    	{
			    		System.out.println("How much money do u want to put in");
			    		Scanner userInput2 = new Scanner(System.in);
			    		double response2 = userInput2.nextDouble();
					    int shot = (int)Math.random()*100;
					    if(shot < PlayerStats.player.get(response1-1).getPercentage())
					    	{
					    		System.out.println("Congradulations! You win " + ((int)(response2*((double)100/PlayerStats.player.get(response1-1).getPercentage()))));
					    	}
					    else
					    	{
					    		System.out.println("Sorry u lost");
					    	}
			    	}
			    if(response1 == 4)
			    	{
			    		System.out.println("How much money do u want to put in");
			    		Scanner userInput2 = new Scanner(System.in);
			    		double response2 = userInput2.nextDouble();
					    int shot = (int)Math.random()*100;
					    if(shot < PlayerStats.player.get(response1-1).getPercentage())
					    	{
					    		System.out.println("Congradulations! You win " + ((int)(response2*((double)100/PlayerStats.player.get(response1-1).getPercentage()))));
					    	}
					    else
					    	{
					    		System.out.println("Sorry u lost");
					    	}
			    	}
			    if(response1 == 5)
			    	{
			    		System.out.println("How much money do u want to put in");
			    		Scanner userInput2 = new Scanner(System.in);
			    		double response2 = userInput2.nextDouble();
					    int shot = (int)Math.random()*100;
					    if(shot < PlayerStats.player.get(response1-1).getPercentage())
					    	{
					    		System.out.println("Congradulations! You win " + ((int)(response2*((double)100/PlayerStats.player.get(response1-1).getPercentage()))));
					    	}
					    else
					    	{
					    		System.out.println("Sorry u lost");
					    	}
			    	}
			   
			  

			}

	}
