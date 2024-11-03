
package BT_trenlop.chuong1;
import java.util.Scanner;
public class cau7 {
public static void caua(int n){
    int s=0;  
    for (int i=1;i<=n;i++){
       System.out.printf(i+" ");
       s++;
       
      }
      System.out.println("tong so cac so nho hon bang n la: " +((1+n)*s/2));


}
public static void caub(int n){
   int S=0;
    for (int i=1;i<=n;i++){
        if(i%2==0){
           S+=i; 
           System.out.printf(i+" "); 
        }
        
       }
       System.out.println("tong so cac so chan nho hon bang n la: " +S);
}
public static void cauc(int n){
    int S=0;
     for (int i=1;i<=n;i++){
         if(i%2==1){
            S+=i; 
            System.out.printf(i+" "); 
         }
         
        }
        System.out.println("tong so cac so le nho hon bang n la: " +S);
 }
 public static boolean check_snt(int number) {
   if(number<2){
     return false;
   }
   else{
       for(int i=2;i<=Math.sqrt(number);i++){
          if(number%i==0)
          return false;
       }
   }
   return true;
}


public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
     System.out.println("nhap N: ");
     int N=scanner.nextInt();
     caua(N);
     caub(N);
     cauc(N);
     int b=0;
     for(int i=1;i<=N;i++){
     if(check_snt(i)){
      b+=i;
       System.out.printf(i+ " ");}
     }
     System.out.println("tong cac snt nho hon N: "+b);
     scanner.close();
}
    
}