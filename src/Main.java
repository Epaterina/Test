import Shop.Shop;
import Shop.clothes.Cash;
import Shop.clothes.Cloth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ввведите свой бюджет");
        Cash cash = new Cash();
        while (true) {
            System.out.println("Одежда в наличии");
            Shop shop = new Shop();
            System.out.println();
            System.out.println("Введите номер одежды ");
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            int selectedCloth = scanner.nextInt();
            Cloth cloth = shop.getCloth(selectedCloth);
            System.out.println();
            System.out.println("Вы выбрали одежду " + cloth.name);
            System.out.println();
            System.out.println("Выберите цвет одежды ");
            shop.showColorCloth(cloth);
            int selectedColorCloth = scanner.nextInt();
            System.out.println("Вы выбрали цвет " + cloth.color.get(selectedColorCloth));
            System.out.println("Приобретена одежда: " + cloth.name+" цвета  " + cloth.color.get(selectedCloth));
            System.out.println();
            cash.count ++;
            cash.byCloth(cloth);
            System.out.println("Кол-во одежды " + cash.count);
            System.out.println();
            if (cash.wallet < cloth.price) {
                break;
            }


        }
    }
}