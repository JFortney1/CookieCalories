
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jfortney
 */
public class CookieCalories {

    public static void main(String[] args) {

        String cookiesConsumed = JOptionPane.showInputDialog("Please input amount of cookies  consumed");

        //one cookie equals 75 calories b/c one serving equals 300 cal and 300 divided by 4 (cookies per serving) is 75.
        double oneCookie = 75;

        int caloriesConsumed = (int) (Integer.parseInt(cookiesConsumed) * oneCookie);
        System.out.println("If you ate "+ cookiesConsumed + " cookies then you consumed " + caloriesConsumed + " calories!");
    }
}
