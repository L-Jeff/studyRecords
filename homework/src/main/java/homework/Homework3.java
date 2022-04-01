package homework;

import java.io.BufferedInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Homework3 {


    public static void main(String[] args) {
        Vector list = new Vector();
        list.add(new Book("三国演义",20.00,"罗贯中"));
        list.add(new Book("水浒传",25.00,"施耐庵"));
        list.add(new Book("红楼梦",15.00,"曹雪芹"));
        list.add(20,new Book("西游记",30.00,"吴承恩"));
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                if(book1.price > book2.price){
                    return -1;
                }else if(book1.price <book2.price){
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(list);
        String s = (String) new Object();
    }


}
