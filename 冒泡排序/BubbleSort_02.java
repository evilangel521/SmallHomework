package 冒泡排序;
//将几个无序数字使用冒泡排序法将其排成一个 从小到大 的有序数列。
public class BubbleSort_02 {
    public static void main(String[] args) {
        int[] arr = {12,45,65,-5,88,66,-15};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++ ) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //想要从大到小就把 > 换成 <
                if (arr[j] > arr[j + 1]) { //前面这个数大，就往后排
                    temp = arr[j]; //把大的数先赋值给temp
                    arr[j] = arr[j + 1];  //把后面小的数（arr[j + 1]）往前移
                    arr[j + 1] = temp;   //temp变成原来arr[j + 1]的位置
                }
            }
            System.out.println("\n第"+ (i + 1) +"轮");
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[j] + " ");
        }
        }
    }
}
