package abstractfactory;

/**
 * @ClassName Alipay
 * @Author lihaoyi
 * @Date 2020/2/25 18:52
 **/
public class Alipay implements InternalPay{

    public void before() {
        System.out.println("支付宝支付前...");
    }

    public void givemoney() {
        System.out.println("支付宝扣钱中...");
    }

    public void after() {
        System.out.println("支付宝支付后...");
    }
}
