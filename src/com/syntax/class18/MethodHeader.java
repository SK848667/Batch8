package com.syntax.class18;

public class MethodHeader {
    /*
Replace all instances of given character with a "*" within the given String.
Examples:
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */
    String censorLetter(String str, char c) {

        str=str.replace(c,'*');
        return str;
    }
    public static void main(String[] args){

        MethodHeader obj=new MethodHeader();
        System.out.println(obj.censorLetter("computer science",'e')); //“comput*r sci*nc*”
        System.out.println(obj.censorLetter("trick or treat",'t')); //“*rick or *rea*”

    }

}

