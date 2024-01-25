package _05_class._09_generic;

import java.util.ArrayList;

// 제네릭 클래스
class CustomListGeneric<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "CustomListGeneric = " + list;
    }
}
public class GenericEx {
    public static void main(String[] args) {
        CustomListGeneric<Integer> genericList = new CustomListGeneric<>();
        genericList.addElement(1);
        genericList.addElement(3);
        genericList.addElement(6);
        System.out.println(genericList.toString());

        Integer el = genericList.get(1);

        CustomListGeneric<Character> genericList2 = new CustomListGeneric<>();
        genericList2.addElement('A');
        genericList2.addElement('B');
        System.out.println(genericList2.toString());
    }
}
