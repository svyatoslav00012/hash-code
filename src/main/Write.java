package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public  class Write {
    public static void writeData(LinkedList<LinkedList<Integer>> listData) {
        try {
            FileWriter fileWriter = new FileWriter("G:\\Hashcode\\output.txt", false);
            for(LinkedList<Integer> resultList: listData){
                for(int number: resultList){
                    fileWriter.write(number+" ");
                }
                fileWriter.append('\n');
            }
            fileWriter.flush();
        } catch (IOException e) {

        }
    }
}
