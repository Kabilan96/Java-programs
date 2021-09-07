package week1.day1;

public class FibbonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int firstNumber=0;
		int secondNumber=1;
		int c;
		System.out.println(+firstNumber);
		System.out.println(+secondNumber);
		for(i=1;i<8;i++)
		{
			c=firstNumber+secondNumber;
			System.out.println(+c);
			firstNumber=secondNumber;
			secondNumber=c;
		
		}
	}
	}

