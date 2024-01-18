import java.util.Stack;


public class LargestAreaHistogram {
    public int largestArea(int[] height){
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(0);

        for (int i = 1; i < height.length ; i++) {
            while(!stack.empty() && height[i]< height[stack.peek()]){
                max = geMax(height,stack,max,i);
            }
            stack.push(i);
        }
        int  i = height.length;
        while(!stack.empty()){
            max = geMax(height,stack,max,i);
        }
        return max;
    }

    private int geMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area = 0;
        int popped = stack.pop();
        if(!stack.empty()){
           area = arr[popped]*i;
        }else{
            area = arr[popped]*(i-1-stack.peek());
        }
        return  Math.max(max,area);
    }

}
