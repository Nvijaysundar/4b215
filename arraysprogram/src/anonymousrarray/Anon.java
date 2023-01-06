package anonymousrarray;

import java.util.Arrays;

public class Anon {
	public static void main(String[] args) {
		greatest(new int[] {45,3345,246,24562,136623});
	}

	private static void greatest(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Greatest: "+arr[arr.length-1]);
	}
}
