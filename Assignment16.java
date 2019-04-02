class Assignment16{
	public static void main(String[] args){
		int i,j,cnt=0;
		for(i=10;i<=99;i++){
			for(j=2;j<i;j++){
			if(i%j==0){
			cnt++;
			}
		}
		if(cnt==0){
			System.out.println(i);
		}
		cnt=0;
		}
	}
}