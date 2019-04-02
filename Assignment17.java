class Assignment17{
	public static void main(String[] args){
		int i,cnt=0;
		if(args.length==0){
		System.out.println("Please enter an integer number.");
		System.exit(0);
		}
		int num = Integer.parseInt(args[0]);
		if(num==1 || num==0){
		System.out.print(num+" it is neither prime nor composite.");
		}
		else{
		for(i=2;i<num;i++){
			if(num%i==0){
			cnt++;
			}
		}
		if(cnt==0){
				System.out.print(num+" is a prime number.");
		}else{
				System.out.print(num+" is not a prime number.");
		}
		}
		
	
	}
}