import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();
    String b2 = Integer.toString(b);

	System.out.println(a * (b2.charAt(2)-'0'));
	System.out.println(a * (b2.charAt(1)-'0'));
	System.out.println(a * (b2.charAt(0)-'0'));
	System.out.println(a*b);
	}
}
