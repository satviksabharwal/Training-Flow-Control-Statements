class Assignment12{
	public static void main(String[] args){
	
	if(args.length == 0){
		System.out.print("Please enter the month in numbers!!");
		System.exit(0);
	}
	
	int num = Integer.parseInt(args[0]);
	String month="";
	
	switch(num){
		case 1 : month ="January";
		break;
		case 2 : month ="February";
		break;
		case 3 : month ="March";
		break;
		case 4 : month ="April";
		break;
		case 5 : month ="May";
		break;
		case 6 : month ="June";
		break;
		case 7 : month ="July";
		break;
		case 8 : month ="August";
		break;
		case 9 : month ="September";
		break;
		case 10 : month ="October";
		break;
		case 11 : month ="November";
		break;
		case 12 : month ="December";
		break;
		default : month ="Invalid month";	
		break;
	
	}
	System.out.println(month);

	}
}