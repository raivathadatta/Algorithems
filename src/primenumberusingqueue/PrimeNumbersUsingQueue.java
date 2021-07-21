package primenumberusingqueue;

import java.util.Arrays;
import java.util.LinkedList;

public class PrimeNumbersUsingQueue {
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		// putting values in array

		for (int j = start; j <= end; j++) {
			if (isPrime(j)) {
				for (int k = j + 1; k < end; k++) {
					if (isPrime(k)) {
						if( isAnagram(String.valueOf(j), String.valueOf(k))) {
							queue.add(j);
							queue.remove(k);

						}
					}
				}

			}

		}

		int tempSize = queue.size();
		for (int i = 0; i < tempSize; i++) {
			System.out.print(queue.get(i) + " ");
//			if (queue.get(i) > 90 && queue.get(i) < 105)
//				System.out.println();
//			if (queue.get(i) > 190 && queue.get(i) < 205)
//				System.out.println();
//			if (queue.get(i) > 285 && queue.get(i) < 305)
//				System.out.println();
//			if (queue.get(i) > 390 && queue.get(i) < 405)
//				System.out.println();
//			if (queue.get(i) > 490 && queue.get(i) < 505)
//				System.out.println();
//			if (queue.get(i) > 690 && queue.get(i) < 705)
//				System.out.println();
//				queue.deQueue();

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
