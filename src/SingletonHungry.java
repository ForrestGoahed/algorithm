/**
 * ClassName��
 * Description��
 * <p>company��58ͬ�� <br>
 * Copyright��Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/11/16 16:06
 * @since JRE 1.6.0_22  or higher
 */
public class SingletonHungry {
    private static SingletonHungry singleton = new SingletonHungry();
    private SingletonHungry(){}

    public static SingletonHungry getSingleton(){
        return singleton;
    }

}
