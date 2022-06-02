package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data;	// T는 변수라고 생각하면 됨.
	//private T aaa;	// 맨 위 T를 String으로 바꾸면 위아래 둘다 String으로 바뀜.
}
