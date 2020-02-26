package samplefactory;

/**
 * @ClassName Payfactory
 * @Author lihaoyi
 * @Date 2020/2/25 17:21
 **/
public class Payfactory {
    public Pay paynewInstance(Class<? extends Pay> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
