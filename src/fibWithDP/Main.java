package fibWithDP;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Integer> fibMemory = new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println("Enter Limit: ");
		int limit = scanner.nextInt();
		for(int i=0; i<limit; i++){
			System.out.println("Fib No."+i+" is "+fib(i));
		}
		for(int i=0; i<fibMemory.size(); i++) {  // Just to print out the final ArrayList
			System.out.println(fibMemory.get(i));  // Not needed really
		}
	}

	public static int fib(int n) {
		if(fibMemory.size()>n) {
			System.out.println("Fetched fib"+ n + " from memory");
			return fibMemory.get(n);
		}
		else {
			if (n == 0) {
				if (fibMemory.size() == 0)
					fibMemory.add(0);
				return 0;
			} else if (n == 1) {
				if (fibMemory.size() == 1)
					fibMemory.add(1);
				return 1;
			} else {
				int temp = fib(n - 1) + fib(n - 2);
				if (fibMemory.size() == n)
					fibMemory.add(temp);
				return temp;
			}
		}
	}
}

//Works in O(n) instead of O(2^n)
