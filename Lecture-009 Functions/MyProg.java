class Temp{
	int myVar = 10;
}



class MyProg{
	public static void main(String[] args){
		MyProg mp = new MyProg();
		
		
		Temp obj1 = new Temp();
		Temp obj2 = new Temp();
		
		obj1.myVar = 10;
		obj2.myVar = 20;
		System.out.println(obj1.myVar + ", " + obj2.myVar);
		
		
		mp.swapB(obj1, obj2);
		
		
		// System.out.println(mp.calculatorArea(10, 15));
		// mp.swap(10, 15);
		
	}
	
	
	public void swapB(Temp obj1, Temp obj2){
		System.out.println(obj1.myVar + ", " + obj2.myVar);
		int temp = obj1.myVar;
		obj1.myVar = obj2.myVar;
		obj2.myVar = temp;
		System.out.println(obj1.myVar + ", " + obj2.myVar);
	}
	
	public void swap(int val1, int val2){
		int temp = val1;
		val1 = val2;
		val2 = temp;
		System.out.print(val1 + " " + val2);
	}
	
	public int calculatorArea(int length, int width){
		System.out.println(length*width);
		return length * width;
	}
}