class Animal
{
	protected String var="Animal";
	public void display()
	{
		System.out.println("This is class "+var);
	}
}
class Cat extends Animal
{
	private String var="Cat";
	public void displayCats()
	{
		System.out.println("This is "+var+" , Cat is an "+super.var);	
	}
}
class Dog extends Animal
{
	private String var="Dog";
	public void displayDogs()
	{
		System.out.println("This is "+var+" , Dog is an "+super.var);
	}
}
class HierarchicalInheritance
{
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.display();
		Cat c=new Cat();
		c.displayCats();
		Dog d=new Dog();
		d.displayDogs();
	}
}