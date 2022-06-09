class Str{
	public static void main(String args[]){
		String s= new String ("AAkash");   // by using new keywrd Aakash store in heap &&&&&  the constant "AAkash" will store in SCP   tht means 2 obj are created 1 in Heap  Area and 2 in SCP
				s = "Akash ";    //SCP (String constant pool) 
				
				
		s.concat("Patil");		//notn able concat bcz it Stores in heap 
		s=s.concat(" Patil");  //this will concat 
		
		
		StringBuffer c= new StringBuffer("Pune");		//StringBuffer is Mutable  
		c.append (" City ");
		
		StringBuilder  m= new StringBuilder("My ");   //  Builder Default Capacity is 16
		m.append(" Home");
		
		System.out.println(s);  // And Show Aakash patil bcz of s=....  string is not mutable
		
		System.out.println(c);	//  OP: Pune City bcz of Stringbuffer
		
		System.out.println(m);	 // same as StringBuffer
	}
}