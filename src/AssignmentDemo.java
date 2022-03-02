
public class AssignmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Relational obj = new Relational(20 , 181);
	obj.max();	

	}
}



class Assignment{
	int a, b;
	Assignment(int x, int y){
		a = x;
		b = y;
		
	}
	void plusEqual() {
		
		a=a + 10;
		System.out.println(('a'+10));
	}
}

class Relational{
	int a, b;
	Relational (int x, int y){
		a= x;
		b= y;
	}
	void max() {
		
		boolean res = a<b;
		System.out.println("is<a<b?"+ res);
		
		int max = (a>b)? a:b;
		
		System.out.println("Maximu:"+ max);
		
		int diff =(a>b)? a-b: b-a;
		System.out.println("Difference:"+ diff);
		
	
		
	}
}





