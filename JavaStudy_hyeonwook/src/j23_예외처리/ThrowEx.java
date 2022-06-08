package j23_예외처리;

public class ThrowEx {

	public static void main(String[] args) {
		try {
			System.out.println("프로그램 실행중...");
			int i = 1;
			
			if(i == 0) {
				throw new ValidationCustomException("예외 발생");	// 강제로 예외 발생	
			}
			
		} catch (Exception e) {
			e.printStackTrace();	// 예외가 발생되어졌을때 여기서 실행
		}finally {					// try가 정상실행되도, 중간에 예외 발생해서 catch되더라도 무조건 실행하는게 finally 
			System.out.println("무조건 실행");
		}

	}

}
