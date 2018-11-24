public class AdapterTest {
    public static void main(String[] args) {
        IPowerB powerB = new PowerBimpl();
        IPowerA powerA = new Adapter(powerB);
        work(powerA);
    }
    public static void work(IPowerA powerA) {
        //work只能被PowerA使用，PowerB若想使用必须转换成PowerA
        powerA.insert();
    }
}

interface IPowerA {
    public void insert();
}

class PowerAimpl implements IPowerA {
    public void insert() {
        System.out.println("PowerA正在工作");
    }
}

interface IPowerB {
    public void insert();
}

class PowerBimpl implements IPowerB {
    public void insert() {
        System.out.println("PowerB正在工作");
    }
}

class Adapter implements IPowerA {
    //适配器类，用构造方法将PowerB传入，实现IPowerA接口（insert函数）
    IPowerB powerB;
    public Adapter(IPowerB powerB) {
        this.powerB = powerB;
    }
    public void insert() {
        powerB.insert();
    }
}