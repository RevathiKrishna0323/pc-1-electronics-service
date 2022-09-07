package com.jap;

import java.util.ArrayList;
import java.util.List;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = new ArrayList<>();
        itemList.add("TV");
        itemList.add("Computer");
        itemList.add("Refrigerator");
        itemList.add("TV");
        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        List<String> list = new ArrayList<>();
        int index = itemList.indexOf("Refrigerator");
        if (index != -1) {
            System.out.println(index);
        }
        return index;
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        itemList.remove("Refrigerator");
        System.out.println(itemList);
        boolean flag = false;

        return flag;
    }


}