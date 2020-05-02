package leetcode.editor.cn;


public class IntReverse {
    public static void main(String[] args) {
        System.out.println(IntReverse.reverse(-678989086));
    }

    public static  int reverse(int x) {
        long temp = 0;

        while(x != 0){
            int pop = x % 10;
            temp = temp * 10 + pop;

            if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
                return 0;
            }
            x /= 10;
        }
        return (int)temp;
    }
}
