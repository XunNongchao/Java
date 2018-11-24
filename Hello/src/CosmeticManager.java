import java.util.Arrays;

public class CosmeticManager {
    //使用CosmeticManager类管理Cosmetic类
    protected Cosmetic cosmetic[] = new Cosmetic[5];
    protected static int counter = 0;

    public void add(Cosmetic newCosmetic) {
        //实现动态数组，如果长度已满则扩充为原长度的二倍
        if (cosmetic.length == counter) {
            cosmetic = Arrays.copyOf(cosmetic,cosmetic.length * 2);
        }
        cosmetic[counter++] = newCosmetic;
    }

    public void show() {
        for (Cosmetic cos :
                cosmetic) {
            if (cos == null) {
                break;
            }
            System.out.println(cos);
        }
    }

    public static void main(String[] args) {
        SortCosmetic cs = new SortCosmetic();
        cs.add(new Cosmetic("兰蔻", "非国产", 500));
        cs.add(new Cosmetic("雅诗兰黛", "非国产", 1000));
        cs.add(new Cosmetic("郁美净", "国产", 5));
        cs.add(new Cosmetic("大宝", "国产", 20));
        cs.add(new Cosmetic("迪奥", "非国产", 800));
        cs.add(new Cosmetic("香奈儿", "非国产", 950));
        cs.show();
    }
}

class SortCosmetic extends CosmeticManager {
    public void show() {
        //重写CosmeticManager.show()按价格冒泡排序
        for (int i = 0; i < counter; i++) {
            for (int j = i; j < counter; j++) {
                if (cosmetic[i].getPrice() > cosmetic[j].getPrice()) {
                    Cosmetic temp = cosmetic[i];
                    cosmetic[i] = cosmetic[j];
                    cosmetic[j] = temp;
                }
            }
        }

        for (Cosmetic cos :
                cosmetic) {
            if (cos == null) {
                break;
            }
            System.out.println(cos);
        }
    }
}

class Cosmetic {
    //化妆品类
    private String name;
    private String type;
    private int price;

    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "," + type + "," + price;
    }
}
