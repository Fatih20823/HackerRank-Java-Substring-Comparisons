package com.main;

import java.util.Scanner;

public class Application {
	
	public static String getSmallestAndLargest(String s, int k) {
		
		java.util.List<String> Siralama = new java.util.ArrayList<>();
		
        for(int i=0; i<s.length()-k+1;i++){
                Siralama.add(s.substring(i,i+k));
        }
        java.util.Collections.sort(Siralama);
        
        String smallest = Siralama.get(0);
        String largest = Siralama.get(Siralama.size()-1);

        return smallest + "\n" + largest;
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
