/**
 * ClassName��
 * Description��
 * <p>company��58ͬ�� <br>
 * Copyright��Copyright ? 2011 58.com All Rights Reserved<br>
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
            //�Ӻ���ǰ�Ƚϣ����û�бȻ�׼ֵС�ģ��Ƚ���һ����֪���бȹؼ�ֵС�Ľ���λ��
            while(end>start && array[end]>=key)end--;
            if(array[end]<key){
                int temp=array[end];array[end]=key;key=temp;
            }
            //��ǰ����Ƚϣ����û�бȻ�׼ֵ��ģ��Ƚ���һ����ֱ���бȹؼ�ֵ��Ľ���λ��
            while(start<end && array[start]<=key)start++;
            if(array[start]>=key){
                int temp=array[start];array[start]=key;key=temp;
            }
            //��ʱ����һ��ѭ���ȽϽ������ؼ�ֵλ���Ѿ�ȷ������ߵ�ֵ���ȹؼ�ֵС���ұߵ�ֵ���ȹؼ�ֵ��
            //����˳����ܲ�һ�������еݹ����
        }
        if(end<high)_quickSort(array,end+1,high);//�ұ�����
        if(start>low)_quickSort(array,low,start-1);
    }


    public static int getMiddle(int[] list,int low,int high) {
            int key=list[low];//�����һ����Ϊ��Ԫ
            while(low<high){
                while (low<high && list[high]>=key){
                    high--;
                }
                list[low] = list[high];//�Ȼ�ԪС�ļ�¼�Ƶ��Ͷ�
                while(low<high && list[low]<=key){
                    low++;
                }
                list[high]=list[low];//�Ȼ�Ԫ���¼�Ƶ��߶�
            }
            list[low]=key;//��Ԫ��¼��β
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
