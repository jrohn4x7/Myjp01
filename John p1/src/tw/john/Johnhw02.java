package tw.john;

public class Johnhw02 
{

	public static void main(String[] args) //poker 
	{
		int[] poker = new int[52];
		for(int i = 0; i < 52; i++)
		{
			long start = System.currentTimeMillis(); //傳回當前時間
			int temp = (int)(Math.random()*52+1);
			
			boolean isRepeat = false;
			for(int j = 0; j < i; j++)
			{
				if(poker[j] == temp)
				{
					isRepeat = true;
				}
			}
			
			if(!isRepeat)
			{
				poker[i] = temp;
				System.out.print(poker[i] + " ");
			}
			else
			{
				i--;
			}
			
		}
	}

}
