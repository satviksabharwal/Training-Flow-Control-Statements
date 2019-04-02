class Assignment22{
	public static void main(String[] args){

		int i=1,cnt=0;
		while(cnt<5){
			if(i%2==0 && i%3==0 && i%5==0){
				System.out.println(i);
				cnt++;
			}
			i++;
		}
	}
}
	