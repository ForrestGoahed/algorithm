/**
 * ClassName：
 * Description：
 * <p>company：58同城 <br>
 * Copyright：Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/11/16 13:47
 * @since JRE 1.6.0_22  or higher
 */
public class quickSort {

    public static void main(String[] args) {
        int[] array = {8,33,23,11,54,67,5,43};
        _quickSort(array, 0, array.length - 1);
        for(Integer i:array){
            System.out.println(i);
        }
    }

    public static void _quickSort(int[] array,int low,int high){
        int start=low,end=high,key=array[low];
        while(end>start){
            //从后往前比较，如果没有比基准值小的，比较下一个，知道有比关键值小的交换位置
            while(end>start && array[end]>=key)end--;
            if(array[end]<key){
                int temp=array[end];array[end]=key;key=temp;
            }
            //从前往后比较，如果没有比基准值大的，比较下一个，直到有比关键值大的交换位置
            while(start<end && array[start]<=key)start++;
            if(array[start]>=key){
                int temp=array[start];array[start]=key;key=temp;
            }
            //此时，第一遍循环比较结束，关键值位置已经确定，左边的值都比关键值小，右边的值都比关键值大
            //两边顺序可能不一样，进行递归调用
        }
        if(end<high)_quickSort(array,end+1,high);//右边序列
        if(start>low)_quickSort(array,low,start-1);
    }


    public static int getMiddle(int[] list,int low,int high) {
            int key=list[low];//数组第一个作为基元
            while(low<high){
                while (low<high && list[high]>=key){
                    high--;
                }
                list[low] = list[high];//比基元小的记录移到低端
                while(low<high && list[low]<=key){
                    low++;
                }
                list[high]=list[low];//比基元大记录移到高端
            }
            list[low]=key;//基元记录到尾
            return low;
    }

    public static void _quickSort1(int[]list,int low,int high){
        if(low<high){
            int middle=getMiddle(list, low, high);
            _quickSort1(list, low, middle - 1);
            _quickSort1(list, middle + 1, high);
        }
    }



}
