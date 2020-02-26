package abstractfactory;

/**
 * @ClassName ExternalPayFactory
 * @Author lihaoyi
 * @Date 2020/2/26 18:09
 **/
public abstract class ExternalPayFactory extends PayFactory{
    public ExternalPayFactory() {
        super();
    }

    abstract ExternalPay create();
}
