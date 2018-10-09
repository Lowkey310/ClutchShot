import java.util.ArrayList;

public class PlayerStats
	{
		public static ArrayList<Player> player = new ArrayList<Player>();

		public static void fillArray()
			{

				player.add(new Player("Matthew Veen", 65));
				player.add(new Player("Stephen Curry", 48));
				player.add(new Player("Kobe Bryant", 37));
				player.add(new Player("Lonzo Ball", 23));
				player.add(new Player("DeAndre Jordan", 11));

			}

	}
