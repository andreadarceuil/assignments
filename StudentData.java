
public class StudentData {
	
	String name;
	int age;
	int id;
	//default constructor
	public StudentData() {}
	
	//parameterized constructor
	public StudentData(int id, String name, int age) {this.id = id; this.name=name; this.age =age;}
	
	//getters and setters
	public String getStuName() {return name;}
	public int getStuAge() {return age;}
	public int getStuID() {return id;}
	public void setStuName(String name) {this.name = name;}
	public void setStuAge(int age) {this.age = age;}
	public void setStuId(int id) {this.id =id;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	       //This object creation would call the default constructor
	       StudentData myobj = new StudentData();
	       System.out.println("Student Name is: "+myobj.getStuName());
	       System.out.println("Student Age is: "+myobj.getStuAge());
	       System.out.println("Student ID is: "+myobj.getStuID());
	 
	       /*This object creation would call the parameterized
	        * constructor StudentData(int, String, int)*/
	       StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
	       System.out.println("Student Name is: "+myobj2.getStuName());
	       System.out.println("Student Age is: "+myobj2.getStuAge());
	       System.out.println("Student ID is: "+myobj2.getStuID()); 

	}

}
