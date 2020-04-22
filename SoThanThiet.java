import java.util.Scanner;

public class SoThanThiet {

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
		
		System.out.print("Nhap so thu nhat: ");
		int firstNumber = scan.nextInt();
		System.out.print("Nhap so thu 2: ");
		int secondNumber = scan.nextInt();
		
		if ((tongCacUoc(firstNumber) == secondNumber) && (tongCacUoc(secondNumber) == firstNumber)) {
			System.out.println("cap so tren la so than thiet");
		} else {
			System.out.println("cap so tren khong phai la so than thiet");
		}
	}
}
