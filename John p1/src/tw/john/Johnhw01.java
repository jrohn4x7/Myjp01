package tw.john;

import javax.swing.JOptionPane;

public class Johnhw01 
{
	public static void main(String[] args)
	{
		String input
		= JOptionPane.showInputDialog("請輸入數字以找質數:");
		
		int num = Integer.parseInt(input);
		int count = 0;
		
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				int tmp = i % j;
				if(tmp == 0)
				{
					count = count + 1;
				}
			}
			if(count == 2)
			{
				System.out.print("\t" + i + "*");
			}
			else
			{
				System.out.print("\t" + i);
			}
			count = 0;
			if(i % 10 == 0)
			{
				System.out.println();
			}
		}
	}
}
