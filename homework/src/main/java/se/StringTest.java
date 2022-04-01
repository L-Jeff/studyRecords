package se;

public class StringTest {
    public static void main(String[] args) {
        String s = new String("Java");
        String m = "java";
        System.out.println("equals:" + s.equals(m));
        System.out.println("equlasIgnoreCase:" + s.equalsIgnoreCase(m));

        String ss = "abcdefabc";
        System.out.println("字符a第一次出现的位置为：" + ss.indexOf('a'));
        System.out.println("字符串bc第一次出现的位置为：" + ss.indexOf("bc"));
        System.out.println("字符串a最后一次出现的位置为：" + ss.lastIndexOf('a'));
        System.out.println("从位置3开始到结束的字符串：" + ss.substring(3));
        System.out.println("从位置3开始到6之间的字符串：" + ss.substring(3, 6));

    }
}
