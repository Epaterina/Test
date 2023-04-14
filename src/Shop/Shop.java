package Shop;

import Shop.clothes.Cap;
import Shop.clothes.Cloth;
import Shop.clothes.Shorts;
import Shop.clothes.Tshirt;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    public Shorts shorts = new Shorts("Шорты", Arrays.asList("Черный","Белый"), 300);
    public Cap cap = new Cap("Кепка", Arrays.asList("Черный","Серый"),100);
    public Tshirt tshirt = new Tshirt("Футболка", Arrays.asList("Черный","Черный"),500);

    public Shop() {
        System.out.println("1-" + shorts.name);
        System.out.println("2-" + cap.name);
        System.out.println("3-" + tshirt.name);
    }

    public Cloth getCloth(int selectedCloth) {
        if (selectedCloth == 1) {
            return shorts;
        }
        if (selectedCloth == 2) {
            return cap;
        }
        if (selectedCloth == 3) {
            return tshirt;
        }
        return null;
    }
    public void showColorCloth(Cloth cloth) {
        for (int i = 0; i < cloth.color.size(); i++){
            System.out.println("номер цвета  " + i + "-" + cloth.color.get(i));
        }
    }
}




