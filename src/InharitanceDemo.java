
public class InharitanceDemo {

	public static void main(String[] args) {

	jio j = new jio();
	System.out.println("jio bonus:" + jio.bonus );

	System.out.println("relience salary:" + Relience.salary);
		}
		
		
}

// SINGLE INHARITANCE
class Relience{
	
	// static variable
	static int salary = 100000;

	
	void relience(){
		System.out.println("Parant class");
		
	}
}

class jio extends Relience{
	public String salary;
	static int bonus = 20000;
	
	void Jio() {
		
		System.out.println("child class");
	}
	
	
}




