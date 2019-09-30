package rough;

class Test 
{
	void table(double a)
	{
		int i=(int)a;
		i+=5;
	
			for(int j=1;j<=10;j++)
			{
				int mul=j*i;
				System.out.println( j +"*" + i + "=" + mul);
				
			}
			
			i+=2;
			
			System.out.println("Table for the new given integer is :  "  );
			
			for(int k=1;k<=10;k++)
			{
				int mul=k*i;
				System.out.println( k +"*" + i + "=" + mul);
				
				
			}
			
			
	}
	public static void main(String[] arg)
	{
		Test obj=new Test();
		System.out.println("Table for the given integer is :  "  );
		obj.table(4.5);
				
		
	}
} 

