package se;

public class BitOperation {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        System.out.printf("a:" + Integer.toBinaryString(a) +
                "\tb:" + Integer.toBinaryString(b) + "\n");
        System.out.println("a & b = " + Integer.toBinaryString(a & b));
        System.out.println("a | b = " + Integer.toBinaryString(a | b));
        //按位异或
        System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
        //按位补 取反
        System.out.println("~a = " + Integer.toBinaryString(~a));
        System.out.println("a << 2 = " + Integer.toBinaryString(a << 2));
        System.out.println("a >> 2 = " + Integer.toBinaryString(a >> 2));
        //按位右移补零
        System.out.println("a >>> 2 = " + Integer.toBinaryString(a >>> 2));
    }
}
