package Offer;

public class Offer_08_JumpFloor2 {
    public static void main(String[] args) {
        System.out.println(JumpFloorII(4));
    }
    public static int JumpFloorII(int target) {
      if(target<=2){
          //如果小于2,，即只有1,2，两种情况
          return target;
      }
      //Math.pow(底数,几次方)
      return (int) Math.pow(2,target-1);
    }
}
