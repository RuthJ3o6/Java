import java.util.Scanner;
class duplicatenonzero{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int i,j;
    System.out.println("enter limit of numbers");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++)
    {
        
        arr[i]=sc.nextInt();
    }
for (i = 0; i < n; i++) {
if (arr[i] != 0) {
for ( j = i + 1; j < n; j++) {
if (arr[i] == arr[j]) {
for (int k = j; k < n - 1; k++) {
arr[k] = arr[k + 1];
}
n--;
j--;
}
}
}
}System.out.println(" elements of array after removing duplicates:");
for (i = 0; i < n; i++)
System.out.println(arr[i]);
}}


