package abstractfactory;

/**
 * @ClassName AwsPayFactory
 * @Author lihaoyi
 * @Date 2020/2/26 18:19
 **/
public class AwsPayFactory extends ExternalPayFactory
{
    @Override
    public ExternalPay create() {
        return new Awspay();
    }
}
