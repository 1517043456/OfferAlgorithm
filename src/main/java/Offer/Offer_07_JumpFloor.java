package Offer;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Offer_07_JumpFloor {
    public static void main(String[] args) {
        System.out.println(JumpFloor1(10));
        System.out.println(JumpFloor2(10));
        System.out.println(JumpFloor3(10));
    }
    //递归的解法
    private static int JumpFloor1(int target) {
        if(target<=2){
            //如果只有target=1，则1种；如果target=2，则2种
            return target;
        }
        return JumpFloor1(target-1)+JumpFloor1(target-2);
    }
//不用递归的方式(自底向上的方式，面试推荐写法)
    public static int JumpFloor2(int target) {
        int a = 1, b = 1;
        for (int i = 1; i < target; i++) {
            a = a + b;
            b = a - b;
        }
        return a;
    }
    //不用递归的方式
    public static  int JumpFloor3(int target){
        if(target <= 2){
            return target;
        }
        int Jump1 = 1, Jump2 = 2;
        for (int i = 3; i <= target; i++){
            int cur = Jump1 + Jump2;
            Jump1 = Jump2;
            Jump2 = cur;
        }
        return Jump2;

    }
}
