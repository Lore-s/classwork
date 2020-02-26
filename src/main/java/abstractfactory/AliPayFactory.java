package abstractfactory;

import factorymethod.Pay;
import factorymethod.PayFactory;

/**
 * @ClassName AliPayFactory
 * @Author lihaoyi
 * @Date 2020/2/25 18:35
 **/
public class AliPayFactory extends InternalPayFactory{

    @Override
    public InternalPay create() {
        return new Alipay();
    }
}
