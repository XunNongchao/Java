public class ModelTest {
    public static void main(String[] args) {
        HungerSingleton hs = HungerSingleton.getHungerSingleton();
        LazySingleton ls1 = LazySingleton.getLazySingleton();
        LazySingleton ls2 = LazySingleton.getLazySingleton();

    }
}

//饿汉式
class HungerSingleton {

    private HungerSingleton() {}

    private static HungerSingleton s = new HungerSingleton();

    public static HungerSingleton getHungerSingleton() {
        return s;
    }
}

//懒汉式
class LazySingleton {

    private LazySingleton() {}

    private static LazySingleton s;

    public static LazySingleton getLazySingleton() {
        if (s == null) {
            s = new LazySingleton();
        }
        return s;
    }
}