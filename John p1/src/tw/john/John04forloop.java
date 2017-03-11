package tw.john;

public class John04forloop 
{
	// break 可以跳出當前迴圈; brea n for() 可以跳出標記迴圈外, n後面不可以寫任何語法;
	// continue 可以跳至下一個; continue n for() 可以跳至標記迴圈繼續循環;
	
	//99乘法表 , 超過9要重新排版;
	public static void main(String[] args) 
	{	//1 進入迴圈前      2判斷是否進入	5		
		
		
		for(int l = 0; l < 2; l++) //大列
		{
			for (int i = 1; i < 10;i++) //
			{
				for (int k = 2; k < 6; k++)
				{
					int newi = k + l * 4;
					int result = newi * i;
					System.out.print(newi + "x" + i 
							+ "=" + result+ "\t"
							 + "|");	
				}
				System.out.println("");
			}
			System.out.println("================="
							+ "================");
		}
	}

}
