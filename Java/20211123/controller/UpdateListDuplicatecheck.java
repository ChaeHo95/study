package controller;

import java.util.*;

public class UpdateListDuplicatecheck {

    public int[] duplicatecheck(int[] temp){
        
    Set<Integer> set = new HashSet<Integer>();
    for(int i=0; i<temp.length; i++){
        set.add(temp[i]);
    }
    ArrayList<Integer> list = new ArrayList<>(set); // ser => Ararrtlist

    Collections.sort(list); // 정렬
    
    int[] finish = new int[list.size()];

    for(int i =0; i<list.size(); i++){
        finish[i]   = list.get(i);
    }
    
    return finish;
}

}
// Set 객체의 toArray() 메소드를 이용하면, Set 객체를 배열로 변환할 수 있음.
// 파라미터로는, 변환될 배열 객체를 넘겨주면 되는데,
// 이때 배열의 크기를 0으로 지정하면 자동으로 배열의 크기가 지정됨.

// 출처: 
// https://hianna.tistory.com/616 set => 배열
// https://ejyoo.tistory.com/81  set 특징
// http://www.tcpschool.com/java/java_collectionFramework_set set특징
// https://coding-factory.tistory.com/549  배열(Array)
// 