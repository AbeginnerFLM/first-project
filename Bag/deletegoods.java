package Bag;

import java.util.ArrayList;
import java.util.Scanner;
import static Bag.addgoods.pr;

import static Bag.addgoods.add;

public class deletegoods {
    static String[] newadd=new String[11];
    private int del=0;
    static int [] newpr=new int[11];

    void deletegood(){
        System.out.println("你选择的是删除功能");
        System.out.print("请输入你要删除的商品的编号:");
        Scanner de=new Scanner(System.in);
        int delete=de.nextInt();
        for ( int d = 0; d <10; d++) {
            if(d<delete-1){
                newadd[d]=add[d];
                newpr[d]=pr[d];
            } else if (d==delete-1) {
                continue;
            }else {
                newadd[d-1]=add[d];
                newpr[d-1]=pr[d];
            }
        }
        for (int i = 0; i < 10; i++) {
            add[i]=newadd[i];
            pr[i]=newpr[i];
        }
        System.out.println("删除成功!");

    }

}
