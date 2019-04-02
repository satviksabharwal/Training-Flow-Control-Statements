class Assignment6{
	public static void main(String args[]){
		int a = args.length;
		if(a==0){
			System.out.println("No Values");
		}
		else{
			for(String n:args){
					System.out.print(n+",");
			}
		}
	}
}