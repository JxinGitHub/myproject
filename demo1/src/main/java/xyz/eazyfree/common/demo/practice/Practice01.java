package xyz.eazyfree.common.demo.practice;

/**
 * Created by ZhaoZhi qiang
 * 2018/4/23.10:29
 */
public class Practice01 {


//     1 1 2 3 5 8 13 21 34


    //斐波那契数列
    public static void main(String[] args) {

        for (int i = 1; i <10 ; i++) {
            System.out.println(fn(i));
        }
    }

    //方式一

    /**
     * 获取斐波那契数列的第n项的值
     *  找规律得出 fn(n+2)= fn(n) + fn(n+1)
     * @param n
     * @return
     */
    public static void getValue(int n){


    }

    public static int fn(int n){
        if (n==1 || n==2){
            return 1;
        }else return fn(n-1)+fn(n-2);
    }




    //通项公式计算
    public static Double getFeobonaqie(int n){
        Double temp = Math.sqrt(5);

        Double a = (1+temp)/2;
        Double b = (1-temp)/2;

        Double result = (Math.pow(a,n)-Math.pow(b,n))/temp;

        return result;
    }


}
