package ð������;
//��������������ʹ��ð�����򷨽����ų�һ�� ��С���� ���������С�
public class BubbleSort_02 {
    public static void main(String[] args) {
        int[] arr = {12,45,65,-5,88,66,-15};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++ ) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //��Ҫ�Ӵ�С�Ͱ� > ���� <
                if (arr[j] > arr[j + 1]) { //ǰ��������󣬾�������
                    temp = arr[j]; //�Ѵ�����ȸ�ֵ��temp
                    arr[j] = arr[j + 1];  //�Ѻ���С������arr[j + 1]����ǰ��
                    arr[j + 1] = temp;   //temp���ԭ��arr[j + 1]��λ��
                }
            }
            System.out.println("\n��"+ (i + 1) +"��");
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[j] + " ");
        }
        }
    }
}
