package sec01.exam01;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수  | 2.점수입력  | 3.점수리스트  | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택>");
			
			
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			
			switch scanner
			case 1:
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for (int i=0; i < studentNum; i++) {
					System.out.printf("score[%d>", i);
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
			case 3:
				for (int i=0; i < studentNum; i++) {
					System.out.printf("score[%d]>%d\n", i, scores[i]);
				}
				break;
			case 4:
				int max = 0;
				int avg = 0;
				for (int i=0; i < studentNum; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
				}
				break;
				
			case 5:
				run = false;
				break;

		System.out.println("프로그램 종료");
		
	}
}
