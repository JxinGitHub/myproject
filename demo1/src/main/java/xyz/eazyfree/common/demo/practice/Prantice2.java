package xyz.eazyfree.common.demo.practice;

/**
 * Created by ZhaoZhi qiang
 * 2018/4/25.19:29
 */
public class Prantice2 {

//    题目：判断101-200之间有多少个素数，并输出所有素数。


    /**
     * 考虑 素数只能被1 和 自身整除
     * @param args
     */
    public static void main(String[] args) {
        getResult();
    }


    public static void getResult2(){
        int count = 0 ;
        for (int i =101; i < 200 ; i++) {
            if (isRight(i)){
                System.out.println(i);
                count++;
            }

        }
        System.out.println(count);
    }

    private static boolean isRight(int i) {

        for (int j = 2; j < Math.sqrt(i); j++) {
            if(i % j ==0){
                return false;
            }

        }
        return true;
    }


    public static void getResult(){
        int j;
        for (int i = 101; i <= 200; i++) { // 1不是素数，所以直接从2开始循环
            j = 2;
            while (i % j != 0) {
                j++; // 测试2至i的数字是否能被i整除，如不能就自加
            }
            if (j == i) { // 当有被整除的数字时，判断它是不是自身
                System.out.println(i); // 如果是就打印出数字
            }
        }
    }


}





