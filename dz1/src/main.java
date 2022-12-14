import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int[] arr;
        arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
           sum+=arr[i];
        }
        System.out.println(sum);
        sum = 0;
        int i = 0;
        while(i < n){
            sum+=arr[i];
            i++;
        }
        System.out.println(sum);
        sum = 0;
        i = 0;
        do{
            sum+=arr[i];
            i++;
        }while(i < n);
        System.out.println(sum);
        double sum2=0,m;
        for(i =1;i<11;i++){
            m = 1f/i;
            System.out.format("%.2f\n",m);
            sum2+=m;
        }
        System.out.format("\n%.2f\n",sum2);
        System.out.println("\n");
        int[] arr1;
        arr1 = new int[10];
        for(i =0;i<10;i++){
            arr1[i] = (int) (Math.random() *1000)+1;
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n");
        Arrays.sort(arr1);
        for(i =0;i<10;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n");
        for(i =0;i<10;i++){
            arr1[i] = random.nextInt(1000);
            System.out.print(arr1[i]+" ");
        }
        Arrays.sort(arr1);
        System.out.println("\n");
        for(i =0;i<10;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
