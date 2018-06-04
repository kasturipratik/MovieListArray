package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String movieTitle;
        List<String> movieList = new ArrayList<String>();

        System.out.println("Enter A Movie Title for the program to store.!! Enter Q or q to exit");
        movieTitle = input.nextLine();

        while(!movieTitle.toLowerCase().equals("q")){

            if(movieList.contains(movieTitle)){
                System.out.println("The movie has already been added\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            }
            else{

                movieList.add(movieTitle);
            }
            System.out.println("Enter A Movie Title for the program to store.!! Enter Q or q to exit");
            movieTitle = input.nextLine();

        }
        System.out.println("The movies your entered are: \n:::::::::::::::::::" );
        for(int i =0;i<movieList.size();i++)
        {
            System.out.println(movieList.get(i));
        }
        System.out.println(":::::::::::::::::::::\nThank you for using the system");
    }
}



