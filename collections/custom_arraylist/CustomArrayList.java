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


class CustomArraylistApp {
    public static void main(String... a) {
        CustomArrayList <Integer> list = new CustomArrayList<>();

        //Add elememts in Custom Arraylist
        list.add(10);
        list.add(20);
        list.add("Nikhil");
        list.add(2.5f);
        list.add(2000L);
        list.add('A');


        //Display all elements in Custom ArrayList
        list.display();

        //Display specific element in Custom Arraylist
        System.out.println("\nDisplaying element at index " + 1 + " is : " + list.get(1));

        //Remove specific element in Custom Arraylist
        System.out.println("Element removed from index " + 1 + " is : " + list.remove(1));

        list.display();

    }
}
