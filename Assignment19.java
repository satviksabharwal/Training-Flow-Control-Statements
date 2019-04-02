class Assignment19{
	public static void main(String[] args){
		if(args.length == 0){
		System.out.print("Please enter an integer number.");
		System.exit(0);
		}
		int num = Integer.parseInt(args[0]);
		int i,j;
		for(i=0;i<num;i++){
			for(j=0;j<=i;j++){
				System.out.print("*	");
			}
			System.out.println();
		}
	}
}