package ��������м�����.��ȭ��Ϸ;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public void initial(){
        //ҳ��
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------��ӭ������Ϸ����-------------------");
        System.out.println();
        System.out.println("               ***********************");
        System.out.println("               *******��ȭ����ʼ��******");
        System.out.println("               ***********************");
        System.out.println("��ȭ����0.ʯͷ 1.���� 2.��");

        //��������
        System.out.print("���������������");
        String name = scanner.next();
        System.out.println(name+" VS ����  ��ս");

        //�ж��Ƿ�ʼ
        System.out.print("Ҫ��ʼ�𣿣�����yes/no��:");
        String b =scanner.next();
        int count = 0;
        int usercount=0;
        int computercount=0;
        while (b.equals("yes")){
            //ͳ�ƶ�ս����
            count++;

            //��ҳ�ȭ
            System.out.print("���ȭ 0.ʯͷ 1.���� 2.�����������Ӧ�����֣���");
            int a = scanner.nextInt();
            String [] fingers = {"ʯͷ","����","��"};
            System.out.println("���ȭ��"+fingers[a]);

            //���������ȭ
            Random random = new Random();
            int index = random.nextInt(3);
            Computer computer = new Computer();
            computer.Fingers(index);

            //�ж���Ӯ
            if ((a == 0 && index == 1)||(a == 1 && index == 2)||(a == 2 && index == 0)) {
                System.out.println("���˵����ϲ�㣬��Ӯ���ˣ�");
                usercount = usercount+1;
            }else if ((a == 0 && index == 2)||(a == 1 && index == 0)||(a == 2 && index == 1)){
                System.out.println("���˵���ܱ�Ǹ�������ˣ�");
                computercount = computercount+1;
            }else{
                System.out.println("���˵��ƽ�֣�");
            }

            //�Ƿ������һ��
            System.out.print("�Ƿ����������һ�֣�������yes/no��");
            b = scanner.next();
        }

        //�ܽ�
        System.out.println("----------------------�ܽ�---------------------");
        System.out.println(name+" VS ����");
        System.out.println("��ս������"+count);
        System.out.println("����\t\t�÷�");
        System.out.println("����\t"+computercount);
        System.out.println(name+"\t"+usercount);
        String i = computercount>usercount?"���ź��������˱���������":computercount<usercount?"��ϲ�㣬��Ӯ���˱���������":"ƽ�֣�";
        System.out.println(i);
    }
}
