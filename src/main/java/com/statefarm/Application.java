package com.statefarm;

public class Application {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify a name and email");
        } else if
            (args[0] != null && args[1] != null) {
                System.out.println("Please specify an email for " + args[0]);
            }
        }
    }


