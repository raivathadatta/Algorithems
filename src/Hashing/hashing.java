package Hashing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import OrderList.OrderList;

public class hashing {
	static LinkedList<Integer>[] order=new LinkedList[11];

  	public static  void hashingFunction(int[] array)
  	{
		

		for(int i=0; i<array.length; i++)
		{
			int rem = array[i]%11;
			if(order[rem]== null)
			{
				order[rem] = new LinkedList<>();
				order[rem].add(array[i]);
			}
			else
			{
				order[rem].add(array[i]);
            }
		}
		for(int i=0;i<11;i++)
		{
			System.out.println(i);
			if(order[i] !=null)
			{
				System.out.print(order[i]);
			
			}
		}
	}

    public static void main(String[] args) throws IOException
    {
    	FileReader reader = new FileReader("D:\\testout.txt");
		Scanner scanner = new Scanner(reader);
		LinkedList<Integer> list = new LinkedList<Integer>();
		while (scanner.hasNext()) {
			list.add(scanner.nextInt());
		}
		int[] array=new int[list.size()];
		for (int i =0; i < list.size(); i++)
            array[i] = list.get(i);
		
		hashingFunction(array);
    }
}
