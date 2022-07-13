/*class A {	//Method Overloading: Method Names are same but Parameters are different
	public void show(){
			System.out.println("No Parameer");
			
}
	public void show(int x){
		System.out.println("Int is: " + x); 
}
	public void show (int x,int y){
		int z = x+y;
		System.out.println("Sum is : " + z);
	}
	public double show (double x){
		return x*x;
	}
}

class Mo {
   public static void main (String args []){
	   A ao = new A();
	   ao.show();
	   ao.show(10,20);
	   System.out.println(ao.show(14.7));
	   
   }
}
*/





// Constructor Overloaading : same Constructor name with Different parameter




			/// difference in MO and CO is  in MO we have to create only one object  but in Constructor verloading every Constructor we need Seperate (NEW) object

class A {
	private int x,y;
	private String name;
	public A() {
		x=10;
		y=20;
		name="Aakash";
		
	}
	public void show() {
		System.out.println("X is: " + x);
		System.out.println("Y is : " + y);
		System.out.println("Name is : " + name);
	}
	public A (int x){
		this.x =x;
	}
	public A(int x,int y,String name){
		this.y =y;
		this.x =x;
		this.name =name;
	}
}

class Mo {
   public static void main (String args []){
	  A ao=new A();
	  ao.show();
	  
	  A ao2= new A(11);      //new Object
	  ao2.show();
	  
	  A ao3 =new A(20,30,"Aakash");
	  ao3.show();
	   
   }
}
