package chap99_homework.homework05;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainPage mainPage = new MainPage();
		
		Scanner sc = new Scanner(System.in);
		
		Student[] stArr= new Student[1000];
		
		while(true) {
			mainPage.printMenu(sc, stArr);
		}
	}

}
