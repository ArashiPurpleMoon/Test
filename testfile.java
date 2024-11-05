public class Main {
	
    public static void main(String[] args) {
        
		/*
			F(0) = 0
			F(1) = 1
			F(n) = F(n-1) + F(n-2), (n>=2)
		*/
		
		public static long fibonacci(int n) {
			if (n == 0 || n == 1) {
				return n;
			} 
			return fibonacci(n-1) + fibonacci(n-2);
		}
    }
}