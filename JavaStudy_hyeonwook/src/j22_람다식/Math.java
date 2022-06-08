package j22_람다식;

@FunctionalInterface
public interface Math<T1, T2> {	// 타입을 꼭 제네릭으로 안줘도 댐.
	public double calc(T1 value1, T2 value2);
}
