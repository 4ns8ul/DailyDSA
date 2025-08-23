class Program{
	static double newtonRaphsonFun(int num){
		//Formula --> 0.5*(X+(num/X))
		
		double tolerance = 0.0001;
		
		double root;
		double X = num;
		while(true){
			root = 0.5 * (X + (num/X));
			double ans = X - root;
			if(ans < tolerance) break;
			
			X=root;
		}
		return root;
	}
    public static void main(String[] args){
        
    }
}