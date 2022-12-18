package ��������м�����.���ݳ���ϵͳ;

public class HouseService {

    private House[] houses;//����House����
    private int houseNums = 1;//��¼��ǰ�ж��ٸ�������Ϣ
    private int idCounter = 1;//��¼��ǰ��id�������ĸ�ֵ


    public HouseService(int size){

        houses = new House[size];//������HouseService����ָ�������С
        //��ʼ��һ��House����
        houses[0] = new House(1,"jck","153532","��ˮ��",2000,"�ѳ���");

    }
    //add����������¶��󣬷���boolean
    public boolean add(House newHouse){

        //�ж��Ƿ񻹿��Լ������
        if (houseNums == houses.length){
            System.out.println("��Ӵﵽ���ޣ����������");
            return false;
        }
        //��newHouse������뵽��һ��������һ��������Ϣ
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    //findById���� ����House�����null
    public House findById(int findId){

        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

    //del���� ɾ��һ��������Ϣ
    public boolean del(int delId){
        //Ӧ�����ҵ�Ҫɾ���ķ�����Ϣ��Ӧ���±�
        //�±�ͷ��ݱ�Ų���һ����
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()){//Ҫɾ���ķ���id���������±�Ϊi��Ԫ��
                index = i;//ʹ��index��¼i
            }
        }
        if (index == -1){//˵��delId�������в�����
            return false;
        }

        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        //�ѵ�ǰ���ڵķ�����Ϣ�����һ�� ����null
        houses[--houseNums] = null;
        return true;
    }

    //list����������houses
    public House[] list(){
        return houses;
    }

}
