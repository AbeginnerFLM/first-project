package Bag;

import java.util.Scanner;

public class addgoods {
    static public String[] add=new String[11];
    static public int pr[]=new int[11];
    static public int q;
    void addgood(){
        System.out.println("您选择的是添加商品功能");
        for ( q = 0; q <10; q++) {
            if (add[q] == null) {
                System.out.println("请输入你想添加的商品名称");
                Scanner sc = new Scanner(System.in);
                String ad = sc.next();
                add[q] = ad;
                System.out.println("价格为:");
                Scanner price = new Scanner(System.in);
                int pri = price.nextInt();
                pr[q] = pri;
                System.out.println("按0退出,按1继续");
                Scanner co = new Scanner(System.in);
                int con = co.nextInt();
                if (con == 1) {
                    continue;
                } else {
                    break;
                }
            }
            else {
                continue;
            }
        }
    }
}
