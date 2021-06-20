package sachin.ASSign;
class Fruit
{
	int n;
	public void showfr(Apple a,Mangoes m)
	{
		
		System.out.println("No of fruits in the basket is " + (a.n+m.n));
	}
}
class Apple extends Fruit
{
	
	public void showfr()
	{
		System.out.println("No of Apples in the Basket is " + n);	
	}
}
class Mangoes extends Fruit
{
	
	public void showfr()
	{
		System.out.println("No of Mangoes in the Basket is " + n);
	}
}
public class Fruitcal {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.n=10;       //no apples
		a.showfr();
		Mangoes m=new Mangoes();
		m.n=20;
		m.showfr();      //no mangoes
		m.showfr(a, m);    //no of fruits
	}

}
