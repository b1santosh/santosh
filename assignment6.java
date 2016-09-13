class assignment6
{	
public static void main(String[] arg)
{
int i,j,k;
k=8;
	for(i=1;i<=7;i++)
	{
		for (j=1;j<=k;j++)
		{
			if ((j==i) || (j==(k-i))) 
			{
				System.out.print("x");
			}
			else
			{
				System.out.print(" ");
			}
		}	
		k=k--;
		System.out.println("");
	}
}

}
