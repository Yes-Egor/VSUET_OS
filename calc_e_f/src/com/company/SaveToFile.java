package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveToFile {
    private String fileName;
    private String filePath;


    public SaveToFile(String path, String fileName) {
        if (path == null || path.trim().isEmpty()) { // Проверяем, что путь не пустой
            this.filePath = fileName;
        } else {
            try {
                this.filePath = path + "/" + fileName;
            } catch (Exception e) { // Если путь некорректен, то сохраняем в корневую папку проекта
                this.filePath = fileName;
            }
        }
    }

    public void save(ArrayList<String> arrayList) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String element : arrayList) {
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("ArrayList успешно сохранен в файл " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении ArrayList в файл " + filePath);
            e.printStackTrace();
        }
    }
}
