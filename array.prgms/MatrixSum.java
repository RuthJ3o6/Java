import java.util.Scanner;
class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r= sc.nextInt();
	System.out.println("Enter number of columns:");
        int c= sc.nextInt();
        int[][] matrix1 = new int[r][c];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
System.out.println("matrix 1 is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix1[i][j] +" ");
            }
            System.out.println();
        }
    
	int[][] matrix2 = new int[r][c];
  	System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
System.out.println("matrix 2 is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix2[i][j] +" ");
            }
            System.out.println();
        }
    
        int[][] sum = new int[r][c];
	for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
       }
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }
    }
}