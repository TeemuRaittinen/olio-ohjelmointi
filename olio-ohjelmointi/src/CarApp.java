import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) 
		// mainin alku
		{
		String input;
		Scanner in = new Scanner(System.in);
		Car car = new Car("Toyota", "RAV4", 40);
		Car.printInstructions();
		input = in.next();
		
		while (input != "x")
		{
			
		if (input.equals("a"))
				{
			Car.accelerate();
			Car.printInstructions();
			input = in.next();
				}
		else if (input.equals("b"))
		{
			Car.brake();
			Car.printInstructions();
			input = in.next();
		}	
		else if (input.equals("x"))
		{
			break;
		}
		
		}
		
		{
			
		}
		}
		}
		
	

			


	
	
		 class Car 
		
		{
		
			public String brand;
			public static String model;
			public static int amountOfFuel;
			
		public Car()
		{
			brand = "";
			amountOfFuel = 0;
			model = "";
			printData();
		}
		public Car(String carBrand, String carModel, int fuel)
		{
			brand = carBrand;
			model = carModel;
			amountOfFuel = fuel;
			printData();
		}
			public static void brake() 
			{
				System.out.println("Car is breaking");
			}
			public static void accelerate()
			{
				if(amountOfFuel > 0)	
				{
				amountOfFuel = amountOfFuel-1;
				System.out.println("Car is accelerating");
				}
				else
				{
				
				}
			}
			public void printData() 
			{
				System.out.println("Brand: " + brand);
				System.out.println("Model: " + model);
				System.out.println("Fuel: "+ amountOfFuel);
			}
			public static String  getModel() 
			{			
				return model;
			}
			public void setModel(String newModel) 
			{
				model = newModel;
			}
			public void refuel(int amount)
			{
				System.out.println("Fuel in the tank: " + amountOfFuel);
				System.out.println("Refuel: " + amount);
				amountOfFuel = amountOfFuel + amount;
				System.out.println("Fuel in the tank after the refuel: " + amountOfFuel);
			}
			public static void printInstructions() 
			{
				System.out.println("a=accelerate b=break x=exit");
			}
			{
				
			}
			
		
			
		}
			

