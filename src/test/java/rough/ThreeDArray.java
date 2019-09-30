package rough;

public class ThreeDArray {

	public static void main(String[] args) {
		
		int [][][]a= new int [2][2][];
		
		a[0][0]= new int[3];
		a[0][1]= new int[3];
		a[1][0]= new int[2];
		a[1][1]= new int[6];
		
		a[1][1][5]=100;
		System.out.println();
		

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.println(a[i][j][k]);
				}
			}
			
		}
		
		
		
		
		
		
	}

}
