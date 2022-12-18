package 面向对象中级部分.猜拳游戏;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public void initial(){
        //页面
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------欢迎进入游戏界面-------------------");
        System.out.println();
        System.out.println("               ***********************");
        System.out.println("               *******猜拳，开始！******");
        System.out.println("               ***********************");
        System.out.println("出拳规则：0.石头 1.剪刀 2.布");

        //输入姓名
        System.out.print("请输入你的姓名：");
        String name = scanner.next();
        System.out.println(name+" VS 电脑  对战");

        //判断是否开始
        System.out.print("要开始吗？（输入yes/no）:");
        String b =scanner.next();
        int count = 0;
        int usercount=0;
        int computercount=0;
        while (b.equals("yes")){
            //统计对战次数
            count++;

            //玩家出拳
            System.out.print("请出拳 0.石头 1.剪刀 2.布（输入相对应的数字）：");
            int a = scanner.nextInt();
            String [] fingers = {"石头","剪刀","布"};
            System.out.println("你出拳："+fingers[a]);

            //电脑随机出拳
            Random random = new Random();
            int index = random.nextInt(3);
            Computer computer = new Computer();
            computer.Fingers(index);

            //判断输赢
            if ((a == 0 && index == 1)||(a == 1 && index == 2)||(a == 2 && index == 0)) {
                System.out.println("结果说：恭喜你，你赢得了！");
                usercount = usercount+1;
            }else if ((a == 0 && index == 2)||(a == 1 && index == 0)||(a == 2 && index == 1)){
                System.out.println("结果说：很抱歉，你输了！");
                computercount = computercount+1;
            }else{
                System.out.println("结果说：平局！");
            }

            //是否进行下一局
            System.out.print("是否继续进行下一局！（输入yes/no）");
            b = scanner.next();
        }

        //总结
        System.out.println("----------------------总结---------------------");
        System.out.println(name+" VS 电脑");
        System.out.println("对战次数："+count);
        System.out.println("姓名\t\t得分");
        System.out.println("电脑\t"+computercount);
        System.out.println(name+"\t"+usercount);
        String i = computercount>usercount?"很遗憾，你输了本场比赛！":computercount<usercount?"恭喜你，你赢得了本场比赛！":"平局！";
        System.out.println(i);
    }
}
