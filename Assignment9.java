class Assignment9{
	public static void main(String[] args){
		String gender = args[0];
		int age = Integer.parseInt(args[1]);
		String a = "Female";
		String b = "Male";
		if(gender.equals(a))
		{
			
			if(age>=1 && age<=58){
				System.out.println("The percentage of interest is 8.2%.");
			}
			if(age>=59&&age<=100){
				System.out.println("The percentage of interest is 9.2%.");
			}
		}
		if(gender.equals(b))
		{
			if(age>=1&&age<=58){
				System.out.println("The percentage of interest is 8.4%.");
			}
			if(age>=59&&age<=100){
				System.out.println("The percentage of interest is 10.5%.");
			}
		}
	}
}