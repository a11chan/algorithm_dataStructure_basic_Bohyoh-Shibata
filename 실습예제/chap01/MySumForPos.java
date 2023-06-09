package chap01;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다(양수만 입력).

class MySumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int targetNumber;

		System.out.println("1부터 n까지의 합을 구합니다.");

		do {
			System.out.print("n의 값 : ");
			targetNumber = stdIn.nextInt();
		} while (targetNumber <= 0);

		int sum = 0;

		for (int i = 1; i <= targetNumber; i++) sum += i;

		System.out.println("1부터 " + targetNumber + "까지의 합은 " + sum + "입니다.");
	}
}