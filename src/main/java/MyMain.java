import java.util.Scanner;

public class MyMain {
public static int rollDie() {
        double start_num = Math.random() * 6 + 1 ;

        return (int)start_num;
    }
    public static int[] sumOfTwoDice(int n) {
        int sum = 0;
        int[] array = new int[11];
        for (int u = 0; u < n; u++) {
            for (int i = 0; i < 2; i++) {
                sum += rollDie();
            }
            sum -= 2;
            array[sum] += 1;
            sum = 0;
        }
        int sum_total = 0;
        for (int i = 0; i < 11;i ++){
            sum_total += array[i];
        }
        double two_percent = array[0]/sum_total;
        double three_percent = array[1]/sum_total;
        double four_percent = array[2]/sum_total;
        double five_percent = array[3]/sum_total;
        double six_percent = array[4]/sum_total;
        double seven_percent = array[5]/sum_total;
        double eight_percent = array[6]/sum_total;
        double nine_percent = array[7]/sum_total;
        double ten_percent = array[8]/sum_total;
        double eleven_percent = array[9]/sum_total;
        double twelve_percent = array[10]/sum_total;
        System.out.print(array[10]);
        System.out.print("               "+sum_total);
        return array;
    }
    public  static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many pair of dice you want");
        sumOfTwoDice(scan.nextInt());

    }
}
