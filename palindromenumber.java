public class Palindromenumber {
public static void main(String[]args)
{
	int n= 122,temp=n,rev=0;
	while(temp!=0)
	{
		rev = rev*10+temp%10;
		temp/=10;
	}
	System.out.println(n==rev?"palindrome":"not");
}
}
