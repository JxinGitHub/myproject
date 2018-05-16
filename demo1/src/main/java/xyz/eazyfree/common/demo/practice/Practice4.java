package xyz.eazyfree.common.demo.practice;

import java.util.Scanner;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/3.7:56
 */
public class Practice4 {


    /**
     * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
     */

    public static void main(String[] args) {
        System.out.print("请输入一个你要分解的正整数：");

        Scanner scanner=new Scanner(System.in);

        int input=scanner.nextInt();//获取输入的数字

        System.out.println();

        System.out.print(input+"=");

        for (int i = 2; i < input+1; i++) {



            while(input%i==0&&input!=i) {

                input=input/i;

                System.out.print(i+"*");

            }

            if(input==i){//上面的都不能整除，说明这是一个质数

                System.out.print(i);

                break;

            }

        }

        scanner.close();

    }


    public static void getResult(int n) {

        // 1 判断是否质数
        // 2 否 获取最小分子
        // 3 是否是质数
        // 4 获取最小分子



    }


    /**
     * 获取一个数的最小分子
     */
    public int getInt(int i) {
        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i%j==0){
                return j;
            }
        }
        return i;
    }




}
