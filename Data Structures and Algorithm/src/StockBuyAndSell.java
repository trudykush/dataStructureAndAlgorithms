import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Interval {
    int buy;
    int sell;
}
public class StockBuyAndSell {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Stock obj = new Stock();
		    
		    obj.stockBuySell(arr, n);
		    System.out.println();
		}
	}
}

/*This is a function problem.You only need to complete the function given below*/
/*
class Interval {
    int buy;
    int sell;
}*/
class Stock{
    
    static void stockBuySell(int price[], int n) {
        StringBuffer str = new StringBuffer();
        
        if(n==1){
            return ;
        }
        
        ArrayList<Interval> sol = new ArrayList<Interval>();
        int i=0, cnt=0;
        while (i < n-1) {
            // Find Local Minima. Note that the limit is (n-2) as we are
            // comparing present element to the next element.
            while ((i < n-1) && (price[i+1] <= price[i])){
                i++;
            }
            // If we reached the end, break as no further solution possible
            if (i == n-1){
                break;
            }
            Interval e = new Interval();
            e.buy = i++;
 
            // Find Local Maxima.  Note that the limit is (n-1) as we are
            // comparing to previous element
            while ((i < n) && (price[i] >= price[i-1]))
                i++;
 
            // Store the index of maxima
            e.sell = i-1;
            sol.add(e);
            // Increment count of buy/sell pairs
            cnt++;
        }
        if(cnt==0){
            str.append("No Profit");
        } else {
            for(int j=0; j<sol.size(); j++){
                str.append("(" + sol.get(j).buy + " " + sol.get(j).sell +") ");
            }
        }
        System.out.print(str);
    } 
    
}
