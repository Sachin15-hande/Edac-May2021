package sachin.ASSign;
/*Q1.Create two classes named Mammals and MarineAnimals.
Create another class named BlueWhale which inherits both the
above classes. Now, create a function in each of these classes
which prints "I am mammal", "I am a marine animal" and "I
belong to both the categories: Mammals as well as Marine
Animals" respectively. Now, create an object for each of the
above class and try calling*/
class Mammals
{
	void show()
	{
		System.out.println("I am Mammal");
	}
}
class MarineAnimals
{
	void show()
	{
		System.out.println("I am Marine Animal");
	}
}
class BlueWhale extends MarineAnimals
{    void show()
	{
	show();
	System.out.println("I belongs to both the categories:Mammals as well as Marine Animals");
	}
	
}
public class InheritanceMamals {

	public static void main(String[] args) {
		MarineAnimals b=new MarineAnimals();
		b.show();
		
		
		
	}

}
