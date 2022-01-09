class Emp
{
    String Name="";
    int Year_Of_Joining;
    String address;
    void emp1()
    {
    	Name="Robert";
    	Year_Of_Joining=1994;
    	address="64C-WallStreet";
    	System.out.println("Name:"+Name);
    	System.out.println("Year of Joining :"+Year_Of_Joining);
    	System.out.println("Address:" +address);
    }
    void emp2()
    {
    	Name="Sam";
    	Year_Of_Joining=2000;
    	address="68D-WallStreet";
    	System.out.println("Name:"+Name);
    	System.out.println("Year of Joining :"+Year_Of_Joining);
    	System.out.println("Address:" +address);
    }
    void emp3()
    {
    	Name="John";
    	Year_Of_Joining=1999;
    	address="26B-WallStreet";
    	System.out.println("Name:"+Name);
    	System.out.println("Year of Joining :"+Year_Of_Joining);
    	System.out.println("Address:" +address);
    }

}
public class Employee
{
	public static void main(String []args)
	{
		Emp e=new Emp();
		e.emp1();
		e.emp2();
		e.emp3();
	}
}
