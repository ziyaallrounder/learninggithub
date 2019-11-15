package zia;

public class Pattern4 
{
	public static void main(String[] args)
	{
		int spc=2;
		int str=1;
		for(int k=1;k<=3;k++)
		{
			for(int i=1;i<=spc;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=str;j++)
			{
				System.out.print("* ");
				
			}
			spc--;
			str++;
			System.out.println();
		}
		spc=1;
		str=2;
		for(int k=1;k<=2;k++)
		{
			
			for(int i=1;i<=spc;i++)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=str;j++)
			{
				System.out.print("* ");
			}
			spc++;
			str--;
			System.out.println();
			
		}
		
	}

}
