import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int h = sc.nextInt();
	int m = sc.nextInt();
	int t = sc.nextInt();

	h += t / 60;	// 요리시간이 60분을 넘어가면 몫 만큼 '시'에 더함
	m += t % 60;	// 요리시간만큼 '분'에 더함

	if (m >= 60) {	// '분'이 60 이상이면
	   h += 1;	// '시'에 1 증가
	   m -= 60;	// '분'에는 60 뺄셈
	}

	if (h >= 24) {	// '시'가 24 이상이면
	   h -= 24;	// '시'에 24 뺄셈 (25시는 1시로 나타날 수 있도록)
	}

	System.out.println(h + " " + m);
    }
}
