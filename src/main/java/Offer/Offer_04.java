package Offer;

import java.util.Stack;

public class Offer_04 {
    public static void main(String[] args) {
        //初始化一个大小为4的队列
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        solution.push(4);
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());
    }
}

class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        //先将push到队列的元素加入栈1中
        stack1.push(node);
    }

    public int pop() {
        if(!stack2.empty()){
            //检查栈2中是否还有元素，如果有就直接从栈2中取出
            return stack2.pop();
        }else {
            //如果栈2为空，就从栈1将数据倒入栈2，达到顺序的效果
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
