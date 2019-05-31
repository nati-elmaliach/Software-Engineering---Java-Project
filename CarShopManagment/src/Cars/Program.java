package Cars;



import Cars.jeep.JeepType;
import Cars.motorcycle.MotorCycleType;
import Cars.priCar.CarType;
import Cars.vihecle.Color;
import Cars.vihecle.Fuel;
import Cars.vihecle.Status;


public class Program {
	final static String DB_URL = "jdbc:sqlite" + ":data.db";
	public static void main(String[] args) {
		
		DB dataBase = new DB();
        if(!dataBase.open()){
            System.out.println("Could not open DB");
            return;
        }
        // initialize the dataBase + create tables
        dataBase.initialize();

        // this is how we can query tables
        dataBase.query_table();

        dataBase.close();
	        
		System.out.println("Hello");
		priCar a = new priCar( "112233", "private", "Hyundai", "I30", "2019", 
				Fuel.Benzine, Color.Black , 15560 , (float)4.5,
				0, 120000 , 1600, Status.Available, 4, 4, (float) 15.5, CarType.Managers);
		
		System.out.println("The car details is: " + a.toString());
		
		vihecle[] vihecle = new vihecle[5];
		vihecle[0] = new jeep("564123", "rent", "Toyota", "Land Cruise", "2015", 
			Fuel.Soler, Color.Red, 150000, (float)20.4, 2, 85450, 95
			,Status.InGarage, 3, -5, (float)500.0, JeepType.Area);
		
		vihecle[1] = new truck("102531", "private", "Isuzu", "Turbo", "2013", 
				Fuel.Gaz, Color.White, 195000, (float)150.2, 4, 210000, 144
				,Status.Disabled, 2, 6, (float)1950.3, 3, 5950);
		
		vihecle[2] = new sport("365241", "company", "Volkswagen", "Golf", "2012", 
				Fuel.Benzine, Color.Red, 150000, (float)20.4, 2, 85450, 95
				,Status.Save, 4, 2, (float)420.0, 350, (float)9.5);
		
		vihecle[3] = new motorcycle("985745", "private", "kimco", "downtown", "2017", 
				Fuel.Benzine, Color.Black, 9000, (float)40.5, 1, 35000, 25
				,Status.Available, 2, true, MotorCycleType.Scooter);
		
		vihecle[4] = new priCar( "584575", "private", "Subaro", "Impreza", "2011", 
				Fuel.Benzine, Color.Black , 60000 , (float)4.5,
				0, 120000 , 1600, Status.Available, 4, 4, (float) 15.5, CarType.Sporting);
		
		System.out.println();
		for(int i = 0; i < 5; i++) 
		{
			System.out.println("The car details is: " + vihecle[i].toString());
			
		}
		
	}

}







