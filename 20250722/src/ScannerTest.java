import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>");
		String inputData = sc.nextLine();
		int num = Integer.parseInt(inputData);
		
		if (num > 89) {
			System.out.println("A");
		}	else if (num > 79) {
			System.out.println("B");
		}	else if (num > 69) {
			System.out.println("C");
			
		}	else{
			System.out.println("F");
		}
		
	}

}
