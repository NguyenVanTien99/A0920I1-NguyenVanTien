package dsa_list.exercises.ArrayList;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        if(capacity < 0){
            throw new IndexOutOfBoundsException("Capacity" + capacity);
        }else{
            elements = new Object[capacity];
        }

    }

    public int size(){
        return this.size;
   }

    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length ; i++) {
            elements[i] = null;
        }
    }


    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(3);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IndexOutOfBoundsException("minCapacity" + minCapacity);
        }
    }

    public void add(E element, int index){
        if(index > elements.length){
            throw new IndexOutOfBoundsException("index" + index);

        }else if(elements.length == size) {
            ensureCapacity(5);
        }

        if(elements[index] == null){
            elements[index] = element;
        }else {
            for(int i = size + 1; i >= index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size ++;
        }
    }

    public E get(int i){
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException("index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public int indexOf(E element){
        for(int i = 0; i < elements.length; i ++){
            if(element.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E element){
        if(indexOf(element) > 0){
            return true;
        }
        return false;
    }

    public MyList<E> clone(){
        MyList<E> arr = new MyList<>();
        arr.elements = Arrays.copyOf(elements,size);
        arr.size = this.size;
        return arr;
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Error index" + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }


}
