import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
       
        int temp=1;
        int a=sca.nextInt();
        for(int i=1;i<=a;i++) {
            temp=temp*i;	
        }
        System.out.println("factorial:"+temp);
    }
}
