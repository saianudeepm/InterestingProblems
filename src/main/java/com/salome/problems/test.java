package com.salome.problems;

import javax.xml.transform.stream.StreamSource;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 5/8/14
 * Time: 3:22 PM
 */
public class test {


    public static void main(String arg[]){
       IteratorTesting obj1 = new IteratorTesting(12);
       IteratorTesting obj2 = new IteratorTesting(12);

        HashMap<IteratorTesting,String> h= new HashMap<IteratorTesting, String>();
        h.put(obj1,"obj1");
        h.put(obj2,"obj2");
        System.out.println(obj1.hashCode() + " ---" + obj2.hashCode());
        System.out.println(h.size());
    }
}
