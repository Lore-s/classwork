package samplefactory;

/**
 * @ClassName Wechatpay
 * @Author lihaoyi
 * @Date 2020/2/25 17:13
 **/
public class Wepay implements Pay {

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