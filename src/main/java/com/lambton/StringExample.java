package com.lambton;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {

        String s[];
        s = new String[10];

        s[0]= "Canada";
        s[1] = "India";
        s[2] = "Nepal";
        s[3] = "Toronto";
        s[4] = "New York";
        s[5] = "Patel";
        s[6] = "Ramadeep Singh";
        s[7] = "Inshant";
        s[8] = "Scarborough";
        s[9] = "Noth York";

//        for(int index=0;index< s.length; index++){
//            System.out.println(s[index]);
//        }

        StringExample obj = new StringExample();
//        System.out.println(obj.reverseString2("ramass"));
//        System.out.println(obj.reverseString3("Canada"));
//        System.out.println(obj.reverseString3("India"));

        for(String vals: s){
            System.out.println(vals + "<->" + obj.reverseString2(vals) + "<-->"+ obj.reverseString3(vals));
        }

    }

    public String replaceString(int index, char val,String s){
        return s.substring(0,index)+ val + s.substring(index+1,s.length());
    }


    public String reverseString2(String val){

        for(int i=val.length()-1,j=0;j<val.length()/2;i--,j++){
            char temp1 = val.charAt(i);
            char temp2 = val.charAt(j);
            val = replaceString(i,temp2,val);
            val = replaceString(j,temp1,val);
        }
        return val;
    }



    public String reverseString3(String val){
        char cc = 'a';
        if(val.length()%2!=0) {
            cc = val.charAt(val.length()-1);
        }

        for(int i=0; (i<val.length()-2 && val.length()%2!=0) || (i<val.length()-1 && val.length()%2==0);i+=2){
            char temp1 = val.charAt(i);
            char temp2 = val.charAt(i+1);
            val = replaceString(i,temp2,val);
            val = replaceString(i+1,temp1,val);

        }
        if(val.length()%2!=0){
            val = val.substring(0,val.length()/2) + cc + val.substring(val.length()/2);
            val = val.substring(0,val.length()-1);
        }

        return val;

    }

}
