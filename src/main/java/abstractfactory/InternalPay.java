package abstractfactory;

/**
 * @ClassName InternalPay
 * @Author lihaoyi
 * @Date 2020/2/25 18:47
 **/
public interface InternalPay {
    void before();
    void givemoney();
    void after();
}
