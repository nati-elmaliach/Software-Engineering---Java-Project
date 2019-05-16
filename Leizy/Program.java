package Leizy;

import Leizy.priCar.CarType;
import Leizy.vihecle.Color;
import Leizy.vihecle.Fuel;
import Leizy.vihecle.Status;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello");
		/*car a = new car();
		a.showCar();
		System.out.println();
		a.setCarFuel(Fuel.Benzine);
		a.showCar();*/
		/*vihecle a = new vihecle( "112233", "private", "Hyundai", "I30", "2019", 
				Fuel.Benzine, Color.Black , 15560 , (float)4.5,
				0, 120000 , 1600, Status.Available);
		System.out.println("The car details is: " + a.toString());*/
		priCar a = new priCar( "112233", "private", "Hyundai", "I30", "2019", 
				Fuel.Benzine, Color.Black , 15560 , (float)4.5,
				0, 120000 , 1600, Status.Available, 4, 4, (float) 15.5, CarType.Managers);
		
		System.out.println("The car details is: " + a.toString());
	}

}
