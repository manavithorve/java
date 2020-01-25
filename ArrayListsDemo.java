/*Collection Framework*/
/*ArrayList is a class derived from List Interface..*/
import java.util.*;
class ArrayLists 
{
	public ArrayList<String> list=new ArrayList<String>();
	public ArrayLists()
	{
		System.out.println("------------ArrayList implements List-------------");
	}
	public void addElement(String element)
	{
		list.add(element);
	}
	public void removeElement(String element)
	{
		list.remove(element);
	}
	public int searchElement(element)
	{
		if(list.contains(element))
		{
			return list.indexOf(element);
		}
		else
		{
			return -1;
		}
	}
	public int modifyElement(element,new_element)
	{
		if(list.contains(element))
		{
			list.set(list.indexOf(element),new_element)
		}
		else
		{
			return -1;
		}
	}                                                   
} 
public class ArrayListsDemo 
{
	public static void main(String args[])
	{
		public int element;
		Scanner sc= new Scanner(System.in);
		ArrayLists a=new ArrayLists();
		System.out.println("1.Add element\n2.Remove element\n3-Modify element\n4-Search element");
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:	System.out.println("Enter the element to be added: ");
					element=sc.next(); 
					a.addElement(element);
			break;
			case 2: System.out.println("Enter the element to be removed: ");
					element=sc.next();
					a.removeElement(element);
			break;
			case 3: System.out.println("Enter the element to be modified: ");
					element=sc.next();
					System.out.println("Enter new element: ");
					int new_element=sc.next();
					a.modifyElement(element,new_element);
			break;
			case 4: System.out.println("Enter the element to be searched: ");
					element=sc.next();
					int position=a.searchElement(element);
					if(position!= -1)
					{
						System.out.println("Element found at location: "+position);
					}
					else
					{
						System.out.println("Element Doesn't exits!");
					}
			break;
			default: System.out.println("Wrong choice!");
		}
	}
}
