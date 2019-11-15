package zia;

public class Pattern2Again 
{

	public static void main(String[] args) 
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=1;j--)
			{
					if(i%2==0)
					{
						System.out.print(j);
					}
					else
					{
						System.out.print("*");
					}
				
			}
			System.out.println();
		}

	}

}
