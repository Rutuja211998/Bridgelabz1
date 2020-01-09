package FunctionalProgram;

public class SumOfThreeInt {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7,8};
		int n=11;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length-2; j++)
			{
				for(int k=j+1; k<a.length; k++)
				{
					if(a[i]+a[j]+a[k]==n)
					{
						System.out.println("triplet found: "+ a[i]+" "+a[j]+" "+a[k]+" ");
					}
				}
			}
		}
		
		
	}

}
