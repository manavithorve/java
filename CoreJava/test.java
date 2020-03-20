import java.util.*;
import java.io.*;

class Library
{
    int num_books;
    int num_days;
    int num_booksPerDay;
    int book[];
	Scanner sc=new Scanner(System.in);
    public void setNumBooks(int num_books)
    {
        this.num_books=num_books;
    }
    public void setNumDays(int num_days)
    {
        this.num_days=num_days;
    }
    public void setNumBooksPerDay(int num_booksPerDay)
    {
        this.num_booksPerDay=num_booksPerDay;
    }
    public int[] getBooks()
    {
        for(int j=0;j<num_books;j++)
        {
            book[j]=sc.nextInt();
        }
        return book;
    }
}
class test
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		int num_books=sc.nextInt();
		int num_libs=sc.nextInt();
		int num_days=sc.nextInt();
		int arr_id[]=new int[num_books];
		int num_booksForLib;
		int num_daysForLib;
		int	num_booksPerDay;
		int books[];
		Library lib[]=new Library[num_libs];
        
		for(int i=0;i<num_books;i++)
        {
            arr_id[i]=sc.nextInt(); 
        }
        for(int i=0;i<num_libs;i++)
        {
            num_booksForLib = sc.nextInt();
            num_daysForLib = sc.nextInt();
            num_booksPerDay = sc.nextInt();
			lib[i]=new Library();
            lib[i].setNumBooks(num_books);
            lib[i].setNumDays(num_days);
            lib[i].setNumBooksPerDay(num_booksPerDay); 
			books=lib[i].getBooks();
        }
        System.out.println("Ok");
    }

}
