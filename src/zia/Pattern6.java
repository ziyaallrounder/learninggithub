package zia;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		char ch='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1||i==4)
				{
					System.out.print(ch);
					ch++;
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
