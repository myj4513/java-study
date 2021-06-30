package chap11.practice32;

import java.util.*;

public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("친구", "이자바", "010-1111-2222");
        addPhoneNo("친구", "김자바", "010-222-2222");
        addPhoneNo("친구", "김자바", "010-1234-1234");
        addPhoneNo("회사", "김대리", "010-3333-3333");
        addPhoneNo("회사", "김대리", "010-4444-4444");
        addPhoneNo("회사", "박과장", "010-5555-5555");
        addPhoneNo("회사", "이과장", "010-6666-6666");
        addPhoneNo("세탁", "010-777-7777");
        addPhoneNo("문예준", "010-4513-6051");

        printList();
    }

    static void addPhoneNo(String groupName, String name, String tel){
        addGroup(groupName);
        HashMap group = (HashMap)phoneBook.get(groupName);
        group.put(tel, name);
    }

    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName)){
            phoneBook.put(groupName, new HashMap());
        }
    }

    static void addPhoneNo(String name, String tel){
        addPhoneNo("기타", name, tel);
    }

    static void printList(){
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();

            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * "+e.getKey() + "["+subSet.size()+"]");

            while(subIt.hasNext()){
                Map.Entry subE = (Map.Entry)subIt.next();
                String tel = (String)subE.getKey();
                String name = (String)subE.getValue();
                System.out.println(name + " " + tel);
            }
            System.out.println();
        }
    }
}
