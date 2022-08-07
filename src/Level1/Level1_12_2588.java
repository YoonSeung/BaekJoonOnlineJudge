package Level1;

import java.util.Scanner;

public class Level1_12_2588 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sc1 = sc.nextInt();
		int sc2 = sc.nextInt();
		int a = sc2%10;
		int b = (sc2%100) - a;
		int c = (sc2%1000) - (a+b);
		
		System.out.println(sc1*a);
		System.out.println((sc1*b)/10);
		System.out.println((sc1*c)/100);
		System.out.println(sc1*sc2);

		}
}
