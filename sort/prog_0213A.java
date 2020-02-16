import java.util.Scanner;
//REDIRECTED STANDARD INPUT
public class prog_0213A
{
	public static void main(String args[])
	{
		int s1, s2, s3, temp;
		Scann er input = new Scanner(System.in);
		while(input.hasNext())
		{
			s1 = input.nextInt();
			s2 = input.nextInt();
			s3 = input.nextInt();
			if (i1<i2)
			{
				temp = i1;
				i1 = i2;
				i2 = temp;
			}
			if (i2<i3)
			{
				temp = i2;
				i2 = i3;
				i3 = temp;
			}
			if (i1<i2)
			{
				temp = i1;
				i1 = i2;
				i2 = temp;
			}
			System.out.println(i1+" "+i2+" "+i3);
		}
	}
}