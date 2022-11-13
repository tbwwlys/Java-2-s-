package Array_;

import java.util.Scanner;

/*
* */
public class ArrayMiddleInsert {
    public static void main(String[] args) {
        //数组读取元素
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        //更新元素  newIndex 选择更新的数组元素下标 newElement 更新的值
        Scanner scanner = new Scanner(System.in);
        //手动输入元素下标
        int newIndex = scanner.nextInt();
        //手动输入值
        int newElement = scanner.nextInt();
        array[newIndex] = newElement;
        //输出更改后的数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
