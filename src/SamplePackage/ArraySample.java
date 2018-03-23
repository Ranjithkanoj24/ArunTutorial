package SamplePackage;

public class ArraySample {

	public static void main(String[] args) {
		
		//Lets try a three dimensional array
		int arr[][][] = new int[2][3][4];
		int i,j,k,l=0;
		for( i=0;i<2;i++){
			for(j=0;j<3;j++){
				for (k=0;k<4;k++){
					arr[i][j][k]=l++;
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
		}
		System.out.println();
	}

}
