//Given two temperatures, return true if one is less than 0 and the other is greater than 100.
public class IcyHot {
	public boolean icyHot(int temp1, int temp2) {
		if (temp1 < 0) {
			if (temp2 > 100) {
				return true;
			} else {
				return false;
			}
		} else if (temp2 < 0) {
			if (temp1 > 100) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
