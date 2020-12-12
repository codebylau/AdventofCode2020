package aoc2020;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class Day2 extends AoC2020 {

    public Day2() {
        super("2");
    }

    @Override
    void solve(List<String> ipStr) {
        List<String> valid = new ArrayList();
        for (String s : ipStr) {
            String[] parts = s.split(":");
            String policy = parts[0];
            String passwd = parts[1].trim();
            String[] polParts = parts[0].split(" ");
            String times = polParts[0];
            String[] range = times.split("-");
            int lowRange = Integer.parseInt(range[0]);
            int highRange = Integer.parseInt(range[1]);
            String letter = polParts[1];
            int count = 0;

            for (int i = 0; i < passwd.length(); i++) {
                if (passwd.charAt(i) == letter.charAt(0)) {
                    count++;
                }
            }
            
            if (count >= lowRange && count <= highRange) {
                    valid.add(s);
                }
            
            
        }
        System.out.println("Solution to day 2 part 1: " + valid.size());
        
        
        valid.clear();
        for (String s : ipStr) {
            String[] parts = s.split(":");
            String policy = parts[0];
            String passwd = parts[1].trim();
            String[] polParts = parts[0].split(" ");
            String times = polParts[0];
            String[] range = times.split("-");
            int lowRange = Integer.parseInt(range[0]);
            int highRange = Integer.parseInt(range[1]);
            String letter = polParts[1];
            int count = 0;
            
            if (passwd.charAt(lowRange - 1) == letter.charAt(0))
                count++;
            if (passwd.charAt(highRange - 1) == letter.charAt(0))
                count ++;
            
            if (count == 1)
                valid.add(s);
            
            
        }
        
        System.out.println("Solution to day 2 part 2: " + valid.size());
    }
}
