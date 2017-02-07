public static int bitSwapRecquired(int a, int b){
	int count = 0;
	for(int c = a ^ b; c != 0; c = c >> 1){
		count = count + c & 1;
	}
	return count;
}