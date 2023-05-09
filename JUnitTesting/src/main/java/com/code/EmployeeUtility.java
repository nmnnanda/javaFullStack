package com.code;

import java.util.Collections;
import java.util.List;

public class EmployeeUtility {
    public String[] getSortedName(List<Employee> list){
    	String[] sortedName = new String[list.size()];
    	Collections.sort(list);
    	
    	for(int i=0;i<list.size();i++){
    		sortedName[i] = list.get(i).getName();
    	}
    	return sortedName;
    }
}
