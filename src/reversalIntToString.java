/**
 * ClassName��
 * Description��
 * <p>company��58ͬ�� <br>
 * Copyright��Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/11/15 13:36
 * @since JRE 1.6.0_22  or higher
 */
public class reversalIntToString {

    public static String cnum="";
    /**
     * 输入int型，返回整数逆序后的字符串 123---->321
     *要求：1、必须使用递归；2、不能使用全局变量；3、输入必须是一个参数
     * @param num
     * @return
     */
    public static String reverIntToString(int num){
        if(num < 0) return "";
        if(num<10) return Integer.toString(num);
        int last = num - (num/10)*10;
        return Integer.toString(last)+reverIntToString(num/10);
    }

    public static void main(String[] args) {
        System.out.println(reverIntToString(609));
    }
}
