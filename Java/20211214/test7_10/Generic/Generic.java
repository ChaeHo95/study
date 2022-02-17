package test7_10.Generic;

import java.util.Vector;

interface Stack<T>{
    T see(int i);
    T pop(int i);
    void push(T ob);
}
public class Generic<T> implements Stack<T>{

    Vector<T> ar = new Vector<T>();
    int count = 0;

    public void push(T ob){
        ar.add(ob);
        count++;
    }
    public T pop(int i){
        return ar.remove(i);
    }
    public int Tsize(){
        return ar.size();
    }
    public T see(int i){
       return ar.get(i);
    }
}
