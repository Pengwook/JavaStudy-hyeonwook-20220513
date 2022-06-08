package j22_람다식;

@FunctionalInterface
public interface Math2<T1, T2> {	// 타입을 꼭 제네릭으로 안줘도 댐.
	public double calc(double value1, double value2);
}
