package jaggedarray;

public class Jagged {
	public static void main(String[] args) {
		int []arr = {324,345,654,3526};
		int []arr2 = {12,546,5642,35,1345,345,32};
		int [][]arr3 = {arr,arr2};//jagged array
		
		for(int []temp : arr3)
		{
			for(int k: temp)
				System.out.print(k+" ");
			System.out.println();
		}
	}
}
