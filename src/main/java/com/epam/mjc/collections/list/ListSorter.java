package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aValue = getValue(a);
        int bValue = getValue(b);

        if(aValue == bValue){
            return Integer.parseInt(a) - Integer.parseInt(b);
        }

        return getValue(a) - getValue(b);
    }

    private int getValue(String a){
        int i = Integer.parseInt(a);
        return 5 * i * i + 3;
    }
}
