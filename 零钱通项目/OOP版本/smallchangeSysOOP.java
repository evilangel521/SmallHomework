package ��������м�����.��Ǯͨ��Ŀ.OOP�汾;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class smallchangeSysOOP {
    //����
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key;
    //��Ǯͨ��ϸ
    String details = "---------------��Ǯͨ��ϸ-----------------";

    //�����������
    double money;
    double balance = 0;
    Date date = null; //data��java.util.Date;���ͣ���ʾ����
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //�����������ڸ�ʽ����

    //����
    //�����±������������ѵ�ԭ��
    String note;

    //�������ʾ�˵���������ѡ��
    public void mainMenu() {
        do {
            System.out.println("\n======��Ǯͨ�˵�(OOP)======");
            System.out.println("\t\t\t1 ��Ǯͨ��ϸ");
            System.out.println("\t\t\t2 ��������");
            System.out.println("\t\t\t3 ����");
            System.out.println("\t\t\t4 ��      ��");

            System.out.println("��ѡ��1-4��:");
            key = scanner.next();

            //ʹ��switch ��֧����
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
                    System.out.println("ѡ������������ѡ��1-4��");
            }
        } while (loop);

        System.out.println("�˳���Ǯͨ");
    }

    //�����Ǯͨ��ϸ
    public void detail() {
        System.out.println(details);
    }

    //�����������
    public void incime() {
        System.out.println("�������˽�");
        money = scanner.nextDouble();
        //У������monry��ֵ
        if (money <= 0) {
            System.out.println("���������� ��Ҫ����0");
            return;//�˳�����������ִ�к���Ĵ���
        }

        balance += money;
        //ƴ������������Ϣ��details
        date = new Date();//��ȡ��ǰ����

        details += "\n��������\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //����
    public void pay() {
        System.out.println("���ѽ�");
        money = scanner.nextDouble();

        //У������monry��ֵ
        if (money <= 0 || money > balance) {
            System.out.println("���ѽ������ ��Ҫ��0 - " + balance + "֮��");
            return;
        }

        System.out.println("����˵����");
        note = scanner.next();
        balance -= money;
        //ƴ��������Ϣ�� details
        date = new Date();//��ȡ��ǰ����
        details += "\n������Ŀ:" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //�˳�
    public void exit() {
        //����һ�δ������һ��С���ܣ�������Ҫ����һ��

        //�������choice�������û�������
        String choice;

        //ʹ��while+break����������յ���������y����n
        while (true) {
            System.out.println("��ȷ��Ҫ�˳��� y/n");
            choice = scanner.next();
            //��һ���жϷ��������Ǵ���Ŀ������ʹ�� ������临��
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
        //���û��˳�while�󣬽����ж�
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
