package zia;

public class Pattern8 
{

	public static void main(String[] args) 
	{
		int spc=3;
		int str=1;
		int count=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=spc;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				System.out.print(count);
				count++;
			}
			spc--;
			str++;
			System.out.println();
		}

	}

}
