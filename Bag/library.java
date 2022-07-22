package Bag;

import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        boolean iswork=true;
        while(iswork){
            System.out.println("=====================超市管理系统======================");
            System.out.println("1:货物清单   2:增加货物   3:删除货物   4:修改货物   5:退出");
            System.out.println("请输入你要操作的编号:");
            Scanner sc = new Scanner(System.in);
            int chosenum= sc.nextInt();
            if (chosenum == 5) {
                iswork=false;
            }
            if (chosenum==1){
                new lists().list();
                System.out.println("输入任意键返回");
                int a = sc.nextInt();
            }
            if (chosenum == 2) {
                new addgoods().addgood();
            }
            if (chosenum == 3) {
                new deletegoods().deletegood();
            }
        }
    }
}
