package de.ingoreschke;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FReader {
    private final String filename;

    public FReader(String filename){
        this.filename = filename;
    }
    List<String> readFile() {
        Thread thread = Thread.currentThread();
        ClassLoader contextClassLoader = thread.getContextClassLoader();
        InputStream in = contextClassLoader.getResourceAsStream(filename);
        Scanner scanner = new Scanner(in);
        ArrayList<String> list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }
        return list;
    }
}