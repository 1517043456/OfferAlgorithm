package Offer;

/**
 * 题目：在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Offer_01 {
    public static void main(String[] args) {
//      int[][] arr = new int[][]{{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8,9}};
//        System.out.println(Find2(20,arr));
      int[][] arr = new int[3][5];
        int temp = 0;
      for(int i = 0;i<arr.length;i++){
          for(int j= 0 ;j<arr[i].length;j++){
              temp +=1;
              arr[i][j] = temp;
          }
      }
      for(int[] ar : arr){
          for(int i : ar){
              System.out.print(" "+i+" ");
          }
          System.out.println();
      }
      //如何获得行列：
        int row = arr.length;//行
        int column = arr[0].length;//列
        System.out.println("行："+row);
        System.out.println("列："+column);
        //使用查找
        System.out.println(Find3(20,arr));
    }
    //暴力的顺序查找，双重for循环，牛客测试：运行时间：149ms，占用内存：17420k
    public static boolean Find(int target, int [][] array) {
     for(int i = 0;i<array.length;i++){
         for(int j = 0;j<array[i].length;j++){
             if(array[i][j] == target){
                 return true;
             }
         }
     }
        return false;
    }
    //依旧是暴力的解决问题：foreach循环，n^n。牛客网上的测试时间是：运行时间：149ms，占用内存：17552k
    public static boolean Find2(int target,int[][] array){
        for(int[] arr : array){
            for(int i : arr){
                if(target == i){
                    return true;
                }
            }
        }
        return false;
    }
    //换个方式解决，由于每一行是递增序列，因此对每一行进行折半查找.时间复杂度为n^log2n。牛客：运行时间：186ms，占用内存：17408k
    public static boolean Find3(int target,int[][] array){
        for(int i = 0;i< array.length;i++){
            int mid;
            int low = 0;
            int high = array[i].length -1;
            while (low <= high){
                mid = (low+high)/2;
                if(target < array[i][mid]){
                    high = mid-1;
                }else if(target >array[i][mid]){
                    low = mid+1;
                }else {
                    //相等的时候
                    return true;
                }
            }
        }
        return false;
    }

}

