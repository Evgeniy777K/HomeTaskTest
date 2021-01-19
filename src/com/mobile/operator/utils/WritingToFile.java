package com.mobile.operator.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WritingToFile {
    static String file = "data/out.txt";

    //Write Object in file
    public static void writeToFile(List<String> tariffFromClient) throws IOException {
        try {
            PrintWriter p = new PrintWriter(file);
            p.write(tariffFromClient.toString());
            p.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
