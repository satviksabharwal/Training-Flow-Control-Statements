import java.util.Scanner;
class Assignment11{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a color code");
		char a = sc.next().charAt(0);
		switch(a){
			
			case 'R' : System.out.print(a+"->"+"Red");
			break;
			case 'B' : System.out.print(a+"->"+"Blue");
			break;
			case 'G' : System.out.print(a+"->"+"Green");
			break;
			case 'O' : System.out.print(a+"->"+"Orange");
			break;
			case 'Y' : System.out.print(a+"->"+"Yellow");
			break;
			case 'W' : System.out.print(a+"->"+"White");
			break;
			default : System.out.print("Invalid Code");
			
		
		}
		/*if(a == 'R' || a == 'r'){
			System.out.print(a+"->"+"Red");
		}
		else if(a == 'B' || a == 'b'){
			System.out.print(a+"->"+"Blue");
		}
		else if(a == 'G' || a == 'g'){
			System.out.print(a+"->"+"Green");
		}
		else if(a == 'O' || a == 'o'){
			System.out.print(a+"->"+"Orange");
		}
		else if(a == 'Y' || a == 'y'){
			System.out.print(a+"->"+"Yellow");
		}
		else if(a == 'W' || a == 'w'){
			System.out.print(a+"->"+"White");
		}
		else{
			System.out.print("Invalid Code");
		}*/
		
	}
	
}