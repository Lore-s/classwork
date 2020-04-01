package samplefactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Author lihaoyi
 * @Date 2020/2/25 17:29
 **/
public class Test {
    public static void main(String[] args) {
        Pay pay = new Payfactory().paynewInstance(Unipay.class);
        pay.givemoney();

        List<String> strings = new ArrayList<>(5);
        strings.add("333666");
        List<String> stringList = new ArrayList<>();
        strings.forEach(stringList :: add);
        System.out.println(stringList.size());
    }
}
