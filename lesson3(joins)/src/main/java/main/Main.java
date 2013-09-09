package main;

import joins.InnerJoin;
import joins.LeftJoin;
import joins.Merge;
import joins.OuterJoin;

public class Main {

    public static void main(String[] args) {
        //#1
        int [] arrayMerge1  = {1,5,4,23,65,32,78};
        int [] arrayMerge2 = {3,5,24,54,1,2,34,45,32};
        int [] resultMerge = Merge.getMerge(arrayMerge1, arrayMerge2);
        System.out.println("MERGE:");
        print(arrayMerge1);
        print(arrayMerge2);
        System.out.println("MERGE Result: \n");
        print(resultMerge);
        //#2
        int [] arrayInnerJoin1  = {1,5,4,23,65,32,78};
        int [] arrayInnerJoin2 = {3,5,24,4,1,2,34,45,32,5};
        int [] resultInnerJoin = InnerJoin.getInnerJoin(arrayInnerJoin1, arrayInnerJoin2);
        System.out.println("INNER JOIN:");
        print(arrayInnerJoin1);
        print(arrayInnerJoin2);
        System.out.println("INNER JOIN Result: \n");
        print(resultInnerJoin);
        //#3
        int [] arrayLeftJoin1  = {1,5,4,23,65,32,78};
        int [] arrayLeftJoin2 = {3,5,24,4,1,2,34,45,32,5};
        int [] resultLeftJoin = LeftJoin.getLeftJoin(arrayLeftJoin1, arrayLeftJoin2);
        System.out.println("LEFT JOIN:");
        print(arrayLeftJoin1);
        print(arrayLeftJoin2);
        System.out.println("LEFT JOIN Result: \n");
        print(resultLeftJoin);
        //#4
        int [] arrayOuterJoin1  = {1,5,4,23,65,32,78};
        int [] arrayOuterJoin2 = {3,5,24,4,1,2,34,45,32,5};
        int [] resultOuterJoin = OuterJoin.getOuterJoin(arrayOuterJoin1, arrayOuterJoin2);
        System.out.println("OUTER JOIN:");
        print(arrayOuterJoin1);
        print(arrayOuterJoin2);
        System.out.println("OUTER JOIN Result: \n");
        print(resultOuterJoin);

    }
    public static void print(int [] array){
        System.out.print("[ ");
        for(int currentValue: array){
            System.out.print(currentValue + " ");
        }
        System.out.println("] \n");
    }
}
