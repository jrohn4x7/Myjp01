package tw.john;

import javax.swing.JOptionPane;

public class year 
{
	public static void main(String[] args)
	{
		//System.exit(num);
		//in java if(a & b) & | ^ 表bin運算
		//e.g. 2 | 3 == 3;
		//switch(int) e.g. short long char..
		//switch 內部條件只接受常數 e.g. final int a = 10;
		
		
		
		String input = 
		JOptionPane.showInputDialog("請輸入年分");
		int month;
		
		int year = Integer.parseInt(input);
		
		
		
		
		if (getyear(year) == 0)
		{
			System.out.println("要潤");
		}
		else
		{
			System.out.println("不潤");
		}
		
	}
	static int getyear(int a)
	{
		if(a % 4 == 0)
		{
			if(a % 100 == 0)
			{
				if(a % 400 == 0)
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 1;
		}
	}
}
