//Given three int values, a b c, return the largest.
public class IntMax {
	public int intMax(int a, int b, int c) {
		if (a < b) {
			a = b;
		}
		if (a < c) {
			a = c;
		}
		return a;
	}
}