import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1, number2;

        System.out.print("Birinci sayıyı girin: ");
        number1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        number2 = input.nextInt();

        if (number1 > number2){
            System.out.println("Küçük sayı: " + number2);
        }
        else if (number2 > number1) {
            System.out.println("Küçük sayı: " + number1);
        }
        else{
            System.out.println("Sayılar birbirine eşit");
        }

    }
}