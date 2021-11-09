package com.test5;

import java.util.Arrays;

public class MyArrayList<T> {

    T data;

    Object[] elements = new Object[16];

    int size=0;

    public void add(T element){
        ensureCapicity();
        elements[size++] = element;
    }

    public void remove(int index) throws Exception{
        if(index <0 || index > size){
            throw new Exception("Operartion is not supported");
        }


    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    private void ensureCapicity() {
        if (size > elements.length -2  ){
            Arrays.copyOf(elements,  elements.length*2);
        }
    }

    public int getSize() {
        return size;
    }
}
