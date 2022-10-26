package CinemaApp;
// Using Cinema and CinemaApp from last week, solve each of the problems below:
public class Cinema {
	private int age;
	private double cost;
	
	//constructor
	public Cinema(){
		//age = 0;
		//cost = 0.0;
	}
	//compute
	public void compute()
	{
		if(age < 5)
		{
			cost = 0.0;
		}
		else if(age >= 5 && age <= 14)
		{
			cost = 5.0;
		}
		else if(age >= 15 && age <= 65)
		{
			cost = 10.0;
		} else 
		{
			cost = 0.0;
		}
		
	}

	//set
	public void setAge(int age)
		{
			this.age = age;
		}
	//getters
	public double getCost()
	{
		return cost;
		
	}
}
