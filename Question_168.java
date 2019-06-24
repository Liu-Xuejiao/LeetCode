class Solution {
	public String convertToTitle(int n) {
		int Ascii = 64;
		int size = 26;
		String result = "";
		int index = 0;
		while (n > 0) {
			if (n <= 26) {
				result = result + (char) (n + Ascii);
				n = 0;
			}
			
			if( n%26 == 0) {
				size = 27*(n/26-1);
			}
			
			index = n / size;
			result = result + convertToTitle(index);
			n = n - index * 26;
		}
		return result;
	}
}