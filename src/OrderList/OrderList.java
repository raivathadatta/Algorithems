package OrderList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class OrderList {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D:\\testout.txt");
		Scanner scanner = new Scanner(reader);
		LinkedList<Integer> list = new LinkedList();
		while (scanner.hasNext()) {
			list.add(scanner.nextInt());
		}
		Scanner scanner1 = new Scanner(System.in);
		int check = scanner1.nextInt();
		Collections.sort(list);
		if (list.contains(check))
			list.remove(check);
		else {
			int i = 0;
			while (list.get(i) < check) {
				i = i++;
			}
			list.add(i, check);
		}
		FileWriter writer = new FileWriter("D:\\testout.txt");
		for (Object object : list) {
			writer.write(object + " ");
		}
		writer.close();
	}
}
