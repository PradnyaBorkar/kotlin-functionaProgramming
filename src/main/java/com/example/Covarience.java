package com.example;

import com.sun.org.apache.xpath.internal.operations.String;
import com.sun.tools.corba.se.idl.IncludeGen;

import java.util.ArrayList;
import java.util.List;

class Base{

    public void print(ArrayList<Object> list){
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public void contravarience(ArrayList<Integer> list){
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public void covariance(Object[] list){
        for (Object obj : list) {
            System.out.println(obj);
        }
    }


}

class Derived extends Base{ }

public class Covarience
{


    public void covariance(Base base){
        System.out.println(base);
    }

    public static void main(String[] args) {

        //Inheritence is Covarience
        Covarience c = new Covarience();
        c.covariance(new Base());
        c.covariance(new Derived());


        Base base = new Base();

        // Arrays are covariance : Covariance: accept subTypes
        Integer[] intArray =  new Integer[]{1,2,3,4};
        base.covariance(intArray);

        // Generics are contravariance : Contravariance: accept supertypes
        ArrayList<Number> list = new ArrayList();

        ArrayList<Integer> intList = new ArrayList<>();
        //list = intList;
        list.add(1);
        list.add(new Integer(2));
        //base.contravarience(list);


        //use super when u want to add value
        ArrayList<? super Number> intArr = new ArrayList<>();
        intArr.add(new A());
        intArr.add(new Integer(1));

        //use super when u want to add value
        ArrayList<? extends Number> intArr1 = new ArrayList<>();
        Number a = intArr1.get(0);

        //extends :  covarience, use for read

        List<? extends Base> shapes = new ArrayList<Derived>();

        List<? extends Number> nums = new ArrayList<Integer>();

        c.useExtends(new ArrayList<Derived>());

        //super : contravarience, use for write

        List<? super Derived> items = new ArrayList<Base>();
        List<? super Integer> item1 = new ArrayList<Number>();

        c.useSuper(new ArrayList<Base>());
        //List<Integer> item2 = new ArrayList<Number>();


        //use extends to fetch the data
        List<? extends Number> ints = new ArrayList<Integer>();
        //ints.add(new Integer(1)); not allowed
        Number n  = ints.get(0);


        List<? super Integer> num1= new ArrayList<Number>();
        num1.add(new Integer(1));
        //Integer s = num1.get(0); not allowed

        Object obj =  new java.lang.String("n");
        //List<Object> objList = new ArrayList<String>();

    }

    public void useSuper(List<? super Derived> items){
    }

    public void useExtends(List<? extends Base> items){

    }


}

class A extends  Number{

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}



