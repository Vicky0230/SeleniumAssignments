package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String test = "changeme";
		char[]  charac= test.toCharArray();

		for (int i = 0; i < charac.length; i++) 
		{
			if(i%2!=0)
			{
				System.out.print(charac[i]);
			}
			else
			{
				String str=Character.toString(charac[i]);
				System.out.print(str.toUpperCase());
			}
		}

	}

}
