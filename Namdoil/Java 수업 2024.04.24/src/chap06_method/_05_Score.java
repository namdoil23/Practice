package chap06_method;

import java.util.Scanner;

import chap06_method.score.Score;

public class _05_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score score = new Score();
		
		int studentCnt;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요.");
		studentCnt = sc.nextInt();
		
		int[] scores = new int[studentCnt];
		
		for(int i = 0; i < studentCnt; i++) {
			System.out.print("점수를 입력하세요.");
			scores[i] = sc.nextInt();
		}
		
		//scores = {10, 20, 30, 40, 50}
		System.out.println("점수의 총합은: " + score.getTotalScore(scores));
		System.out.println("점수의 평균은: " + score.getAvgScore(scores));
		
		sc.close();
		
		
		
		
		
		
	}

}
