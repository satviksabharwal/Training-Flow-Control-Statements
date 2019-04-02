class Assignment21{
	public static void main(String[] args){
	if(args.length==0){
		System.out.print("Please enter an Integer number");
		System.exit(0);
	}
	int n = Integer.parseInt(args[0]);
	int r,rev=0;
	int num=n;
	while(num!=0){
		r = num%10;
		rev = rev*10+r;
		num=num/10;
	}
	if(n==rev){
	System.out.print(n +" is a Palindrome");
	}else{
		System.out.print(n+" is not a Palindrome");
	}
	
	
	}
}