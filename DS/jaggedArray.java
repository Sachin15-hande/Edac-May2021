package Array;

public class jaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [][]a= {{12,23,43},{12,434,43},{456,123,21321,1221}};
   System.out.println("jagged Arrray is");
   for(int i=0;i<a.length;i++)
   {
	   for(int j=0;j<a[0].length;j++) {
		   System.out.print(" "+a[i][j]);
	   }
	   System.out.println("");
	   
   }
	}
}
