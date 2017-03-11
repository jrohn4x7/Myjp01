package tw.john;

import javax.swing.JOptionPane;

public class John03switch {

	public static void main(String[] args) 
	{
		String input
		= JOptionPane.showInputDialog("請輸入月份:");
		int month = Integer.parseInt(input);
		if(month > 12 || month < 1)
		{
			System.out.println("一年沒有" + month + "個月喔!");
			
		}
		switch(month)
		{
			case 1: case 3: case 5: case 7: 
			case 8: case 10: case 12:
				System.out.println("31");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("30");
				break;
			case 2:
				System.out.println("28");
				break;
				//java switch 可以不寫break;
			default:
				System.out.println("error");
				break;
				//也可以不寫 因為在switch尾端
		}

	}

}
