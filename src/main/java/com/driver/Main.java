package com.driver;

public class Main {

    public static class A{
        public String haris(){
            return "invoke method from class a ";
        }

    }
    public static class B extends A{

        public String haris() {
            return "method is overridingin extended class b";
        }
    }
    public static void main (String args[]){
        B obj = new B();
        obj.haris();
    }
}