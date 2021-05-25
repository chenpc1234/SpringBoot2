package com.chen.admin.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/3/29/03/29  21:40
 */
public class Test {

    public static void main(String[] args) {
        String[] kuZis={"zz0.33","fj0.33","bj0.33","ew0.33","gj0.33","lz0.33"};
        String[] jieZhIs={"zz0.13","fj0.13","bj0.13","ew0.13","gj0.13","lz0.13"};
        String[] zuoCaos={"zz0.33","fj0.33","bj0.33","ew0.33","gj0.33","lz0.33"};
        String[] wuQis={"zz0.30","fj0.30","bj0.30","ew0.30","gj0.30","lz0.30"};
        String[] canX1s={"zz0.1","fj0.1","bj0.1","ew0.1","gj0.1","lz0.1"};
        String[] canX2s={"zz0.05","fj0.05","bj0.05","ew0.05","gj0.05","lz0.05"};
        String[]  add;
        Map<String,Double> newMap= new HashMap<String,Double>(6);
        Double finalXs = 0D;

        Map<String,Double> finalMap = new HashMap<String,Double>(6);
        String[] finalCs =null;
        int i=0;
        for (String kuZi : kuZis) {
            for (String jieZhi : jieZhIs) {
                for (String zuoCao : zuoCaos) {
                    for (String wuQi : wuQis) {
                        for (String canX1 : canX1s) {
                            for (String canX2 : canX2s) {
                                i++;
                                add = new String[]{kuZi, jieZhi,zuoCao,wuQi,canX1,canX2};
                                newMap=sum(add);
                                Double tempXs=Xs(newMap);
                                System.out.println(Arrays.toString(add)+"--"+newMap.toString()+"---"+tempXs);
                                if (tempXs>finalXs){
                                    finalXs =tempXs;
                                    finalMap=newMap;
                                    finalCs=add;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("i----------------"+i);
        System.out.println(finalXs);
        System.out.println(finalMap);
        System.out.println(Arrays.toString(finalCs));


    }
    public static Map sum(String[] add){
        Map<String,Double> newMap= new HashMap(6);
        newMap.put("zz",1.54);
        newMap.put("fj",1.813);
        newMap.put("bj",1.95);
        newMap.put("ew",1.503);
        newMap.put("gj",2.16);
        newMap.put("lz",1.75);

       /* newMap.put("zz",1.54);
        newMap.put("fj",1.913);
        newMap.put("bj",1.8);
        newMap.put("ew",1.523);
        newMap.put("gj",2.28);
        //--
        newMap.put("lz",1.74);*/



        //19 称号
      /*  newMap.put("bj",1.985);
        newMap.put("lz",1.68);*/
        //20 称号
      /*  newMap.put("gj",2.285);
        newMap.put("fj",1.917);*/

//        75.5517060752025
//        {zz=2.015, bj=2.035, ew=2.0, gj=2.165, fj=2.117, lz=2.01}
//[zz0.33, ew0.17, lz0.33, fj0.30, zz0.1, bj0.05]
      /*  75.1127974412725
        {zz=2.015, bj=2.105, ew=2.0, gj=2.285, fj=1.967, lz=1.97}
[zz0.33, ew0.17, lz0.33, bj0.30, zz0.1, fj0.05]*/


        String addType ;
        String addNumber;
        for (String s : add) {
            addType= s.substring(0, 2);
            addNumber=s.substring(2, s.length());
            double oldNum=newMap.get(addType);
            double newNum =oldNum+Double.parseDouble(addNumber);
            newMap.put(addType,newNum);
        }
        return newMap;
    }

    public static double Xs(Map<String,Double> map){
       return map.get("zz")*map.get("fj")*map.get("bj")*map.get("ew")*map.get("gj")*map.get("lz");
    }

}
