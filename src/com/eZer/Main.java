package com.eZer;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    Student student1 = new Student();
	    student1.name="Eshan";
	    student1.detail =BirthFactory.getDetail(1998,9);

        Student student2 = new Student();
        student2.name="Pasindu";
        student2.detail =BirthFactory.getDetail(1999,10);

        Student student3 = new Student();
        student3.name="Dilmina";
        student3.detail =BirthFactory.getDetail(2000,11);

        Student student4 = new Student();
        student4.name="Nelum";
        student4.detail =BirthFactory.getDetail(1998,9);

        student1.getBirthDetail();
        student2.getBirthDetail();
        student3.getBirthDetail();
        System.out.println(BirthFactory.list.size());
    }
}

class Student{
    public String name;
    BirthDetail detail;
    public void getBirthDetail(){
        System.out.println(name+" : Birth : "+ detail.year+" - "+detail.month);
    }
}

class BirthDetail{
    int year,month;
}
class BirthFactory{
    public static HashMap<String,BirthDetail> list = new HashMap<>();
    public static BirthDetail getDetail(int year,int month){
        BirthDetail detail =list.get(year+"-"+month);

        if(detail==null){
            detail = new BirthDetail();
            detail.month=month;
            detail.year=year;

            list.put(year+"-"+month,detail);
        }
        return detail;
    }
}
