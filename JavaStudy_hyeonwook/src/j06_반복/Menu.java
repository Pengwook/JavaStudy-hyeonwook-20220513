package j06_반복;

import java.util.Scanner;
// 메뉴 만들어보기
// 버퍼를 지우는법 허공에다가 scanner.nextLine();
// nextLine 을 제외한 모든것들은 scanner.nextLine(); 을 해줘야댐
public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		while(loopFlag) {      //while 안에는 무한반복을 멈춰줄 break가 필요함 // loopFlag가 false면 멈추게끔
			char select = 0;
			
			System.out.println("[메뉴 선택]");
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("명령을 입력하세요:");
			select = scanner.next().charAt(0); // charAt(?) ?에 2를 넣는다고치고 abcde를 친다면 2번째 index인 c가 나옴 // a b c 
			scanner.nextLine(); // String str = scanner.nextLine(); 을 한후 a b c 를 하였을때 str에 b c 가 남음
			
			
			if(select == 'q') {	   // q가 입력될때까지 무한반복! , q가 입력되면 프로그램 종료
				break;
			}else if(select == '1') {
				System.out.println("java를 선택하셨습니다.");
				while(true) {
					System.out.println("[ java 메뉴 ]");
					System.out.println("1. java란?");
					System.out.println("b. 뒤로가기");
					
					System.out.println("명령을 입력하세요:");
					select = scanner.next().charAt(0); // = scanner.nextLine().charAt(0); 또한 같긴함. 이렇게 하면 밑에 scanner.nextLine();을 안해두댐
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == 'q')	{
						loopFlag = false; // 안에 들어가서도 q를 눌렀을때 종료가 되게끔 
						break;
					}else if(select == '1') {
						System.out.println("자바란...입니다...");
						System.out.println("계속하시려면 엔터를 눌러주세요...");
						scanner.nextLine();
					}
				}
			}else if(select == '2') {
				System.out.println("python를 선택하셨습니다.");
				while(true) {
					System.out.println(" [ python 메뉴 ]");
					System.out.println("1. python이란?");
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
				System.out.println("javascript를 선택하셨습니다.");
				while(true) {
					System.out.println(" [ javascript 메뉴]");
					System.out.println("1. javascript란?");
					System.out.println("b. 뒤로가기");
					
					System.out.println("명령을 입력하세요:");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
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
