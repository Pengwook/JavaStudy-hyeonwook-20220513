package j10_클래스기본정리.repository;

/*
 * Entity(독립체) Class -> 데이터들만 저장을 하는, 정보만 가지고 있는
 * 
 * 정보를 담는 객체를 Entity 객체라고 한다.
 * 
 * 
 */
public class User {				// 변수들이 핵심
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	
	//기본생성자
	//전체생성자
	//getter
	//setter
	//toString
	
	//기본생성자			// 생략되어있음	// 생성적 오버로딩이 되면 비활성화가 됨. 즉, 없다라고봄.	
	public User() {}						//생성적 오버로딩을 했다? 기본생성자를 만들어둘것.
	

	
	//전체생성자			// 오버로딩을 한것.		// 생성하는 시점에 값을 넣겠다.
	public User(String usercode, String email, String name, String username, String password) {
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}


	
	//getter & setter
	public String getUsercode() {
		return usercode;
	}



	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
}
