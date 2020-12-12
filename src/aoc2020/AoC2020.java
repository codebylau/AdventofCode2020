package aoc2020;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Laura
 */
public abstract class AoC2020 {

    public AoC2020(String day){
        File file = new File ("puzzles/" + day + ".txt");
        BufferedReader br;
        List<String> ipLn = new ArrayList<>();
        if (!file.exists()){
            solve (new ArrayList<>());
            return;
        }
        
        try{
            br = new BufferedReader(new FileReader(file));
        }catch(FileNotFoundException e){
            System.err.println("Error: " + e.getMessage());
            solve (new ArrayList<>());
            return;
        }
        
        try{
            String ln;
            while ((ln = br.readLine()) != null)
                ipLn.add(ln);
            br.close();
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
        
        solve(ipLn);
    }
    
    public List<Integer> parseToInt(List<String> ip)
	{
		return ip.stream().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
	}
   
    public List<Long> parseToLong(List<String> ip)
	{
		return ip.stream().mapToLong(Long::parseLong).boxed().collect(Collectors.toList());
	}
    
    abstract void solve(List<String> ip);
    
}
