public static int findRank(String str){
		int res = 0;
		for(int i = 0; i < str.length(); i++){
			int findSmallerInRight = 0;
			int cur = (int)(str.charAt(i) - 'a');
			for(int j = i+1; j < str.length(); j++){
				int temp = (int)(str.charAt(j) - 'a');
				if(temp < cur){
					findSmallerInRight++;
				}
			}
			res += findSmallerInRight * factorial(str.length()- i - 1);
		}
		return res+1;
	}
	
	public static int factorial(int n){
		if(n <= 1)
			return 1;
		return n * factorial(n-1);
	}
	
	public static void main(String[] args){
		System.out.println(findRank("acb"));
	}