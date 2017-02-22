//which futurama episode should i watch
import java.util.*;
public class futurama
{
	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		boolean exit= false;
		do{
			
			int season = randomSeasonGenerator();
			int episode = randomEpisodeGenerator(season);
			System.out.println("Your random season of Futurama is " + season + " and your random episode is " + episode);
			System.out.println("Type 'yes' to generate a new episode or type 'no' to exit");
			String response = in.next();

			if(response == "no")
			{
				exit = true;
				System.exit(0);
			}
		}while(exit == false);
	
	}

	public static int randomSeasonGenerator()
	{
		int randomSeason = (int)(Math.random() * 7 + 1);
		return randomSeason;
	}
	public static int randomEpisodeGenerator(int season)
	{
		int random = 0;
		switch(season)
		{
			case 1:
				random = (int)(Math.random() * 9 + 1);
				break;
			case 2:
				random = (int)(Math.random() * 20 + 1);

				break;
			case 3:
				random = (int)(Math.random() * 15 + 1);

				break;
			case 4:
				random = (int)(Math.random() * 12 + 1);

				break;
			case 5:
				random = (int)(Math.random() * 16 + 1);

				break;
			case 6:
				random = (int)(Math.random() * 26 + 1);

				break;
			case 7: 
				random = (int)(Math.random() * 26 + 1);

				break;
		}
		return random;
	}
}
