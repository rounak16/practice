class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE)
			return 0;
		int sign = 1;
		if (x < 0) {
			sign = -1;
			x = -x;
		}
		int num = x;
		int length = 0;
		int result = 0;
		while (num != 0) {
			num /= 10;
			length++;
		}

		for (int i = 1; i <= length; i++) {
			int rest = x % 10;
			int toadd = (int) (rest * Math.pow(10, length - i));
			if (toadd > Integer.MAX_VALUE - result) {
				return 0;
			}
			result += toadd;
			x /= 10;
		}
		return sign * result;
    }
}