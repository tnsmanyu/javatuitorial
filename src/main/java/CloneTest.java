
public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Department d = new Department();
		d.deptName = "IT";
		
		
		Employee e = new Employee();
		e.name = "manyu";
		e.id = 10;
		e.dept = d;
		
		//cloneable
		Employee newEmp;
		try {
			newEmp = (Employee) e.clone();
			System.out.println(newEmp.name);
			System.out.println(newEmp.dept);
			
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}

}



class Employee implements Cloneable{
	
	
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	int id;
	
	Department dept;
	
	int salary;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return null;
		
	}
	
	
}

class Department{
	
	String deptName;
	
}
















