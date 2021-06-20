package sachin.ASSign;
interface Sachin
{
	 void speed();
	 void milage();
	 void color();
}
class Mycar implements Sachin
{
	public void speed()
	{
		System.out.println("Speed of car is 120 kmph ");
	}
	 public void milage() {
		 System.out.println("milage of car is 24 kmpl"); 
	 }
	 public void color()
	 {
		 System.out.println("Car colour is White");
	 }
}


public class VechileInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Sachin s=new Mycar();
      s.color();
      s.milage();
      s.speed();
	}

}
