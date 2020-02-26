package samplefactory;

/**
 * @ClassName Test
 * @Author lihaoyi
 * @Date 2020/2/25 17:29
 **/
public class Test {
    public static void main(String[] args) {
        Pay pay = new Payfactory().paynewInstance(Unipay.class);
        pay.givemoney();
    }
}
