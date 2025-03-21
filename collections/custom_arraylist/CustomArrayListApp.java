package collections.custom_arraylist;

public class CustomArrayListApp {
    public static void main(String [] args) {
        CustomArrayList <Object> list = new CustomArrayList<>();

        //Add elememts in Custom Arraylist
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Nikhil");
        list.add(2.5);
        list.add("Nitin");

        //Display all elements in Custom ArrayList
        list.display();

        //Display specific element in Custom Arraylist
//        System.out.println("\nDisplaying element at index " + 1 + " is : " + list.get(1));

        //Remove specific element in Custom Arraylist
//        System.out.println("Element removed from index " + 1 + " is : " + list.remove(1));

        System.out.println("\nRemoved Element : " + list.removeByObj(20));
//        System.out.println("Removed Element : " + list.remove(1));

        list.display();
    }
}