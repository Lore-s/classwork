package abstractfactory;

/**
 * @ClassName ExternalPay
 * @Author lihaoyi
 * @Date 2020/2/25 18:47
 **/
public interface ExternalPay {
    void before();
    void security();
    void givemoney();
    void after();
}
