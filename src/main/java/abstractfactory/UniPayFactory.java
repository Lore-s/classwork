package abstractfactory;

import factorymethod.Pay;
import factorymethod.PayFactory;

/**
 * @ClassName UniPayFactory
 * @Author lihaoyi
 * @Date 2020/2/25 18:35
 **/
public class UniPayFactory extends InternalPayFactory{

    @Override
    public InternalPay create() {
        return new Unipay();
    }
}
