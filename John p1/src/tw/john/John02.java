package tw.john;

public class John02 {
	public static void main(String[] args)
	{
		int intScore = (int)(Math.random()*100+1);
		System.out.println(intScore);
		if(intScore >= 90) //if(bool)
		{
			System.out.println("A");
		}
		if(intScore >= 80 && intScore < 90)
		{
			System.out.println("B");
		}
		if(intScore >= 70 && intScore < 80)
		{
			System.out.println("C");
		}
		if(intScore >= 60 && intScore < 70)
		{
			System.out.println("D");
		}
		if(intScore < 60)
		{
			System.out.println("E");
		}
	}

}
