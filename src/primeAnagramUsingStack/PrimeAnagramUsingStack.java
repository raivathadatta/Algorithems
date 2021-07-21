package primeAnagramUsingStack;

import java.util.Arrays;
import java.util.LinkedList;

public class PrimeAnagramUsingStack {
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;

		LinkedList<Integer> stack = new LinkedList<Integer>();

		// putting values in array

		for (int j = start; j <= end; j++) {
			if (isPrime(j)) {
				for (int k = j + 1; k < end; k++) {
					if (isPrime(k)) {
						if (isAnagram(String.valueOf(j), String.valueOf(k))) {
							stack.push(j);
							stack.push(k);

						}
					}
				}

			}

		}
		// stack.show();

		int tempSize = stack.size();
		for (int i = 0; i < tempSize; i++) {
			System.out.print(stack.peek() + " ");
			if (!stack.isEmpty()) {
				stack.pop();
			}
		}

	}

	private static boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
