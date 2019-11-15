package zia;

public class Pattern5 
{

	public static void main(String[] args) 
	{
		
		int spc=3;
		int str=1;
		for(int i=1;i<=4;i++)
		{
			int num=0;
			for(int j=1;j<=spc;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				if(i%2!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(num);
				}
				if(num==8)
				{
					num=0;
				}
				else
				{
					num=num+2;
				}
				
			}
			str=str+2;
			spc--;
			System.out.println();
		}

	}

}
