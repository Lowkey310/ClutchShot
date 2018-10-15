import java.util.Scanner;

public class BasketballRunner
	{

		public static void main(String[] args)
			{
		
				boolean keep = true;
				while(keep) {
				
				System.out.println(
						"5 seconds remaining in the 4th quarter! 103 - 105! Down by 2! Time is winding down! Who will step up and take the game-winning three pointer?......");
				System.out.println("Welcome to Clutch Shot!");
				System.out.println("The BEST place to earn yourself some money");
				System.out.println(
						">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
               
				PlayerStats.fillArray();
				
				System.out.println(
						"It's super simple to play! Here you will have 5 options of basketball players. Choose one and let him take the game-winning three point shot. ");
				System.out.println(
						"Put in your money and if he makes it, Congradulations! You earn yourself a lot of money!");
				
				
				System.out.println(
						"Each player has different 3-point percentage. Higher percentage equals lower odds, it's just that simple");
				System.out.println("Now here's your player options.");
				System.out.println("");
				for (int i = 0; i < PlayerStats.player.size(); i++)
					{
						System.out.println("Your option: " + PlayerStats.player.get(i).getName()
								+ "      Player's 3 point percentage: " + PlayerStats.player.get(i).getPercentage());
					}
				System.out.println("");
				System.out.println("-press 1 to choose M.Veen");
                System.out.println("-press 2 to choose S.Curry");
                System.out.println("-press 3 to choose K.Bryant");
                System.out.println("-press 4 to choose L.Ball");
                System.out.println("-press 5 to choose D.Jordan");
                
				Scanner userInput1 = new Scanner(System.in);
				int response1 = userInput1.nextInt();

				if (response1 == 1)
					{
						System.out.println("You made your choice, now tell me how much you want to bet");
						Scanner userInput21 = new Scanner(System.in);
						double response2 = userInput21.nextDouble();
						int shot = (int) (Math.random() * 100 + 1);

						if (shot < PlayerStats.player.get(response1 - 1).getPercentage())
							{
								System.out.println("Congradulations! He makes the shot! You win " + "$"
										+ (((int) (response2 * ((double) 100
												/ PlayerStats.player.get(response1 - 1).getPercentage())))
												- (response2))
										+ " and you total recieve $" + ((int) (response2 * ((double) 100
												/ PlayerStats.player.get(response1 - 1).getPercentage()))));
							}
						else
							{
								System.out.println(
										"Sorry...So...u lost all your money...forget to tell u....this is also the place u can easily lost your money...");
							}
					} 
				else if (response1 == 2)
					{
						System.out.println("You made your choice, now tell me how much you want to bet");
						Scanner userInput23 = new Scanner(System.in);
						double response2 = userInput23.nextDouble();
						int shot = (int) (Math.random() * 100 + 1);

						if (shot < PlayerStats.player.get(response1 - 1).getPercentage())
							{
								System.out.println("Congradulations! He makes the shot! You win " + "$"
										+ (((int) (response2 * ((double) 100
												/ PlayerStats.player.get(response1 - 1).getPercentage())))
												- (response2))
										+ " and you total recieve $" + ((int) (response2 * ((double) 100
												/ PlayerStats.player.get(response1 - 1).getPercentage()))));
							} 
						else
							{
								System.out.println(
										"Sorry...So...u lost all your money...forget to tell u....this is also the place u can easily lost your money...");
							}
					} 
				else if (response1 == 3)
					{
						System.out.println("You made your choice, now tell me how much you want to bet");
						Scanner userInput24 = new Scanner(System.in);
						double response2 = userInput24.nextDouble();
						int shot = (int) (Math.random() * 100 + 1);

						if (shot < PlayerStats.player.get(response1 - 1).getPercentage())
							{
								System.out.println("Congradulations! He makes the shot! You win " + "$"
										+ (((int) (response2 * ((double) 100
												/ PlayerStats.player.get(response1 - 1).getPercentage())))
												- (response2))
										+ " and you total recieve $" + ((int) (response2 * ((double) 100
												/ PlayerStats.player.get(response1 - 1).getPercentage()))));
							}
						else
							{
								System.out.println(
										"Sorry...So...u lost all your money...forget to tell u....this is also the place u can easily lost your money...");
							}
					}
				else if (response1 == 4)
					{
						System.out.println("You made your choice, now tell me how much you want to bet");
						Scanner userInput25 = new Scanner(System.in);
						double response2 = userInput25.nextDouble();
						int shot = (int) (Math.random() * 100 + 1);

						if (shot < PlayerStats.player.get(response1 - 1).getPercentage())
							{
								System.out.println("Congradulations! He makes the shot! You win " + "$"
										+ (((int) (response2 * ((double) 100
												/ PlayerStats.player.get(response1 - 1).getPercentage())))
												- (response2))
										+ " and you total recieve $" + ((int) (response2 * ((double) 100
												/ PlayerStats.player.get(response1 - 1).getPercentage()))));
							} 
						else
							{
								System.out.println(
										"Sorry...So...u lost all your money...forget to tell u....this is also the place u can easily lost your money...");
							}
					} 
				else if (response1 == 5)
					{
						System.out.println("You made your choice, now tell me how much you want to bet");
						Scanner userInput26 = new Scanner(System.in);
						double response2 = userInput26.nextDouble();
						int shot = (int) (Math.random() * 100 + 1);

						if (shot < PlayerStats.player.get(response1 - 1).getPercentage())
							{
								System.out.println("Congradulations! He makes the shot! You win " + "$"
										+ (((int) (response2 * ((double) 100
												/ PlayerStats.player.get(response1 - 1).getPercentage())))
												- (response2))
										+ " and you total recieve $" + ((int) (response2 * ((double) 100
												/ PlayerStats.player.get(response1 - 1).getPercentage()))));
							} 
						else
							{
								System.out.println(
										"Sorry...So...u lost all your money...forget to tell u....this is also the place u can easily lost your money...");
							}
					}
				
				
				System.out.println("Do you want to keep going?");
				Scanner userInput27 = new Scanner(System.in);
				String keepplaying = userInput27.nextLine();
				
				if(keepplaying.equals("yes"))
					{
						
					}
				else
					{
						keep = false;
						System.out.println("Hope to see u again");
					}
			}

			}

	}
