package com.company;

import java.io.*;
import java.util.Random;

public class yosiManiak {

    public static void main(String[] args) throws IOException {
        BufferedReader in = null;

        Random rnd = new Random();
        int bla = 0;
        try {
            in = new BufferedReader(new FileReader("yosi_maniak.txt"));

            int ramatManiakiyut = Integer.parseInt(in.readLine());

            for (int i = ramatManiakiyut; i > 0; i--) {
                bla = rnd.nextInt(100) + 1;
                System.out.println(bla);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
