package com.fibWithoutDP;
import java.util.Scanner;
public class Main {

	private static int iteration;
	private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
		System.out.println("Enter limit");
		int limit = scanner.nextInt();
		for(int i=0; i<limit; i++) {
			System.out.println("Fib number." + i + " is " + fib(i));
		}
    }

    public static int fib(int n) {
		System.out.println("iteration "+ ++iteration);
    	if(n==0)
    		return 0;
    	else if(n==1)
    		return 1;
    	else
    		return fib(n-1) +fib (n-2);
	}
}
// getting O(2^n) for fib(n)