package com.salome.problems;

/**
 * Created by saimachavarapu on 3/3/14.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

/** A reference to a file. */
public class TextFile implements Iterable<String>
{
    Scanner scanner;
    BufferedReader br;
    public TextFile(String fileName)throws FileNotFoundException { // please implement this

        br = new BufferedReader(new FileReader(fileName));
        scanner = new Scanner(br);


    }

    @Override
    public Iterator<String> iterator() { // please implement this

        return new TextIterator();

    }
    //inner class
    public class TextIterator implements Iterator{
        @Override
        public boolean hasNext(){
            if(scanner. hasNextLine())
                return true;
            else
                return false;
        }


        @Override
        public Object next() {

            if (scanner.hasNextLine())
                    return scanner.nextLine();
            else
            {
                scanner.close();
                return null;
            }
        }

        @Override
        public void remove(){
            //not implemented
        }

    }



}