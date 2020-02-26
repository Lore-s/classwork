package abstractfactory;

/**
 * @ClassName Applepay
 * @Author lihaoyi
 * @Date 2020/2/25 18:55
 **/
public class Applepay implements ExternalPay{
    public void before() {
        System.out.println("苹果支付前...");
    }

    public void security() {
        System.out.println("苹果校验中...");
    }

    public void givemoney() {
        System.out.println("苹果扣钱中...");
    }

    public void after() {
        System.out.println("苹果支付后...");
    }
}
