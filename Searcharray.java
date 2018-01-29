
public class Searcharray {
public static void main(String[] args) {
		
		int N=Integer.parseInt(args[0]);
		boolean flag=false;
		int arr[]= {2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++)
		{
			if(N==arr[i])
			{
				flag=true;
				break;				
			}
			else
			{
				flag=false;
			}
		}
		if(flag)
		{
		System.out.println("The Number is found");
		}
		else
		{
			System.out.println("The Number is not found");
		}
	}

}

