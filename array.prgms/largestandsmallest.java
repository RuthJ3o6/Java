import java.util.Scanner;
class largestandsmallest{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int i;
    System.out.println("enter limit of numbers");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++)
    {
        
        arr[i]=sc.nextInt();
    }
    int smallest=arr[0],largest=arr[0];
    for(i=1;i<n;i++){
        if(arr[i]<smallest){
            smallest=arr[i];}
            if(arr[i]>largest){
                largest=arr[i];}
    }
    System.out.println("smallest element is:"+smallest);
    System.out.println("largest element is:"+largest);
    }}