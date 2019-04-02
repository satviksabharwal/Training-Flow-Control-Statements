import java.util.Scanner;
class Assignment15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check whether it is Prime or not");
		int i,cnt=0;
		int num = sc.nextInt();
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