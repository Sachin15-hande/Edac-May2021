package sachin.ASSign;
/*We want to store the information of different vehicles. Create a
class named Vehicle with two data member named mileage and
price. Create its two subclasses
*Car with data members to store ownership cost, warranty (by
years), seating capacity and fuel type (diesel or petrol).
*Bike with data members to store the number of cylinders,
number of gears, cooling type(air, liquid or oil), wheel
type(alloys or spokes) and fuel tank size(in inches)
Make*/
class Vehicle
{
	float milage;
	float price;
}
class Car extends Vehicle
{
	float ow_cost;
	float cost;
	int warrenty;
	int seat;
	String fueltype;
}
class Bike extends Vehicle
{
	int no_ofcylinders;
	int no_gears;
	String cooling_type;
	String wheel_type;
	float tank_size;
}
	class Audi extends Car
	{
		String model_type;		
		public void setdetails(String model_type,float ow_cost,int warrenty,int seat,String fueltype,float milage,float price)
		{
			this.model_type=model_type;
			this.ow_cost=ow_cost;
			this.warrenty=warrenty;
			this.seat=seat;
			this.fueltype=fueltype;
			this.milage=milage;
			this.price=price;
		}
		public void showdetails()
		{
			System.out.println("model type is " + model_type);
			System.out.println("Owner Ship cost of this car is " + ow_cost + " Rs ");
			System.out.println("Warrenty of this Audi car is " + warrenty + "Years");
			System.out.println("seating capcity Audi car is " + seat + " Nos ");
			System.out.println("Fuel Type of Audi car is " + fueltype);
			System.out.println("Milage of Audi car is " + milage);
			System.out.println("Price of Audi car is " + price);	
		}
	}
	class Ford extends Car
	{
		String model_type;
		public void setdetils()
		{
			
		}
	}
	class Bajaj extends Bike
	{
		String make_type;
	}
	class Tvs extends Bike
	{
		String make_type;
	}	

		
public class VehicleMain {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.setdetails("Audi A3", 1289540, 20, 4, "Petrol", 30.90f,4500000.90f);
		a.showdetails();
	}


}