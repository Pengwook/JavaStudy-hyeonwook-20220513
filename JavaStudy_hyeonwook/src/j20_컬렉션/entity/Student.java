package j20_컬렉션.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	//@Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor 를 합쳐놓은것.
@NoArgsConstructor	// 기본 생성자
@AllArgsConstructor	// 전체 생성자
public class Student {
	private int studentCode;
	private String name;
	private String schoolName;
	
}
