package abstractfactory;

/**
 * @ClassName ApplePayFactory
 * @Author lihaoyi
 * @Date 2020/2/26 18:18
 **/
public class ApplePayFactory extends ExternalPayFactory{
    @Override
    public ExternalPay create() {
        return new Applepay();
    }
}
