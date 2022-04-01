package se;

public class StringBuilderTest {
/*
    构造一个不包含任何字符且初始容量为 16 的 StringBuilder
    StringBuilder a = new StringBuilder();

    构造一个不包含任何字符且容量为 cap 的 StringBuilder
    StringBuilder b = new StringBuilder(int cap);

    构造一个 StringBuilder，内容初始化为 str
    StringBuilder c = new StringBuilder(String str);
    */

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("java");
        StringBuilder s2 = new StringBuilder(5);
        StringBuilder s3 = new StringBuilder("jeff");
        System.out.println("s1:" + s1.toString() + "\tcap" + s1.capacity());
        System.out.println("s2:" + s1.toString() + "\tcap" + s2.capacity());
//        s3 的 capacity 为 20 是因为初始容量 16 + jeff 的长度 4
        System.out.println("s3:" + s1.toString() + "\tcap" + s3.capacity());
    }
}
