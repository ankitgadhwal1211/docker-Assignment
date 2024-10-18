import java.util.Scanner;
public class SumOfMinAndMax {
       public static void main(String []args) {
       	System.out.println("Enter three numbers");
       	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt(); 
	int num3 = sc.nextInt(); 
	int max = (num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3));

	System.out.println("max = "+ max);
	int min = (num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3));
	System.out.println("min = "+ min);
	int sum = max + min;
	System.out.println("Sum = "+ sum);
       }
}
