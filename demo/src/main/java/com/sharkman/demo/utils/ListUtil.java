package com.sharkman.demo.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.util.CollectionUtils;

/**
 * listUtil
 * @author piwood
 *
 */
public class ListUtil {
    public static <T> List<List<T>> splitList(List<T> list,int groupCount) {
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyList();
        }
        int size = list.size();
        int times = (size + groupCount - 1) / groupCount;
        int i = 0;
        List<List<T>> container = new ArrayList<>();
        for (; i < times-1; i++) {
            container.add(list.subList(i * groupCount, (i + 1) * groupCount));
        }
        container.add(list.subList(i * groupCount, size));
        return container;
    }
    
}
