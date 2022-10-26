package CinemaApp;

import java.util.Scanner;

/*Cinema2App:
Modify the Cinema application to allow the user to check the cost of 2 tickets. 
The application should accept the age from the user 2 times, calculating and outputting the cost each time.
*/
public class CinemaApp2 {

	public static void main(String[] args) {
		int age;
		double cost;
		
		Scanner scan = new Scanner(System.in);
		Cinema cinema = new Cinema();
		
		for(int i = 0; i < 2; i++)
		{
			System.out.println("Enter the age for the person: "+ (i+1));
			age = scan.nextInt();
			cinema.setAge(age);
			cinema.compute();
			cost = cinema.getCost();
			System.out.println("The cinema for a person aged: " + age + " is: "+ cost);
		}

	}

}
