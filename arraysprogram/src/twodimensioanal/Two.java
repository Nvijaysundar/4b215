package twodimensioanal;
import java.util.*;
public class Two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][]arr = new int[sc.nextInt()][sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = sc.nextInt();
		for(int i=0;i<arr.length;i++)
			Arrays.sort(arr[i]);
		for(int[] temp: arr)
		{
			Arrays.sort(temp);
			for(int k: temp)
				System.out.print(k+ " ");
			System.out.println();
		}
		sc.close();
	}
}
