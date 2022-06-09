class Str2{
	public static void main (String args[]){
		StringBuilder s= new StringBuilder("Aakash");
		
		System.out.println(s.capacity());	//16+ s = 
		
		System.out.println(s.append(" Patil"));
		
		System.out.println(s.length());
		
		
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.reverse());
		
	}
}