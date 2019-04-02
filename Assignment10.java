class Assignment10{
	public static void main(String[] args){
		
		char a = args[0].charAt(0);
		if(a>=65 && a<=90){
			
			System.out.print(a+"->"+Character.toLowerCase(a));
		}
		if(a>=97&&a<=122){
		System.out.print(a+"->"+Character.toUpperCase(a));
	}
	
	}
}