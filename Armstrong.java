import java.util.Scanner;

public class Arm {
    public int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
    public void checkArmstrong() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give your Value");
        int a = in.nextInt();
        
        int temp = a;
        int n = countDigits(a);
        
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp = temp / 10;
        }

        if (a == sum) {
            System.out.println(a + " is an Armstrong number.");
        } else {
            System.out.println(a + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        Arm m = new Arm();
        m.checkArmstrong();
    }
}

