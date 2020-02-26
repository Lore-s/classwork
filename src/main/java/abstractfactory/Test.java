package abstractfactory;

/**
 * @ClassName Test
 * @Author lihaoyi
 * @Date 2020/2/26 18:20
 **/
public class Test {
    public static void main(String[] args) {
        ExternalPayFactory factory = new ApplePayFactory();
        ExternalPay pay = factory.create();
        pay.security();
    }
}
