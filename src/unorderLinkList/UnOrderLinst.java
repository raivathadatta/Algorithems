package unorderLinkList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class UnOrderLinst {
	public static void main(String[] args) throws IOException {
		LinkedList list = new LinkedList<>();
		FileReader reader = new FileReader("D:\\testout.txt");
		Scanner scanner = new Scanner(reader);
		String check = "hello";
		// while (scanner.hasNextLine())
		while (scanner.hasNext()) {
			list.add(scanner.next());
			System.out.println("hello");
		}
		if (list.contains(check))
			list.remove(check);
		else
			list.add(check);
		FileWriter writer = new FileWriter("D:\\testout.txt"); 
		for(Object object: list) {
		  writer.write(object +" ");
		}
		writer.close();
	}
}