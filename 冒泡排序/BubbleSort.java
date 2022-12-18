package 冒泡排序;
//将几个无序数字使用冒泡排序法将其排成一个 从小到大 的有序数列。
// 基础篇（麻烦）
//需要进行arr.length - 1次排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,45,65,-5,88};
        int temp = 0;
        for (int i = 0; i < 4; i++){ //4 == arr.length - 1
            if (arr[i] > arr[i + 1]){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第一次排序");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < 3; i++){ //5 == arr.length - 1
            if (arr[i] > arr[i + 1]){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("\n第二次排序");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < 2; i++){ //5 == arr.length - 1
            if (arr[i] > arr[i + 1]){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("\n第三次排序");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < 1; i++){ //5 == arr.length - 1
            if (arr[i] > arr[i + 1]){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("\n第四次排序");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
