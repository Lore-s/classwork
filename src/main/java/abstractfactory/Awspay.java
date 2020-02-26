package abstractfactory;

/**
 * @ClassName Awspay
 * @Author lihaoyi
 * @Date 2020/2/25 18:57
 **/
public class Awspay implements ExternalPay{
    public void before() {
        System.out.println("亚马逊支付前...");
    }

    public void security() {
        System.out.println("亚马逊校验中...");
    }

    public void givemoney() {
        System.out.println("亚马逊扣钱中...");
    }

    public void after() {
        System.out.println("亚马逊支付后...");
    }
}
