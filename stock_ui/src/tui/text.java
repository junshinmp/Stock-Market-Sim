package stock_ui.src.tui;

import java.util.Scanner;

class text {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Stock Market Simulator");
        System.out.println("Currently, we only have Apple, Tesla, and Microsoft available.");
        System.out.println("Choose from one of the companies below:\n(1) Apple\n(2)Tesla\n(3) Microsoft");
        int choice = in.nextInt();

    }
}