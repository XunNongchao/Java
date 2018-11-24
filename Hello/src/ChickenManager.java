import java.util.Arrays;

public class ChickenManager {

    public static void main(String[] args) {

        Manager chickenManager = new Manager(5);
        chickenManager.add(new Chicken(1, "小鸡1号", 5.6));
        chickenManager.add(new Chicken(2, "小鸡2号", 3.4));
        chickenManager.add(new Chicken(3, "小鸡3号", 6.7));
        chickenManager.add(new Chicken(4, "小鸡4号", 8.2));
        chickenManager.add(new Chicken(5, "小鸡5号", 8.9));
        chickenManager.add(new Chicken(6, "小鸡6号", 10.7));

        chickenManager.findAll();
        System.out.println("----------------------");

        System.out.println(chickenManager.find(3));
        System.out.println("----------------------");

        chickenManager.update(new Chicken(3,"大鸡3号",15.2));
        chickenManager.findAll();
        System.out.println("----------------------");

        chickenManager.delete(6);
        chickenManager.findAll();
        System.out.println("----------------------");
    }
}


class Manager {
    //实现对Chicken的增删改查
    private Chicken[] chickens;
    private static int counter = 0;

    public Manager(int size) {
        if(size <= 5) {
            chickens = new Chicken[5];
        } else {
            chickens = new Chicken[size];
        }
    }

    public void add(Chicken chicken) {
        //如果数组已满，长度扩充为原来的二倍
        if (chickens.length == counter) {
            chickens = Arrays.copyOf(chickens,chickens.length * 2);
        }
        chickens[counter++] = chicken;
    }

    public Chicken find(int id) {
        for (int i = 0; i < chickens.length; i++) {
            if (chickens[i].getId() == id) {
                return chickens[i];
            }
        }
        return null;
    }

    public void update(Chicken chicken) {
        Chicken newChicken = this.find(chicken.getId());
        newChicken.setName(chicken.getName());
        newChicken.setWeight(chicken.getWeight());
    }

    public void delete(int id) {
        for (int i = 0; i < counter; i++) {
            if (chickens[i].getId() == id) {
                chickens[i] = chickens[counter - 1];
                chickens[counter - 1] = null;
                counter--;
                break;
            }
        }
    }

    public void findAll() {
        for (Chicken chicken :
                chickens) {
            if (chicken == null) {
                break;
            }
            System.out.println(chicken);
        }
    }
}

class Chicken {
    private int id;
    private String name;
    private double weight;

    public Chicken(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + weight;
    }
}