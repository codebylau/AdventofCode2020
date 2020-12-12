package aoc2020;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class Day1 extends AoC2020 {
    public Day1(){
        super("1");
    }
    
    @Override
    void solve(List<String> ipStr){
        List<Integer> ip = parseToInt(ipStr);
        List<Integer> visited = new ArrayList();
        int sol = 0;
        
        for (int i:ip){
            visited.add(i);
            int candidate = 2020 - i;
            if (visited.contains(candidate)){
                sol = i * candidate;     
            }
        }
        
        System.out.println("Solution to  day 1 part 1: " + sol);
        
        for (int i:ip){
            visited.add(i);
            for (int j:ip){
                int candidate = 2020 - i - j;
                if (visited.contains(candidate)){
                    sol = i * j * candidate;
                }
            }
        }
        
        System.out.println("Solution to day 1 part 2: " + sol);
        
        
        
        
    }
}
