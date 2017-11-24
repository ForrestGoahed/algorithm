import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ClassName：
 * Description：
 * <p>company：58同城 <br>
 * Copyright：Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/11/15 10:52
 * @since JRE 1.6.0_22  or higher
 */

public class CommonNum {
    /**
     * 输入两个数组，返回公共值
     * @param arr1
     * @param arr2
     * @return
     */
    public static int[] commonNum(int arr1[], int arr2[]) {
        int i=0,j=0,k=0;int[] arr3;
        Arrays.sort(arr1);Arrays.sort(arr2);
        if(arr1.length < arr2.length)
            arr3 = new int[arr1.length];
        else
            arr3 = new int[arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]) i++;
            else if(arr1[i]>arr2[j]) j++;
            else{ arr3[k] = arr1[i];i++;j++;k++;}
        }
        arr3 = Arrays.copyOf(arr3,k);
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 ={0,1,5,6,8,12};
        int[] arr2 = {0,5,7,6,12};
        int[] arr3 = commonNum(arr1,arr2);
        for(int a:arr3){
            System.out.println(a);
        }
    }
}
