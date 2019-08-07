import javafx.application.Application;
class Employee{
	private double salary;
	private String name;
	private int id,age;
	private static int nextID=1;

	Employee (int age,double salary,String name){
	this.age=age;
	this.salary=salary;
	this.name=name;
	id=nextID++;
	}
	public int getAge(){return age;}
    
    public double getSalary(){return salary;}

    public int getID(){return id;}
    public String getName(){return name;}
    public static int getNextID(){return nextID;}

	}

class testStatic{
public static void main(String[] args){
	System.out.println("Here is the initial available ID "+Employee.getNextID());
	Employee john,mary;
	mary=new Employee(34,61563.67,"mary madeline");
	System.out.println("\n Employee Name: "+mary.getName()+"\n Employee ID: "+mary.getID());
	john=new Employee(44,38762.87,"john Russell");
	System.out.println("\n Employee Name: "+john.getName()+"\n Employee ID: "+john.getID());
	System.out.println("Here is the next available ID: "+Employee.getNextID());
}

}