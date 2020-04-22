import java.util.Scanner;

public class SoHuaHon {

	public static int tongCacUoc(int number) {
		int tongCacUoc = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				tongCacUoc += i;
			}
		}
		return tongCacUoc;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (i < 100) {
			System.out.print("Nhap so thu nhat: ");
			int firstNumber = scan.nextInt();
			System.out.print("Nhap so thu 2: ");
			int secondNumber = scan.nextInt();

			boolean ketQua = false;
			if ((firstNumber < 0) || (secondNumber < 0)) {
				ketQua = false;
			} else if ((firstNumber % 2 == 0 && secondNumber % 2 == 0)
					|| (firstNumber % 2 != 0 && secondNumber % 2 != 0)) {
				ketQua = false;
			} else if ((tongCacUoc(firstNumber) == secondNumber + 1) && (tongCacUoc(secondNumber) == firstNumber + 1)) {
				ketQua = true;
			} else {
				ketQua = false;
			}

			if (ketQua == true) {
				System.out.println("Cap so la so hua hon");
			} else {
				System.out.println("cap so khong phai la so hua hon");
			}
			System.out.println();
			i++;
		}
	}
}
