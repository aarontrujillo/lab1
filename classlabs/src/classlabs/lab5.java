package classlabs;
//lab 1
import java.util.*;
public class lab5 
{
	public static void main(String [] args)
	{
		int count = 1;
		int computerNum = (int)(Math.random()*10);
		
		Scanner input = new Scanner(System.in);

	while (count < 4){
		
		System.out.println("Guess a number between 1 to 10: ");
		int guess = input.nextInt();
		System.out.printf("Random number is %d\n", computerNum );
		
		if(guess == computerNum)
		{
			System.out.println("Correct!");
			}else
			{
				if(guess <= computerNum)
				{
					System.out.println("Too low , play again.");
				}else{
					if (guess >= computerNum)
					{
						System.out.println("Too high, play again.");
					}
					}
				}
		
		System.out.println("Count is: " + count); count++; 
	}
}
}