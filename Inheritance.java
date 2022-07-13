
//************************* Single Inheritance********************

/*class A{
	private int  i,j;
	public void setij(int i,int j)
	{
		this.i =i;
		this.j =j;
	}
	public int  geti(){
		return i;
	}
	public int getj() {
		return j;
	}
	public void showij() {
		System.out.println(i);
		System.out.println(j);
	}
	
}
class B extends A  {
	public int k;
	public void showk(){
		int z = geti() + getj()+k;
		System.out.println(k);
		System.out.println("Sum is " + z);
		
	}
}

class In {
	public static void main (String args[]){
		
		B bo = new B();
		bo.setij(10,20);
		bo.showij();
		bo.k =30;
		bo.showk();
	}
} 
*/




//******************************** Multilevel Inheritence *************************
/*
class A {
	public int x;
	public void showx(){
		System.out.println(x);
	}
}
class B extends A {
	public int y;
	public void showy(){
		System.out.println(y);
		
	}
}
class C extends B {
	public int z;
	public void showz() {
		System.out.println(z);
		
	}
}
class D extends C {
	public int s;
	public void shows(){
		s=x+y+z;
		System.out.println("Sum is : " + s);
	}
}

class In {
public static void main (String agrs[]) {
	D d=new D();
	d.x=10;
	d.y=20;
	d.z=30;
	d.showx();
	d.showy();
	d.showz();
	d.shows();
}
}
*/



//****************************************   Hirerchical Inheritance********************


//   Method Overriding : Same Method name with same Parameter

class A  {
	public void show (int x,int y){
		int z = x+y;
		System.out.println("Sum is: " + z);
	}
}
class B extends A  {
	public void show (int x,int y){
		int z = x-y;
		System.out.println("Sub is: " + z);
	}
}
class C extends A  {
	public void show (int x,int y){
		int z = x*y;
		System.out.println("Mul is: " + z);
	}
}
class D extends A {
	public void show (int x,int y){
		int z = x/y;
		System.out.println("Div is: " + z);
	
	}
}

class In {
	public static void main (String agrs[]) {
		 
		 
		 A ao=new A();
		 B bo=new B();
		  C co=new C();
		   D d=new D();
		   ao.show(10,20);
		   bo.show(10,20);
		   co.show(10,20);
		   d.show(10,20);
		   System.out.println("******************************");
		   
		   
		   
		  /* A ao=new A();				**********
		 B bo=new B();
		  C co=new C();
		   D d=new D();
		   
		   
		   A ref;
		   ref =ao;
		   ref.show(10,20);
														This  is
		   ref =bo;							*********    Polymorphism: many
		   ref.show(10,20);
		   
		   ref= co;
		   ref.show(10,20);
		   
		   ref =d;
		   ref.show(10,20);					**********
		   */
		   
		   
		   
		   
		   //     Inhance For loop
		   A p[] = {new A(),new B(),new C(), new D ()};
		   
		   for (A q:p)
			   
			   {
				   q.show(10,20);
		   
		   
			   }
		   
		   
	}
}

*/
