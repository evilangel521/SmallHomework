package ð������;
//��������������ʹ��ð�����򷨽����ų�һ�� ��С���� ���������С�
// ����ƪ���鷳��
//��Ҫ����arr.length - 1������
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
        System.out.println("��һ������");
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
        System.out.println("\n�ڶ�������");
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
        System.out.println("\n����������");
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
        System.out.println("\n���Ĵ�����");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
