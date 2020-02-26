package abstractfactory;

/**
 * @ClassName Wepay
 * @Author lihaoyi
 * @Date 2020/2/25 18:52
 **/
public class Wepay implements InternalPay{

    public void before() {
        System.out.println("微信支付前...");
    }

    public void givemoney() {
        System.out.println("微信扣钱中...");
    }

    public void after() {
        System.out.println("微信支付后...");
    }
}
