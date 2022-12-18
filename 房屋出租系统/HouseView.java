package ��������м�����.���ݳ���ϵͳ;

/**
1.��ʾ����
2.�����û�������
3.����HouseService��ɶԷ�����Ϣ�ĸ��ֲ���
 */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';//�����û�ѡ��
    private HouseService houseService = new HouseService(10);//���������СΪ10

    //addHouse()�������룬����house���󣬵���add����
    public void addHouse(){
        System.out.println("=========��ӷ���=========");
        System.out.print("������");
        String name = utility.readString(8);
        System.out.print("�绰��");
        String phone = utility.readString(12);
        System.out.print("��ַ��");
        String address = utility.readString(16);
        System.out.print("���⣺");
        int rent = utility.readInt();
        System.out.print("״̬��");
        String state = utility.readString(3);
        //id��ϵͳ�����
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house)){
            System.out.println("��ӷ��ݳɹ�");
        }else {
            System.out.println("��ӷ���ʧ��");
        }
    }

    //����id���ҷ�����Ϣ
    public void findHouse(){
        System.out.println("=========���ҷ�����Ϣ=========");
        System.out.println("������Ҫ���ҵ�id");
        int findId = utility.readInt();
        //���÷���
        House house = houseService.findById(findId);
        if (house != null){
            System.out.println(house);
        }else {
            System.out.println("=========���ҷ�����Ϣid������=========");
        }
    }

    //��дdelHouse�������������id������Service��del����
    public void delHouse() {
        System.out.println("=========ɾ������=========");
        System.out.println("�������ɾ�����ݵı�ţ�-1�˳���");
        int delId = utility.readInt();
        if (delId == -1) {
            System.out.println("==========����ɾ��������Ϣ=========");
            return;
        }
        //ע��÷����������ѭ���жϵ��߼����������Y/N
        char choice = utility.readConfirmSelection();
        if (choice == 'Y') {//ȷ��ɾ��
            if (houseService.del(delId)) {
                System.out.println("=========ɾ��������Ϣ�ɹ�=========");

            } else {
                System.out.println("=========���ݱ�Ų����ڣ�ɾ��ʧ��");
            }
        } else {
            System.out.println("=========����ɾ��������Ϣ=========");
        }
    }

    //�޸�
    public void update(){
        System.out.println("=========�޸ķ�����Ϣ=========");
        System.out.println("��ѡ����޸ķ��ݱ�ţ�-1��ʾ�˳���");
        int updateId = utility.readInt();
        if (updateId == -1){
            System.out.println("=========�����޸ķ�����Ϣ=========");
            return;
        }
        //��������õ�updateId�����Ҷ���
        //���ص����������ͣ��������ؾ��������Ԫ��
        //�ں����house.setXxx�������ͻ��޸�HouseService��houses�����Ԫ��
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("=========�޸ķ�����Ϣ��Ų�����=========");
            return;
        }

        System.out.print("����(" + house.getName() + "): ");
        //��������û�ֱ�ӻس���ʾ���޸���Ϣ Ĭ��""
        String name = utility.readString(8, "");
        if (!"".equals(name)) {//������ǡ�����Ҫ�޸�
            house.setName(name);
        }
        System.out.print("�绰(" + house.getPhone() + "):");
        String phone = utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.print("��ַ(" + house.getAddress() + "):");
        String address = utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.print("���(" + house.getRent() + "):");
        int rent = utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.println("״̬(" + house.getState() + "):");
        String state = utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("===========�޸ķ�����Ϣ�ɹ�=========");
    }

    //�˳�
    public void exit(){
        char c = utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }
    public void listHouse(){//��ʾ�����б�
        System.out.println("=========�����б�=========");
        System.out.println("���\t\t����\t\t�绰\t\t��ַ\t\t����\t\t״̬��δ����/�ѳ��⣩");
        House[] houses = houseService.list();//�õ����з�����Ϣ
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){//������Ϊnull���Ͳ���ʾ��
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("========�����б���ʾ���========");
    }

    //��ʾ���˵�
    public void MainMenu(){

        do {
            System.out.println("\n=========���ݳ���ϵͳ=========");
            System.out.println("\t\t1.�� �� �� Դ");
            System.out.println("\t\t2.�� �� �� Դ");
            System.out.println("\t\t3.ɾ �� �� �� �� Ϣ");
            System.out.println("\t\t4.�� �� �� �� �� Ϣ");
            System.out.println("\t\t5.�� �� �� ��");
            System.out.println("\t\t6.��      ��");
            System.out.print("���������ѡ��1-6����");

            key = utility.readChar();

            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while (loop);
    }

}
