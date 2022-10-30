package by.home.maxzzzit;

import java.util.Scanner;

// Класс добавляющий в одномерный массив числа поэлементно через счетчик!
public class DobavlenieZnachMassiv {

	public static void main(String[] args) {
		int [] a;
		int razmer;
		Scanner scn = new Scanner(System.in);
		System.out.print("Введите размер массива: ");
		razmer = scn.nextInt();
		a=new int [razmer];	
		for (int i=0; i<razmer; i++) {
			System.out.print("Введите a ["+ i +"] число: ");
			a[i]=scn.nextInt();
			System.out.println("В массив занесено значение: a ["+i+"]"+" = "+a[i]);	
		}				
	}
}
