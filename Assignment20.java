class Assignment20{
	public static void main(String[] args){
		
		if(args.length == 0){
			System.out.print("Please enter an integer number.");
			System.exit(0);
		}
		int num = Integer.parseInt(args[0]);
		int r,rev=0;
		while(num !=0){
			r = num %10;
			rev = rev*10 + r;
			num = num/10;
		}
		System.out.print(rev);
	}
}

		
		