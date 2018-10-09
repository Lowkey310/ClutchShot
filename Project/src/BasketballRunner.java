import java.util.Scanner;

public class BasketballRunner
	{

		public static void main(String[] args)
			{
				welcome();
				chooseplayerandshoot();
				asktoplayagain();

			}

		private static void welcome()
			{
				System.out.println(
						"5 seconds remaining in the 4th quarter! 103 - 105! Down by 2! Time is winding down! Who will step up and take the game-winning three pointer?......");
				System.out.println("Welcome to Clutch Shot!");
				System.out.println("The best place to earn yourself some money");
				System.out.println(
						"---------------------------------------------------------------------------------------------------------------------------------------------------");
			}

		private static void chooseplayerandshoot()
			{
				PlayerStats.fillArray();
				System.out.println("It's super simple to win some money! Here you will have 5 options of basketball players. Choose one and let him take the game-winning three point shot. ");
				System.out.println("Put in your money and if he makes it, Congradulations! You earn yourself a lot of money!");
				System.out.println("But if he miss it, Sorry......");
				System.out.println("Each player has their different 3-point percentage. Higher percentage lower odds, it's just that simple");
				System.out.println("Now here's your player options.");
				for (int i = 0; i < PlayerStats.player.size(); i++)
					{
						System.out.println("Your option: " + PlayerStats.player.get(i).getName()
								+ "      Player's 3 point percentage: " + PlayerStats.player.get(i).getPercentage());
					}
				System.out.println("");
				System.out.println(
						"*press 1 to choose M.Veen     *press 2 to choose S.Curry     *press 3 to choose K.Bryant     *press 4 to choose L.Ball     *press 5 to choose D.Jordan");
				
				Scanner userInput1 = new Scanner(System.in);
				int response1 = userInput1.nextInt();

				if (response1 == 1)
					{
						System.out.println("You made your choice, now tell me how much you want to bet");
						Scanner userInput2 = new Scanner(System.in);
						double response2 = userInput2.nextDouble();
						int shot = (int) (Math.random() * 100 + 1);
						
						if (shot < PlayerStats.player.get(response1 - 1).getPercentage())
							{
								System.out.println("Congradulations! He makes the shot! You win " + "$"+(((int) (response2
										* ((double) 100 / PlayerStats.player.get(response1 - 1).getPercentage())))-(response2)) + " and you total recieve $" + ((int) (response2
												* ((double) 100 / PlayerStats.player.get(response1 - 1).getPercentage()))));
							} 
						else
							{
								System.out.println("Sorry...So...uh...u lost all your money...forget to tell u....this is the place u can easily lost your money...");
							}
					}
				else if (response1 == 2)
					{
						System.out.println("You made your choice, now tell me how much you want to bet");
						Scanner userInput2 = new Scanner(System.in);
						double response2 = userInput2.nextDouble();
						int shot = (int) (Math.random() * 100 + 1);
						
						if (shot < PlayerStats.player.get(response1 - 1).getPercentage())
							{
								System.out.println("Congradulations! He makes the shot! You win " + "$"+(((int) (response2
										* ((double) 100 / PlayerStats.player.get(response1 - 1).getPercentage())))-(response2)));
							} 
						else
							{
								System.out.println("Sorry...So...uh...u lost all your money...forget to tell u....this is the place u can easily lost your money...");
							}
					}
				else if (response1 == 3)
					{
						System.out.println("You made your choice, now tell me how much you want to bet");
						Scanner userInput2 = new Scanner(System.in);
						double response2 = userInput2.nextDouble();
						int shot = (int) (Math.random() * 100 + 1);
						
						if (shot < PlayerStats.player.get(response1 - 1).getPercentage())
							{
								System.out.println("Congradulations! He makes the shot! You win " + "$"+(((int) (response2
										* ((double) 100 / PlayerStats.player.get(response1 - 1).getPercentage())))-(response2)) + " and you total recieve $" + ((int) (response2
												* ((double) 100 / PlayerStats.player.get(response1 - 1).getPercentage()))));
							} 
						else
							{
								System.out.println("Sorry...So...uh...u lost all your money...forget to tell u....this is the place u can easily lost your money...");
							}
					}
				else if (response1 == 4)
					{
						System.out.println("You made your choice, now tell me how much you want to bet");
						Scanner userInput2 = new Scanner(System.in);
						double response2 = userInput2.nextDouble();
						int shot = (int) (Math.random() * 100 + 1);
						
						if (shot < PlayerStats.player.get(response1 - 1).getPercentage())
							{
								System.out.println("Congradulations! He makes the shot! You win " + "$"+(((int) (response2
										* ((double) 100 / PlayerStats.player.get(response1 - 1).getPercentage())))-(response2)));
							} 
						else
							{
								System.out.println("Sorry...So...uh...u lost all your money...forget to tell u....this is the place u can easily lost your money...");
							}
					}
				else if (response1 == 5)
					{
						System.out.println("You made your choice, now tell me how much you want to bet");
						Scanner userInput2 = new Scanner(System.in);
						double response2 = userInput2.nextDouble();
						int shot = (int) (Math.random() * 100 + 1);
						
						if (shot < PlayerStats.player.get(response1 - 1).getPercentage())
							{
								System.out.println("Congradulations! He makes the shot! You win " + "$"+(((int) (response2
										* ((double) 100 / PlayerStats.player.get(response1 - 1).getPercentage())))-(response2)));
							} 
						else
							{
								System.out.println("Sorry...So...uh...u lost all your money...forget to tell u....this is the place u can easily lost your money...");
							}
					}

			}

		private static void asktoplayagain()
			{
				System.out.println("");
				System.out.println(
						"Well, Do you want to win some more or try to get your money back? 1. Yea Sure Let's keep going! 2. Nope I'm outta here. Remember to type in the number infront of your choice");
				Scanner userInput3 = new Scanner(System.in);
				int answerafterward = userInput3.nextInt();
				if (answerafterward == 1)
					{
						System.out.println("Welcome Back! I miss you already!");
						chooseplayerandshoot();
						asktoplayagain();

					} else
					{
						System.out.println("Alright, see you soon T^T");
					}

			}

	}
