/**
 * ClassName£º
 * Description£º
 * <p>company£º58Í¬³Ç <br>
 * Copyright£ºCopyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/11/16 16:09
 * @since JRE 1.6.0_22  or higher
 */
public class SingletonLazy {
    private volatile static SingletonLazy singleton = null;
    private SingletonLazy(){}

    public static SingletonLazy getSingleton(){
        if(null == singleton) {
            singleton=new SingletonLazy();
        }
        return singleton;
    }


    public static synchronized SingletonLazy getSingleton1(){
        if(null == singleton) {
            singleton=new SingletonLazy();
        }
        return singleton;
    }

    public static SingletonLazy getSingleton2(){
        if(null == singleton){
            synchronized (SingletonLazy.class){
                singleton=new SingletonLazy();
            }
        }
        return singleton;
    }

    public static SingletonLazy getSingleton3(){
        if(null == singleton){
            synchronized (SingletonLazy.class){
                if(null == singleton) {
                    singleton = new SingletonLazy();
                }
            }
        }
        return singleton;
    }

}
