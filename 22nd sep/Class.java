package lab;

import lab.Movie;
import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		Movie m=new Movie();
		Scanner sc=new Scanner(System.in);
		m.setMovie(sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextInt());
	System.out.println(m.getMovie());

	}

}
