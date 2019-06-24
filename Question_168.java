class Solution {
	public String convertToTitle(int n) {
		int Ascii = 64;
		String result = "";
		int index = 0;
		while (n > 0) {
			if (n <= 26) {
				result = result + (char) (n + Ascii);
				break;
			}

			index = n / 26;

			if (n % 26 == 0) {
				index = index - 1;
			}

			result = result + convertToTitle(index);
			n = n - index * 26;
		}
		return result;
	}
}