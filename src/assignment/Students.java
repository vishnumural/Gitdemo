package assignment;
/* this is example for constuctor*/
public class Students {
	public Students() {
		System.out.println("hi this is constructor");
	}
	int  rollnumber;
	String name;
public Students(int i,String n)
{
	rollnumber=i;
		name=n;
}
public void display() {
	System.out.println("Roll number is: " + rollnumber + "and Name is: "+ name);	
}
	public static void main(String[] args) {
		Students std = new Students();
		Students std1 = new Students(1,"Prateek");
		Students std2 = new Students(2,"Vishnu");
		std1.display();
		std2.display();
	}

}
