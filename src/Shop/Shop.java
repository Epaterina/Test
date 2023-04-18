package Shop;

import Shop.clothes.Cap;
import Shop.clothes.Cloth;
import Shop.clothes.Shorts;
import Shop.clothes.Tshirt;

import java.util.ArrayList;
import java.util.Arrays;


public class Shop {
    public ArrayList<Cloth> cloths = new ArrayList<>();



    public Shop() {
        cloths.add( new Shorts("Шорты", Arrays.asList("Черный","Белый"), 300));
        cloths.add( new Cap("Кепка", Arrays.asList("Черный","Серый"),100));
        cloths.add(new Tshirt("Футболка", Arrays.asList("Черный","Сиреневый"),500));



    }

    public Cloth getCloth(int selectedCloth) {
        return cloths.get(selectedCloth-1);
    }

    public void removeCloth(Cloth cloth) {
        cloths.remove(cloth);
    }
    public void showColorCloth(Cloth cloth) {
        for (int i = 0; i < cloth.color.size(); i++){
            System.out.println("номер цвета  " + i + "-" + cloth.color.get(i));
        }
    }
}




