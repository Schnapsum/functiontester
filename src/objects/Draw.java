package objects;

public class Draw {
	private int day;
	private int month;
	private int year;
	private int number1;
	private int number2;
	private int number3;
	private int number4;
	private int number5;
	private int bonus1;
	private int bonus2;
	
	public Draw(int d, int m, int y, int n1, int n2, int n3, int n4, int n5, int b1, int b2){
		day = d;
		month = m;
		year = y;
		number1 = n1;
		number2 = n2;
		number3 = n3;
		number4 = n4;
		number5 = n5;
		bonus1 = b1;
		bonus2 = b2;
	}
	
	public String toString(){
		return 		day+"."+month+"."+year+" "+
					number1+"-"+number2+"-"+number3+"-"+number4+"-"+number5+"-"+
					bonus1+"-"+bonus2;
	}
}
