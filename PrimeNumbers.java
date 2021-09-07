package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=13;
int i;
int flag=0;

      for(i=2;i <= num;i++)
{
	if(num%2==0)	
	{
		flag=1;
	}
	}
      if(flag==0)
      {
    	 System.out.println("PrimeNumber");
      }
	
	else
		System.out.println("Not a Prime Number");
}
}

