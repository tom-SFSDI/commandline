package com.statefarm;

public class SumOfPositivesCLI {
    public static void main(String[] args) {
        int sum = 0;
        for(int a = 0; a < args.length; a++) {
            int parsed = Integer.parseInt(args[a]);
            if(parsed >= 0) {
                sum += parsed;
            }
        }
        System.out.println(sum);
    }
}

