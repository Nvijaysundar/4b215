package onediment;
import java.util.*;
public class One2 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(),sume=0,sumo=0;
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2 == 0)
				sume += arr[i];
			if(i%2==1)
				sumo += arr[i];
		}
		System.out.println("Sume: "+sume);
		System.out.println("Sumo: "+sumo);
		int max = arr[0],low = arr[0];
		for(int temp: arr)
		{
			if(max<temp)
				max = temp;
			if(low>temp)
				low = temp;
		}
		Arrays.sort(arr);
		System.out.println("Max: "+max);
		System.out.println("Max: "+ arr[arr.length-1]);
		System.out.println("Low: "+low);
		System.out.println("Low: "+arr[0]);
		int c=0,freq=0,maxc=0;
		for(int i : arr)
		{
			c=0;
			for(int j : arr)
			{
				if(i == j)
				{
					c++;
				}
			}
			if(c>maxc) {
				freq = i;
				maxc = c;
			}
		}
		System.out.println("Element: "+ freq +" Count: "+maxc);
	}}
