class PowerOfNumber{
	static int powerOfNumber(int num, int exp){
		int result=1;
		while(exp>0){
			result = result*num;
			exp--;
		}
		return result;
	}

	public static void main(String[] args){
		int num = 2;
		int exp = 8;
		System.out.println(powerOfNumber(num, exp));
	}
}