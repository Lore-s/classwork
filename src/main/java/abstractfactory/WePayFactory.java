package abstractfactory;

import factorymethod.Pay;
import factorymethod.PayFactory;

/**
 * @ClassName WePayFactory
 * @Author lihaoyi
 * @Date 2020/2/25 18:35
 **/
public class WePayFactory extends InternalPayFactory{

    @Override
    public InternalPay create() {
        return new Wepay();
    }
}
