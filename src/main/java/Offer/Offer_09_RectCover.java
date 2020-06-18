package Offer;

public class Offer_09_RectCover {

    public static void main(String[] args) {
      //测试
        System.out.println(RectCover(1));
        System.out.println(RectCover(2));
        System.out.println(RectCover(3));
        System.out.println(RectCover(4));
        System.out.println(RectCover(5));
        System.out.println(RectCover(6));
    }
    public static int RectCover(int target) {
        if (target <=0){
            return 0;
        }else if(target==1) {
            return 1;
        }else if(target==2){
            return 2;
        }else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }
}
