import java.util.Scanner;
class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sum1(n));
    }
    public static int sum1(int n){
        int sum2=0;
        for (int i=1;i<=n;i++){
            sum2=sum2+i;

        }
        return sum2;
    }
}
