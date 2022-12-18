package 面向对象中级部分.房屋出租系统;

public class HouseService {

    private House[] houses;//保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值


    public HouseService(int size){

        houses = new House[size];//当创建HouseService对象，指定数组大小
        //初始化一个House对象
        houses[0] = new House(1,"jck","153532","金水区",2000,"已出租");

    }
    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse){

        //判断是否还可以继续添加
        if (houseNums == houses.length){
            System.out.println("添加达到上限，不能再添加");
            return false;
        }
        //把newHouse对象加入到下一个，新增一个房屋信息
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    //findById方法 返回House对象或null
    public House findById(int findId){

        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

    //del方法 删除一个房屋信息
    public boolean del(int delId){
        //应当先找到要删除的房屋信息对应的下标
        //下标和房屋编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()){//要删除的房屋id，是数组下标为i的元素
                index = i;//使用index记录i
            }
        }
        if (index == -1){//说明delId在数组中不存在
            return false;
        }

        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        //把当前存在的房屋信息的最后一个 设置null
        houses[--houseNums] = null;
        return true;
    }

    //list方法，返回houses
    public House[] list(){
        return houses;
    }

}
