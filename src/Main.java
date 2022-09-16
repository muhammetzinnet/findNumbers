import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,5,7,9,0,8};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bulmak istediğiniz sayıyı giriniz: ");
        int enteredNumber = scanner.nextInt();
        boolean isThere = false;

        for (int number : numbers){
            if (number == enteredNumber){
                isThere = true;
                break;
            }
        }

        if (isThere){
            System.out.println("Sayı mevcuttur");
        }else {
            System.out.println("Sayı mevcut değildir");
        }
    }
}