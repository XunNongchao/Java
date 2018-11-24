public class ProxyTest {
    public static void main(String[] args) {
        UserImpl user = new UserImpl();
        ProxyUserImpl proxyUser = new ProxyUserImpl(user);
        proxyUser.buy();
    }
}

interface IShopping {
    public void buy();
}

class UserImpl implements IShopping {
    @Override
    public void buy() {
        for (int i = 0; i < 10000000; i++) {
        }
        System.out.println("正在SHOPPING。。。");
    }
}

class ProxyUserImpl implements IShopping {
    IShopping iShopping;//被代理的对象
    public ProxyUserImpl(IShopping iShopping) {
        this.iShopping = iShopping;
    }

    @Override
    public void buy() {
        //添加了计算时间的功能
        long start = System.currentTimeMillis();
        iShopping.buy();
        long end = System.currentTimeMillis();
        System.out.println("花费了" + (end - start));
    }
}