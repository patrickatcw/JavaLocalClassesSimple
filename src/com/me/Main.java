package com.me;

import java.util.Scanner;

public class Main {

    //step 8 need static code for scanner
    private static Scanner scanner = new Scanner(System.in);
    //step 9 instance
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        //step 10 method (local class within method)
        class ClickListener implements Button.OnClickListener {

            public ClickListener(){

                System.out.println("I've been attached");

            }

            //step 11 override
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        //step 12 attach to button field
        btnPrint.setOnClickListener(new ClickListener());
        //step 14 add code to call listen method
        listen();

        //step 15 run

    }

    //step 13 method
    private static void listen(){

        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }

    }

}

/*
results;
I've been attached
 */
