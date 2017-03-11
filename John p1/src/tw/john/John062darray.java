package tw.john;

public class John062darray {

	public static void main(String[] args) 
	{
		// int[] d = new int[]; , int[] d = new int[]{1,2,3,4};
		// , int[] f ={1,2,3,4}; 宣告時同時給值,不可分開;
		//分開: int[] g; g = new int[]{1,2,3,4};
		int[][] a; // 等同 int b[][], int[] c[];
		a = new int[2][];	//a[2][2] 不會報錯,但執行時會以例外處理;
		   					//電腦處理陣列方式為線性(樹狀圖)
		a[0] = new int[3];
		a[1] = new int[2];
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}//hw = 洗發理牌

}
