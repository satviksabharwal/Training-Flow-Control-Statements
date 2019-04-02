class Assignment8{
	public static void main(String[] args){
		char a = args[0].charAt(0);
		if((a >= 65 && a <= 90) || (a >= 97 && a <= 122)){
			System.out.print("Alphabet");
		}
		else if(a>=48 && a<=57){
			System.out.print("Digit");
		}
		else{
			System.out.print("Special Character");
		}
	}
}