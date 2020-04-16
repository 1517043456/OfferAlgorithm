package Offer;

import java.util.Arrays;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Offer_05_minNumberInRotateArray {
    public static void main(String[] args) {
        int[] array = new int[]{6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,
                293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,
                5437,5448,5668,5706,5725,6300,6335};
        System.out.println(minNumInRotateArray3(array));
    }
    //第一种方法，线性查找法，直接按顺序查找,时间复杂度n(n),空间复杂度n（1）
    // 牛客网：运行时间：416ms
    //占用内存：28820k
    public static int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }
        int min = array[0];
        for(int i = 0;i<array.length;i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    //第二种方法，使用Array中的排序（快排），时间复杂的n（log2n)
    public static int minNumInRotateArray2(int[] array){
        Arrays.sort(array);
        return array[0];
    }
    //第三种，
    public static int minNumInRotateArray3(int[] array){
        if(array.length == 0){
            return 0;
        }
        int high = array.length -1;
        int low = 0;
        int mid ;
        while (low < high){
            if(array[low] < array[high]){
                return array[low];
            }
         mid = (high + low)/2;
            if(array[low] < array[mid]){
              low = mid  +1;
         }else if(array[mid] < array[high]){
                high = mid;
            }
            else
                low++;
        }
        return array[low];
    }
}
