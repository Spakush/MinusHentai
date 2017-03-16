package com.company;

import java.io.*;
import java.util.*;

/**
 * Created by veron on 14-Mar-17.
 */
public class triggered {

    public static void main(String[] args) {
        String str = getFileContent(args[1]);
        System.out.println(isOk(str));
    }

    public static String getFileContent(String fileName){
        BufferedReader in = null;
        String data = "";

        try {
            in = new BufferedReader(new FileReader(fileName));

            data = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;

    }

    public static boolean isOk (String str) {
        Stack<Character> c = new Stack<Character>();
        Queue<Character> q = new LinkedList<Character>();

        for (int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(')
                c.push(str.charAt(i));
            if (str.charAt(i) == ']' || str.charAt(i) == '}' || str.charAt(i) == ')')
                q.add(str.charAt(i));
        }
        System.out.println(c);
        System.out.println(q);
        while (!c.empty() && !q.isEmpty()){
            char sogerS = c.peek();
            char sogerY = q.peek();
            if (sogerS == '[' && sogerY == ']' || sogerS == '{' && sogerY == '}' || sogerS == '(' && sogerY == ')'){
                c.pop();
                q.remove();
            }
            else return false;
        }
        System.out.println(c);
        System.out.println(q);
        return (c.empty() && q.isEmpty());

    }
}
