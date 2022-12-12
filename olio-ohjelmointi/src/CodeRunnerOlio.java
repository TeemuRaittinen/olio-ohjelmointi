public class CodeRunnerOlio {

	public static void main(String[] args) 
		// mainin alku
		{
		// muodostetaan 1. olio

		}// mainin lopetus
	

			


		// metodi joka tulostaa annetun koneen tiedot
	
		 class Car 
		
		{
		
			private String brand;
			private static String model;
			private static int amountOfFuel;
			
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
			public void brake() 
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
			
			
				
			
		
			
		}}
			

