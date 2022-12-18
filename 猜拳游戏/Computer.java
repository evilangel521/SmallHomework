package 面向对象中级部分.猜拳游戏;

public class Computer {
    public void Fingers(int index) {
        String[] fingers = {"石头", "剪刀", "布"};
        System.out.println("电脑出拳：" + fingers[index]);
    }
}