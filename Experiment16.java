import java.util.*;

class Experiment16{
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int input[] = new int[n];

		for (int i=0;i<n ;i++ ) {
			input[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int i=0;i<n;i++){
			sum = sum + input[i];
		}
		System.out.println(sum);
	}
}