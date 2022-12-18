package 面向对象中级部分.零钱通项目.OOP版本;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class smallchangeSysOOP {
    //属性
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key;
    //零钱通明细
    String details = "---------------零钱通明细-----------------";

    //完成收益入账
    double money;
    double balance = 0;
    Date date = null; //data是java.util.Date;类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //可以用于日期格式发的

    //消费
    //定义新变量，保存消费的原因
    String note;

    //先完成显示菜单，并可以选择
    public void mainMenu() {
        do {
            System.out.println("\n======零钱通菜单(OOP)======");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退      出");

            System.out.println("请选择（1-4）:");
            key = scanner.next();

            //使用switch 分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.incime();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择（1-4）");
            }
        } while (loop);

        System.out.println("退出零钱通");
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益入账
    public void incime() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        //校验收入monry的值
        if (money <= 0) {
            System.out.println("收入金额有误 需要大于0");
            return;//退出方法，不在执行后面的代码
        }

        balance += money;
        //拼接收益入账信息到details
        date = new Date();//获取当前日期

        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //消费
    public void pay() {
        System.out.println("消费金额：");
        money = scanner.nextDouble();

        //校验消费monry的值
        if (money <= 0 || money > balance) {
            System.out.println("消费金额有误 需要在0 - " + balance + "之间");
            return;
        }

        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
        //拼接消费信息到 details
        date = new Date();//获取当前日期
        details += "\n消费项目:" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit() {
        //建议一段代码完成一个小功能，尽量不要混在一起

        //定义变量choice，接收用户的输入
        String choice;

        //使用while+break，来处理接收到的输入是y还是n
        while (true) {
            System.out.println("你确定要退出吗 y/n");
            choice = scanner.next();
            //另一种判断方法，但是大项目不建议使用 需求大会变复杂
//                        if ("y".equals(choice)){
//                            loop = false;
//                            break;
//                        }
//                        else  if ("n".equals(choice)){
//                            break;
//                        }

            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        //当用户退出while后，进行判断
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
