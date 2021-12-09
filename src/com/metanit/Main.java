package com.metanit;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Pet doggy=new Dog("Thomas",1);
        Pet kitten=new Cat("Jack",2);
        Pet owly=new Owl("Mikckey",3);
        HashMap<String,Pet> pets = new HashMap<>();
        pets.put("a",doggy);
        pets.put("b",kitten);
        pets.put("c",owly);
        System.out.println(pets.toString());
        System.out.println(pets.get("b").toString());
        Dog doggy1=new Dog("Artur jr.",4);
        Cat kitten1=new Cat("John jr.",5);
        pets.put("d",doggy1);
        pets.put("b",kitten1);
        System.out.println(pets.toString());
        int[] mas=new int[10];
        for(int i=0;i<10;i++) {
            int a = (int) (Math.random()*(200+1)) ;;
            mas[i]=a;
            System.out.println(mas[i]);
        }
        int count=0;
        for(int q=0;q< mas.length;q++) {
            for(int y=0;y<mas.length;y++) {
                if(mas[q]==mas[y]){
                    count=count++;
                }
            }
        }
        System.out.println("количество = "+count);
    }
}