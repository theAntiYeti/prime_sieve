public class Sieve {

	public static void main(String[] args){

		long start_time = System.currentTimeMillis();
		/*Taking an argument of an integer as the maximum value to search for*/
		int maxint = Integer.parseInt(args[0]);
		primesTo(maxint);
		
		System.out.printf("\nThat took %d milliseconds!\n", System.currentTimeMillis() - start_time);

	}
	/*generates a list of the first maxint integers, 
	  then eliminates non primes whilst printing primes*/
	private static void primesTo(int maximum){
		
		int[] potential = new int[maximum];
		for (int i = 0; i < maximum; i++){
			potential[i] = i+1;
		}

		for (int i = 1; i < maximum; i++){

			if (potential[i]==0){
				continue;
			}
			
			System.out.printf("%d, ", i+1);

			for (int k = 2*(i+1); k <= maximum; k += (i+1)){
				potential[k-1] = 0;
			}
			
		}
	}

}
