package com.syntax.reviewclass7;

public class InstanceVarDemo {
   String name="Mahmut";
    public static void main(String[] args) {
        String name="Ali";

        System.out.println(name);
        InstanceVarDemo instanceVarDemo=new InstanceVarDemo();
        System.out.println(  instanceVarDemo.name);
        instanceVarDemo.name="Burju";
        System.out.println(instanceVarDemo.name);

    }
}
