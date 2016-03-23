package learn.lisho.oneweek;

import java.awt.*;

/**
 * Created by lisho on 16/3/21.
 */
public class RefTester {


    public static void main(String[] args) {

        Point p1,p2;//创建两个Point变量
        p1 = new Point(888, 999);//将一个新的Point对象赋给p1
        p2 = p1;//将p1的值赋给p2
        //改变p2的值
        p2.x = 222;
        p2.y = 333;
        //打印出来的结果
//        p1.x: 222   ---   p1.y: 333
//        p2.x: 222   ---   p2.y: 333
        //原因：p1和p2引用了同一个对象，p2 = p1的过程是p2引用了p1，而不是将p1拷贝给p2
        System.out.println("p1.x: " + p1.x +"   ---   " + "p1.y: "+ p1.y);
        System.out.println("p2.x: " + p2.x +"   ---   " + "p2.y: "+ p2.y);





    }
}
