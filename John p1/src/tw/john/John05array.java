package tw.john;

public class John05array 
{
	public static void main(String[] args)
	{	// *陣列為物件*
		boolean[] a; //宣告整數陣列a int a[]也可以但建議使用前者
		a = new boolean[3]; //新增整數陣列空間3  為a; 任何東西前面+new 即為物件;
						//物件有詳細清楚的值,於java中array會預設為0;
						//new int[] 等同初始化陣列,陣列內存放的是該int的位置;
		System.out.println(a.length);
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		int[] dicea;
		dicea = new int[6];
		for(int i = 0; i < 100000; i++)
		{
			int dice = (int)(Math.random()*9+1);

				dicea[(dice>6)?dice-4:dice-1]++;
				//三元運算式  (boolean)?值1:值2; true = 1 false = 2;
		}		
		
		for(int j = 0; j < 6; j++)
		{
			int t = (j + 1);
			System.out.println("dice[" + t + "]" + "=" + dicea[j]);
		}
	}
}
