package collections.custom_arraylist;

import java.util.Arrays;

public class CustomArrayList<O> {

    private int size = 0;
    private Object arr [] = {};
    private static final int INITIAL_CAPACITY = 10;


    //Constructor
    public CustomArrayList() {
        arr = new Object[INITIAL_CAPACITY];
    }

    //Add Method
    public void add(Object e){
        if(size == arr.length){
            ensureCapacity();
        }
        arr[size++] = e;
    }

    //Get Method
    public Object get(int index){
        if(index < 0 || index >= arr.length){
            throw new IndexOutOfBoundsException("Index : " + index + ",Size : " + index);
        }
        return (Object) arr[index];
    }

    //remove Method
    public Object remove(int index){
        if(index < 0 || index >= arr.length){
            throw new IndexOutOfBoundsException("Index : " + index + ",Size : " + index);
        }
        Object removedElement = arr[index];

        for(int i = index; i <= size-1; i++){
            arr[i] = arr[i + 1];
        }
        size --;
        return removedElement;
    }

    public Object removeByObj(Object o){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == o){
                remove(i);
            }
        }
        return o;
    }

    //Ensure Capacity Method
    private void ensureCapacity(){
        int newCapacity = arr.length * 2;
        arr = Arrays.copyOf(arr, newCapacity);
    }

    //Display Method
    public void display(){
        System.out.print("Displaying List : ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}