package j18_최상위클래스.entity;
// Args 는 매개변수를 뜻함.
import java.time.LocalDate;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Product2 {
	@NonNull	// 얘를 쓸려면 @RequiredArgsConstructor라는걸 꼭 써야댐. 현재값이 null일수 없다는 뜻.
	private int productCode;	// final이 필요없을땐 required 빼고 noArgs 쓰면댐.
	@NonNull
	private String productName;
	private int category;
	private LocalDate productingDate;
	
}