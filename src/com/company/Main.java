package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList();
        while(true) {
            String s = reader.readLine();
            if(s.isEmpty()) break;
            int x = Integer.parseInt(s); //   конвертация из строки в число
            if(x%2 == 0) {
                list.add(x); // добавляем в конец списка
            } else
                list.add(0,x); // вставка на начало
        }
        for(Integer l: list) {
            System.out.print(l + " ");
        }
        // удаление из списка всех чисел > 5
        for(int i=0; i<list.size();) {
            if(list.get(i)>5) {
                list.remove(i); // не увеличиваем i, если удалили текущий элемент
            } else {
                i++;
            }
        }
        System.out.println();
        for(Integer l: list) {
            System.out.print(l + " ");
        }

    }
}
