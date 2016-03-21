package learn.lisho.oneweek;

/**
 * Created by lisho on 16/3/19.
 * 用于静态方法调用测试
 */
public class StaticMethodAddVariable {

    private static  int number=1;
    private int number1 = 2;

    public static void printMessage() {
        number++; //正确。静态方法只能使用静态变量（类变量）
//        number1 ++; 错误。静态方法不能使用实例变量
        System.out.println("static send a message!");
    }

    public void printMesssage1() {

        //正确。对象方法可以使用静态变量或者实例变量
        number++;
        number1++;

        System.out.println(" send a message");
    }

    public static void main(String[] args) {

        //静态方法（类方法)可直接通过类名.方法名  来调用。
        learn.lisho.oneweek.StaticMethodAddVariable.printMessage();
        //也可以通过创建对象通过对象调用
        StaticMethodAddVariable smc = new StaticMethodAddVariable();
        smc.printMessage();

        //错误，实例方法不能直接通过类名调用
//        StaticMethodAddVariable.printMessage1();




    }

}
