package cn.lixing.worker.Test.uilts;

import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateUilts {
	public static List<String> removeDuplicate(List<String> list) {   
	    HashSet<String> h = new HashSet<String>(list);   
	    list.clear();   
	    list.addAll(h);   
	    return list;   
	}
}
