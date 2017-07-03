package tw.aaa.myproject.teacher_hW;

public class Test2DimArray {

	public static void main(String[] args) {
		int data[][]={{1,2,3},{4,5,6,7,8,9}};
for(int i=0;i<data.length;i++)
{
	for(int j=0;j<data[i].length;j++)
		{
		//System.out.println("data[" + i + "][" + j + "]=" + data[i][j]);
		System.out.printf("data[%d][%d]=%d\n",i,j,data[i][j]);
		}}
	for(int[] b:data)
	{
		for(int c:b)
		{System.out.printf("data=%d\n",c);}
	}
	}

}
