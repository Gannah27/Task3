package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        int size;
        int count =0;
        String line;
        Scanner s1=new Scanner(System.in);
        size=s1.nextInt();
        int [] numArray=  new int[size];
        for(int i=0;i<size;i++){
            numArray[i]=s1.nextInt();
        }
        Arrays.sort(numArray);
        for(int i=0;i<size;i++){
            System.out.println(numArray[i]);
        }
        ArrayList<Person> perArray= new ArrayList<>();
        line=s1.nextLine();
        while(line.compareTo("0")!=0){
            StringTokenizer st=new StringTokenizer(line,",");
                perArray.add(new Person());
                perArray.get(count).setName(st.nextToken());
                perArray.get(count).setAge(Integer.valueOf(st.nextToken()));

            count++;
            line=s1.nextLine();
        }
        for(Person p : perArray){
            System.out.println("Name is"+" "+p.getName()+" Age is "+ p.getAge());
        }

    }
}
