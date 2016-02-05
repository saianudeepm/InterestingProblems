package com.salome.cracking.arraysandstrings;

/**
 * Created by saianudeepm on 8/18/15.
 */
public class CompressString {

    public static String compress(String s){
        if(s.length()==0){
            return "";
        }
        
        StringBuilder sb= new StringBuilder("");
        int counter=0;
        char currentChar=s.charAt(0);
        
        for(int i=0;i<s.length();i++){
            if(i==0){
                sb.append(currentChar);
            } 
            if(currentChar!=s.charAt(i)){
                sb.append(counter);
                currentChar=s.charAt(i);
                sb.append(currentChar);
                counter=0;
            }
            counter++;
        }
        sb.append(counter);
        return (sb.length()<s.length() ?sb.toString():s);
    }
    
    public static void main(String args[]){

        System.out.println(compress("777777788888tttuyuuyuyyiuiu"));
    }
    
}

