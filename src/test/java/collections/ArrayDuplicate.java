package collections;

import org.apache.log4j.net.SyslogAppender;

import com.sun.org.apache.regexp.internal.recompile;

public class ArrayDuplicate {
	
	public static void main(String[] args) {
			
		int[] a= {1,2,3,4,5,6,5,4,3,20};
		
		for(int print: a)
		{
			//System.out.println(print);
			
		}
		
		int[] e=removeDuplicates(a, a.length);
		for(int f:e)
		{
		System.out.println(f);
		}
	}
	
	public static int[] removeDuplicates(int[] b, int c)
	{
		int[]d= new int[c];
		
		for(int i=0;i<c;i++) {
			int j=0;
			//System.out.println(b[i]);
			if(d[j]!=b[i]) {
				d[j]=b[i];
				//break;
			}
			j=c-i;
		}
		return d ;
}
}
	/*int[]d= new int[c];

	for(int i=0;i<c;i++)
	{
		System.out.println("hello");
		
		int temp=b[i];
		for(int j=0;j<=i;j++)
		{
			d[j]=temp;
		}
		for(int x=0;x<=i;i++) {
			if(d[x]==b[i]) {
				continue;
			}
		}
	}
System.out.println(d);
	return d;
}*/