package lesson5.homework;

import java.util.*;

public class StaffMap{
    private Set<String> nameSet = new HashSet<>();

    private NodeStaff head;
    private NodeStaff tail;
    public StaffMap() {

    }

    public StaffMap(List<Staff> staffList) {
        add(staffList);
    }

    public void add(Staff staff){
        if(this.contains(staff))
            this.incr(staff);
        else
            this.append(staff, 1);
    }

    public void add(List<Staff> staffList){
        for (int i = 0; i < staffList.size(); i++) {
            int count = 0;
            if (this.contains(staffList.get(i))) continue;
            for (int j = i; j < staffList.size(); j++)
                    if (staffList.get(j).getName().equals(staffList.get(i).getName()))
                        count++;
            this.append(staffList.get(i), count);
        }
    }

    public void print(){
        var cur = head;
        while(cur != null){
            System.out.println(cur);
            cur = cur.next;
        }
    }

    private void append(Staff staff, Integer count) {
        NodeStaff target = new NodeStaff(staff, count);
        if(nameSet.isEmpty()){
            head = target;
            tail = target;
            nameSet.add(target.getKey().getName());
            return;
        }
        NodeStaff cur = head;
        while (cur != null){
            if (cur.element > count) cur = cur.next;
            else{
                // Вставаить кодгда преедаваймая значение не меньше вставлем перед указателем
                insertPrevision(cur, target);
                nameSet.add(target.getKey().getName());
                return;
            }
        }
        // если все значение больше
        tail.next = target;
        target.prevision = tail;
        tail = target;
        nameSet.add(target.getKey().getName());
    }

    private void insertPrevision(NodeStaff cur, NodeStaff target) {
        target.next = cur;
        if (cur == head){
            head = target;
        }else {
            target.prevision = cur.prevision;
            cur.prevision.next = target;
        }
        cur.prevision = target;

    }

    private void incr(Staff staff) {
        var cur = head;
        while (cur != null){
            if(cur.equals(staff)){
                cur.element++;
            }
        }
    }


    private boolean contains(Staff staff) {
        if (nameSet.isEmpty()) return false;
        return nameSet.contains(staff.getName());
    }

}

class NodeStaff{
    private Staff key;
    Integer element;
    NodeStaff next;
    NodeStaff prevision;

    NodeStaff(){

    }

    NodeStaff(Staff key, Integer element){
        this.key = key;
        this.element = element;
    }

    NodeStaff(Staff key, Integer element, NodeStaff next, NodeStaff prevision) {
        this.key = key;
        this.element = element;
        this.next = next;
        this.prevision = prevision;
    }

    public Staff getKey() {
        return key;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Staff)
            return  ((Staff) obj).equals(this.key);
        else return false;
    }

    @Override
    public String toString() {
        return key.getName();
    }
}

