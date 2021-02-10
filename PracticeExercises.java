import java.util.Arrays;

public class PracticeExercises {
	/*
	 Write a function windowPosSum(int[] a, int n) that replaces each element a[i] with 
	 the sum of a[i] through a[i + n], but only if a[i] is positive valued. If there are
	  not enough values because we reach the end of the array, we sum only as many values 
	  as we have.
	 */
	
	public static int[] windowPosSum(int[] a, int n) {
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] >= 0) {
				int replacement = 0;
				for (int x = 0; x < n+1; x++) {
					if (i+x < a.length) {
					replacement += a[i+x];
					}
				}
				a[i] = replacement;
			}
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(windowPosSum(new int[] {1, 2, -3, 4, 5, 4}, 3)));
		System.out.println(Arrays.toString(windowPosSum(new int[] {1, -1, -1, 10, 5, -1}, 2)));

	}
	
}
