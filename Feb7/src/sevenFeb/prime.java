package sevenFeb;

public class prime
{
public static void main(String[]args)
{
	
int number = 7;
int a=0;
for (int i=2; i<=number/2; i++)
{
	if (number%i==0)
	{
	System.out.println(number+ "is not prime");	
	a=1;
	}
}
	if (a==0)
	{
		System.out.println(number+"is prime" );
		}	
	}
	}
	

