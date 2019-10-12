/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.HashMap;

/**
 *
 * @author nafees
 */
public class PhoneDirectory {

    HashMap<Integer, String> map = new HashMap<>();

    public void maping() {

        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

    }
    PhoneDirectory(){
        maping();
    }

    public void combination(int a, int b, int c, int d) {
        String str1 = map.get(a);
        String str2 = map.get(b);
        String str3 = map.get(c);
        String str4 = map.get(d);
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                for (int k = 0; k < str3.length(); k++) {
                    for (int l = 0; l < str4.length(); l++) {
                        System.out.println(str1.charAt(i) + "" + str2.charAt(j) + "" + str3.charAt(k) + "" + str4.charAt(l));
                    }

                }
            }
        }

    }

}

class mainDemo {

    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();
        directory.combination(2, 2, 2, 2);
    }
}
