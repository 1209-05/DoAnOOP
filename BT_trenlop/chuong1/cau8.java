package BT_trenlop.chuong1;
import java.util.Scanner;
public class cau8 {

    

public static int[] cau8e(int a[],int n,int b) {
       int na[]=new int[n+1];
       for(int i=0;i<n;i++){     
        na[i]=a[i];
       }
       na[n]=b;
       return na;

}
public static void cau8f(int[] arr,int n){
     Scanner scanner=new Scanner(System.in);
     System.out.println("nhap vi tri muon xoa: ");
      int pos=scanner.nextInt();
     if(pos<0||pos>=n){
        System.out.println("ko hop le");

     }
     else{
       for(int i=pos;i<n-1;i++){
        arr[i]=arr[i+1];
        n--;
       }
     for(int i=0;i<n;i++){
         System.out.println(arr[i]+" ");


     }

     }
scanner.close();



}
 public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
   System.out.println("nhap n: ");
    int n=scanner.nextInt();
    int a[]=new int[n];
    System.out.println("Nhap mang: ");
    for(int i=0;i<n;i++)
{
    a[i]=scanner.nextInt();
} 
System.out.println("Nhap phan tu can them vao: ");
int b=scanner.nextInt();
a=cau8e(a, n, b);
n++;
System.out.println("In mang moi: ");
for(int i=0;i<n;i++){
    System.out.print(a[i]+" ");
}
cau8f(a, n);
scanner.close();
}
}