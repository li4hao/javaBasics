package learn.lisho.oneweek;

/**
 * Created by lisho on 16/3/21.
 * 书中实例
 * 描述：描述基本语法，太简单不写注释了。
 */
public class ValcanoRoot {
    String states;
    int speed;
    float tempereture;

    void checktempereture() {
        if (tempereture > 600) {
            states = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("states:" + states);
        System.out.println("speed:" + speed);
        System.out.println("tempereture:" + tempereture);
    }

    public static void main(String[] args) {

        ValcanoRoot vcr = new ValcanoRoot();
        vcr.states = "exploring";
        vcr.speed = 2;
        vcr.tempereture = 510;

        vcr.showAttributes();


    }

}
