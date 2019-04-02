class Assignment18{
	public static void main(String args[]){
		if(args.length == 0){
		System.out.print("Please enter an integer number.");
		System.exit(0);
		}
		int num = Integer.parseInt(args[0]);
		int sum=0;
		while(num != 0){
			int r = num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.print(sum);
	}
}