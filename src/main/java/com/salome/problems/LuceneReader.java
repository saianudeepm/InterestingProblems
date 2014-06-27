package com.salome.problems;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.store.FSDirectory;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 4/30/14
 * Time: 10:10 AM
 */
public class LuceneReader {
    IndexReader reader;

    LuceneReader(){

        File indexDirectory = new File("/Users/saimachavarapu/development/dotCMS/dotCMS_app/trunk_1.9.3/dotCMS/dotsecure/dotlucene/20130806024417");
        try{
            reader = IndexReader.open(FSDirectory.open(indexDirectory));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        LuceneReader obj = new LuceneReader();
        int count = obj.reader.maxDoc();

        for (int i=0;i<count;i++){
            try {
                Document tempdoc = obj.reader.document(i);
                System.out.print(tempdoc);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
