package factorymethod;

/**
 * @ClassName WePayFactory
 * @Author lihaoyi
 * @Date 2020/2/25 18:35
 **/
public class WePayFactory implements PayFactory{

    public Pay create() {
        return new Wepay();
    }
}
