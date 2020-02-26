package abstractfactory;

/**
 * @ClassName InternalPayFactory
 * @Author lihaoyi
 * @Date 2020/2/26 18:04
 **/
public abstract class InternalPayFactory extends PayFactory{
    public InternalPayFactory() {
        super();
    }

    abstract InternalPay create();
}
