import java.util.*;


public class prime_set {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		prime a = new prime(n);
		a.show();
		
	}
	
	public static class prime {
		
		private ArrayList<Integer> primes;
		
		public prime (int n) {
			primes = new ArrayList<Integer>();
			for (int i = 2; i < n; i++) {
				boolean isPrime = true;
				for (int j = 2; j*j <= i; j++) {
					if(i % j == 0) {       
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					primes.add(i);
				}
			}
		}
		
		public void show() {
			for (int i = 0; i < this.primes.size() - 1; i++) {
				System.out.println(this.primes.get(i));
			}
		}
	}

}

