class A{    //Constructor Its name is same as class name but without any  return type
	

	private int x,y;
	public A(int x,int y){    //Constructor
		this.x = x;
		this.y =y;
		
	}
	
	public void show(){  		//method    
		
		System.out.println(x);
		System.out.println(y);
		
	};
}class Mac{
	
	public static void main (String args[]){ 
	
	 new A(10,20);
	
	
	
	
	
	
	
	}
}
