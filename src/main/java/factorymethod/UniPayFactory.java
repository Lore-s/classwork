package factorymethod;

/**
 * @ClassName UniPayFactory
 * @Author lihaoyi
 * @Date 2020/2/25 18:35
 **/
public class UniPayFactory implements PayFactory{

    public Pay create() {
        return new Unipay();
    }
}
