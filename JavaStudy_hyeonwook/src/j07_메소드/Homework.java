package j07_메소드;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// 앞에 했던 메뉴들을 메소드화 시키는게 숙제
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		while(loopFlag) {
			char select = 0;
			
			System.out.println("[메뉴선택]");
			System.out.println("1. Java");
			System.out.println("2. Python");
			System.out.println("3. Javascript");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("명령을 입력하세요:");
			select = scanner.next().charAt(0);
			scanner.nextLine();
			
			if(select == 'q') {
				break;
			}else if(select == '1') {
				System.out.println("Java를 선택하셨습니다.");
				while(true) {
					System.out.println(" [ Java 메뉴 ]");
					System.out.println("1. Java란?");
					System.out.println("b. 뒤로가기");
					
					System.out.println("명령을 입력하세요:");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == 'q') {
						loopFlag = false;
						break;
					}else if(select == '1') {
						System.out.println("자바란...입니다...");
						System.out.println("계속하시려면 엔터를 눌러주세요...");
						scanner.nextLine();
					}
				}
			}else if(select == '2') {
				System.out.println("Python을 선택하셨습니다.");
				while(true) {
					System.out.println(" [ Python 메뉴");
					System.out.println("1. Python이란?");
					System.out.println("b. 뒤로가기");
					
					System.out.println("명령을 입력하세요:");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
						System.out.println("파이썬이란...입니다...");
						System.out.println("계속하시려면 엔터를 눌러주세요...");
						scanner.nextLine();
					}
				}
				
			}else if(select == '3') {
				System.out.println("Javascript를 선택하셨습니다.");
				while(true) {
					System.out.println(" [ Javascript 메뉴 ]");
					System.out.println("1. Javascript란?");
					System.out.println("b. 뒤로가기");
					
					System.out.println("명령을 입력하세요:");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select =='1') {
						System.out.println("자바스크립트란...입니다...");
						System.out.println("계속하시려면 엔터를 눌러주세요...");
						scanner.nextLine();					
					}
				}
			
			}else {
				System.out.println("해당 명령은 보기에 없습니다.");
				System.out.println("다시 입력하세요.");
			}
			System.out.println();
		}
	
		System.out.println("프로그램 종료");
	}

}
