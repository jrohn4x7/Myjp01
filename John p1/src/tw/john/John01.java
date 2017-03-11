package tw.john;

public class John01
{
	public static void main(String[] args) 
	{
		byte var1 = 0;
		var1 = (byte)(3 + var1); // java 常數與變數運算會強制轉int
		float var2 = 0.1f; //or (float)0.1
		var2 = (float)(var2 + 0.8); //*0/0 = NaN
		System.out.println("var2="+var2);
		// byte 2^8, short2^16, int2^32, long 2^64
		//float, double 2^32 , 2^64
		//char (整數運算) 2^16
		//boolean 1bit *bolean var = true | false 
		//boolean 不能宣告為0 | 1 (JAVA)
	}
}
