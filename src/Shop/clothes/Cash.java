package Shop.clothes;
import java.util.Scanner;
public class Cash {

    Scanner scanner = new Scanner(System.in);
    public int wallet = scanner.nextInt();
    public int count;

    public Cash() {

        System.out.println("Ваш бюджет: " + wallet);
        System.out.println("");
    }

    public void byCloth(Cloth cloth) {

            if (wallet > cloth.price) {
                if (count == 3) {
                    int discount = cloth.price * 50 / 100;
                    wallet -= discount;
                    System.out.println("Цена одежды с учетом скидки равна " + discount);
                    System.out.println();
                    System.out.println("У вас осталось " + wallet);
                    count = 0;
                }else {
                    wallet -= cloth.price;
                    System.out.println("У вас осталось " + wallet);
                }


            }
        }

}

