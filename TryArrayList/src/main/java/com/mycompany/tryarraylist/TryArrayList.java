package com.mycompany.tryarraylist;

import java.util.ArrayList;
import java .util.Scanner;
public class TryArrayList {

    
    public static void main(String[] args) {
        String mat="Matinisa";
        Scanner cbd =new Scanner(System.in);
       
        ArrayList<String>cars=new ArrayList<>();
     
        cars.add("Amarok 4-Motion");
        cars.add("BMW M2");
        cars.add("Audi RS Q8");
        cars.add("Cupra Leon Sport");
        cars.add("Polo vivo");
        cars.add("BMW M4");
        
        System.out.println("Please eneter ur name");
        String name=cbd.nextLine();
        
        if(name.equalsIgnoreCase(mat)){
            cars.remove("Polo vivo");
        System.out.println("Your future cars are: "+" "+cars);
        }
        else if(!name.equalsIgnoreCase(mat)){
       cars.remove("Audi RS Q8");
       cars.remove("Amarok 4-Motion");
       cars.remove("Cupra Leon Sport");
       cars.remove("BMW M2");
            System.out.println("Unfortunately we can't predict ur future, MAYBE A:"+" "+ cars+" "+"suits you");
        }
    }
}
