package factorymethod;

/**
 * @ClassName AliPayFactory
 * @Author lihaoyi
 * @Date 2020/2/25 18:35
 **/
public class AliPayFactory implements PayFactory{

    public Pay create() {
        return new Alipay();
    }
}
