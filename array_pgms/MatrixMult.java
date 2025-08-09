import java.util.Scanner;
class MatrixMult{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of matrix1:");
        int r1= sc.nextInt();
	System.out.println("Enter number of columns of matrix 1:");
        int c1= sc.nextInt();
        System.out.println("Enter number of rows of matrix2:");
        int r2= sc.nextInt();
	System.out.println("Enter number of columns of matrix2:");
        int c2= sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
System.out.println("matrix 1 is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(matrix1[i][j] +" ");
            }
            System.out.println();
        }
    
	int[][] matrix2 = new int[r2][c2];
  	System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
System.out.println("matrix 2 is:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(matrix2[i][j] +" ");
            }
            System.out.println();
        }
 int[][] resultMatrix = new int[r1][c2]; 
        System.out.println("Product of the matrices:"); 
        for (int i = 0; i < r1; i++) { 
            for (int j = 0; j < c2; j++) { 
                for (int k = 0; k < c1; k++) { 
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j]; 

                } 
                System.out.print(resultMatrix[i][j] + " "); 
            } 
            System.out.println();
}
}
}

    