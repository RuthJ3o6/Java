import java.util.Scanner;
class descendingorder{
public static void main(String args[]){
int n,i,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter limit of array");
n=sc.nextInt();
int []arr=new int[n];
System.out.println("enter elemets of array");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){
if(arr[j]<arr[j+1]){
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;}}}
System.out.println("elements in descending order is:");
for(i=0;i<n;i++){
System.out.println(arr[i]+" ");
}
}
}


