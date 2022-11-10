package lab10thnov;
//Q.4 WAJP to store text file content line by line into an array

import java.io.*;//import
import java.util.ArrayList;
public class Program03 {
	public static void main(String[] args) {//main method
		try {//try block
			ArrayList<String> arr=new ArrayList<>();
			BufferedReader b=new BufferedReader(new FileReader("D:\\text.txt"));
			String s;//String
			while((s=b.readLine())!=null)//while loop
				arr.add(s);
			b.close();//closing
			System.out.println(arr);
		}catch(Exception e) {//catch Exception
			System.out.println(e);
		}
	}

}
