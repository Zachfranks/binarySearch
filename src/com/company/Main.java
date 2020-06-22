package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random rng = new Random();

        ArrayList<Integer> data = new ArrayList<Integer>();

        for (int i =0; i < 250; ++i){
            data.add(rng.nextInt(999 + 1));
        }
        Collections.sort(data);

        int numPick = rng.nextInt(999+1);
    }

    public static boolean search(Integer numPick, ArrayList<Integer> data){
        if (data.size() == 0){
            return false;
        }else if (data.size() == 1){
            return data.get(0)== numPick;
        }else {
            int middle = data.size()/2;
            if (data.get(middle) > numPick){

               ArrayList<Integer> tail = new ArrayList<Integer>();
               for (int i=middle; i < data.size();++i){
                   tail.add(data.get(i));

               }

               return search(numPick , tail);


            }else {

                ArrayList<Integer> tail = new ArrayList<Integer>();
                for (int i=0; i < middle;++i){
                    tail.add(data.get(i));

                }

                return search(numPick , tail);

            }
        }
    }

}
