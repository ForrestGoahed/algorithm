import java.util.Map;

/**
 * ClassName£º
 * Description£º
 * <p>company£º58Í¬³Ç <br>
 * Copyright£ºCopyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/11/16 10:44
 * @since JRE 1.6.0_22  or higher
 */
public class reHash {

    void transfer(Map.Entry[] newTable){
        int newCapacity = newTable.length;
//        for(Entry<K,V> e : table){
//            do{
//                Map.Entry<K,V> next = e.next;
//                e.hash = null == e.key ? 0 : hash(e.key);
//                int i = indexFor(e.hash,newCapacity);
//                e.next = newTable[i];
//                newTable[i] = e;
//                e = next;
//            }while(null != e);
//        }
    }
}
