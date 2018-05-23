package com.sharkman.demo.utils;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sharkman.demo.function.Operationer;
import com.sharkman.demo.function.SplitList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilsTest {
    @Test
    public void testListSplit () {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<List<Integer>> lists = ListUtil.splitList(list, 3);
        lists.forEach((inner)->{
            inner.forEach(System.out::print);
        });
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        new SplitList(list,3,new Operationer() {
            
                @Override
                public void operation(List<?> list) {
                    // TODO Auto-generated method stub
                    System.out.println("wori");
                }
            }
        ).splitList();
        
        new SplitList(list,3,(lt) -> {
            System.out.println("wori");
        }
        ).splitList();
    }
    
}
