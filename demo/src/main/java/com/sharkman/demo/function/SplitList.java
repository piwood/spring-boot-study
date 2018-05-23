package com.sharkman.demo.function;

import java.util.List;

import org.springframework.util.CollectionUtils;

public class SplitList {
    
    public SplitList(List<?> list,Operationer oprationer) {
        super();
        this.oprationer = oprationer;
        this.list = list;
        this.groupCount = 100;
    }

    public SplitList(List<?> list, int groupCount,Operationer oprationer) {
        super();
        this.oprationer = oprationer;
        this.list = list;
        this.groupCount = groupCount;
    }

    private List<?> list;
    private Operationer oprationer;
    private int groupCount;
    
    public void splitList() {
        if (CollectionUtils.isEmpty(list)) {
//            return Collections.emptyList();
            return;
        }
        int size = list.size();
        int times = (size + groupCount - 1) / groupCount;
        int i = 0;
        for (; i < times-1; i++) {
            oprationer.operation(list.subList(i * groupCount, (i + 1) * groupCount));
        }
        oprationer.operation(list.subList(i * groupCount, size));
    }
    
}
