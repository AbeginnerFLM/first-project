package Bag;

import static Bag.addgoods.*;
import static Bag.deletegoods.newadd;
import static Bag.deletegoods.newpr;

public class lists {
    public void list(){

        System.out.println("===================商品清单==================");
        System.out.println("商品编号\t商品单价\t商品名称");
        for (int i = 0; i <=q; i++) {
            System.out.print(i+1+ "        ");
            newpr[i]=pr[i];
            System.out.print(pr[i]+"     ");
            newadd[i]=add[i];
            System.out.println(newadd[i]);
        }
    }

}
