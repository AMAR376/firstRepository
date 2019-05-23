
public class A {
public void print() {
	
	System.out.println("class A method");
}

public void print2(int a) {
	int b = a;
	
	System.out.println("class A method b="+b);
}


}
   class B extends A{
	   public void print() {
			
			System.out.println("class B method");
		} 
	   
	   public void print2(int c) {
			int d=c;
			System.out.println("class B1 method c="+c);
		}
	   
	   public static void main(String[] args) {
	 A a=new B();
		 //  B b=new A();
		a.print2(3);
		a.print();
	}
  }