package com.lwl.arknight.common.utils;

import java.util.ArrayList;
import java.util.List;

public class Randoms {
    static List<Integer> mBaseList = null;
    //从[minVal, topVal]范围中选出cnt个不重复的数据
    public static List<Integer> genUniqueRandomVal(int minVal, int topVal, int cnt){
        int index;
        int size = topVal-minVal+1;
        if (minVal >= topVal){
            return null;
        }

        if (cnt>size){
            return null;
        }

        if (null == mBaseList){
            mBaseList = new ArrayList<Integer>();
        }

        //初始化基本数据集合
        mBaseList.clear();
        for (int i = minVal; i <= topVal; i++){
            mBaseList.add(i);
        }

        List<Integer> uniqueValList = new ArrayList<Integer>();//无重复的数据集合
        java.util.Random random = new java.util.Random();
        for (; cnt > 0;){
            index = random.nextInt(size);//范围[0, size)
            uniqueValList.add(mBaseList.get(index));//添加到数据集合
            mBaseList.remove(index);//基本数据集合移除已经加到uniqueValList的数据，这样子就不会重复
            cnt--;
            size--;
        }
        return uniqueValList;
    }

    //从[minVal, topVal]范围中选出cnt个不重复的数据 并且提前排除传入的数组中的数据
    public static List<Integer> genUniqueRandomVal(int minVal, int topVal, int cnt,List<Integer> list){
        int index;
        int size = topVal-minVal+1;
        if (minVal >= topVal){
            return null;
        }

        if (cnt>size){
            return null;
        }

        if (null == mBaseList){
            mBaseList = new ArrayList<Integer>();
        }

        //初始化基本数据集合
        mBaseList.clear();
        for (int i = minVal; i <= topVal; i++){
            mBaseList.add(i);
        }

        //排除传入的数据
        for (int i=0;i<list.size();i++){
            mBaseList.remove(list.get(i));
            size--;
        }

        List<Integer> uniqueValList = new ArrayList<Integer>();//无重复的数据集合
        java.util.Random random = new java.util.Random();
        for (; cnt > 0;){
            index = random.nextInt(size);//范围[0, size)
            uniqueValList.add(mBaseList.get(index));//添加到数据集合
            mBaseList.remove(index);//基本数据集合移除已经加到uniqueValList的数据，这样子就不会重复
            cnt--;
            size--;
        }
        return uniqueValList;
    }
}
