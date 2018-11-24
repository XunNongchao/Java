public class FactoryTest {
    public static void main(String[] args) {
        Product product = ProductFactory.getProduct("TV");
        if (null != product) {
            product.work();
        }

    }
}

class ProductFactory {
    //通过工厂对象决定创建那种产品
    public static Product getProduct(String product) {
        if ("phone".equals(product)) {
            return new Phone();
        }
        if ("TV".equals(product)) {
            return new TV();
        }
        return null;
    }
}

abstract class Product {
    public abstract void work();
}

class Phone extends Product {
    @Override
    public void work() {
        System.out.println("这是一个手机");
    }
}

class TV extends Product {
    @Override
    public void work() {
        System.out.println("这是一个电视");
    }
}