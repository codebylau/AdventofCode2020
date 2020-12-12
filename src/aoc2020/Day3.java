package aoc2020;

import java.util.List;

/**
 *
 * @author Laura
 */
public class Day3 extends AoC2020{
    public Day3(){
        super("3");
    }
    
    long slope(int x, int y, List<String> ip){
       int[][] grid = new int[323][31];
       long cont = 0;
       int move = 0;
       
       for (int i = 0; i < grid.length; i += y){
           for (int j = 0; j < grid.length; j += grid.length){
               if (ip.get(i).charAt(move) == '#')
                   cont++;        
           }
                move = (move + x) % 31;
       }
       
       return cont;
    }
    
    @Override
    void solve(List<String> ipStr){
      
        long slope1 = slope(3, 1, ipStr);
        System.out.println("Solution to day 3 part 1: " + slope1);
        
        long slope2 = slope(1, 1, ipStr);
        long slope3 = slope(5, 1, ipStr);
        long slope4 = slope(7, 1, ipStr);
        long slope5 = slope(1, 2, ipStr);
        

        
        System.out.println("Solution to day 3 part 2: " + slope1 * slope2 * slope3 * slope4 * slope5);
        
        
    }
}
