import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter");
	int	a=sc.nextInt();
	int temp=0;
	int pal=a;
while(a!=0) {
	int rem=a%10;
	temp=temp*10+rem;
	a=a/10;
}
if(pal==temp) {
System.out.println("Palindrome------"+temp);	
}
else 
{
System.out.println("Reverse----"+temp);
}	
}
}
