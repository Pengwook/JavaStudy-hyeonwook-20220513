package j21_익명클래스;

import java.util.ArrayList;
// 익명클래스: 따로 클래스가 정의되지않고 바로 구현을 함. 구현내용이 달라져야할때, 한번만 사용할 경우에 사용함.
import java.util.Collection;
import java.util.List;

public class PrincipalDetailse {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		
		
		GrantedAuthority grantedAuthority = new GrantedAuthority() {	// 권한을 줄때 사용함.
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				
				return null;
			}
			
		};
		
		GrantedAuthority grantedAuthority3 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				
				return null;
			}
			
		};
		
		GrantedAuthority grantedAuthority2 = new GrantedAutorityImpl();
		
		grantedAuthority.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority2.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority3.getRoles(strList).forEach(r -> {System.out.println(r);});

	}

}
