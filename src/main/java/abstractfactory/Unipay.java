package abstractfactory;

/**
 * @ClassName Unipay
 * @Author lihaoyi
 * @Date 2020/2/25 18:53
 **/
public class Unipay implements InternalPay{

    public void before() {
        System.out.println("银联支付前...");
    }

    public void givemoney() {
        System.out.println("银联扣钱中...");
    }

    public void after() {
        System.out.println("银联支付后...");
    }
}
