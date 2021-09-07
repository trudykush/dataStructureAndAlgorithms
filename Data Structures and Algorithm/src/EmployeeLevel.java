

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EmployeeLevel {
    public static void main(String[] args) {
        ConsoleProcessor processor = new ConsoleProcessor();
        processor.processAllLines();
    }
}

class ConsoleProcessor {

    public OrgChart orgChart = new OrgChart();

    public void processAllLines() {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        Integer numLines = 0;

        try {
           numLines = Integer.valueOf(line.trim());
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < numLines; i++) {
            processLine(in.nextLine());
        }

        in.close();
    }

    protected void processLine(String line) {
        String[] parsedCommand = line.split(",");

        // ignore empty lines
        if (parsedCommand.length == 0) {
            return;
        }

        switch (parsedCommand[0]) {
            case "add":
                orgChart.add(parsedCommand[1], parsedCommand[2], parsedCommand[3]);
                break;
            case "print":
                orgChart.print();
                break;
            case "remove":
                orgChart.remove(parsedCommand[1]);
                break;
            case "move":
                orgChart.move(parsedCommand[1], parsedCommand[2]);
                break;
            case "count":
                System.out.println(orgChart.count(parsedCommand[1]));
                break;
        }
    }
}
class OrgChart {
	HashMap<HashSet<String>, HashMap<String, String>> mEmployeeHashMap = new HashMap<HashSet<String>, HashMap<String, String>>();;
    HashSet<String> employeeIDHashSet = new HashSet<String>();;
    HashMap<String, String> employeeNameWithManagerID = new HashMap<String, String>();;
    
	public void add(String id, String name, String managerId)
    {   	
    	if(employeeIDHashSet.add(id)) {
    		employeeNameWithManagerID.put(name, managerId);
    		mEmployeeHashMap.put(employeeIDHashSet, employeeNameWithManagerID);
    	}
    }

    public void print()
    { 
        mEmployeeHashMap.entrySet().forEach(entry -> {
        	HashSet<String> employeeId = entry.getKey();
        	String employeeName = "";
        	String managerID = "";
        	for (Map.Entry<String, String> entry1 : entry.getValue().entrySet()) {
        		employeeName = entry1.getKey();
            	managerID = entry1.getValue();
            	System.out.println(employeeName + "[" + employeeId + "]");
        	}
        	if (managerID.equals("-1")) {
        		managerID = "has no manager";
        	}
//        	System.out.println(entry.getKey() + " " + entry.getValue());
        	
        });
    }

    public void remove(String employeeId)
    {
//        mEmployeeHashMap.entrySet().removeIf(entry -> entry.getKey().equals(employeeId));
        mEmployeeHashMap.entrySet().removeAll(Collections.singleton(employeeId));
    	//mEmployeeHashMap.keySet().remove(employeeId);
    }

    public void move(String employeeId, String newManagerId)
    {
        throw new UnsupportedOperationException();
    }

    public int count(String employeeId)
    {
        throw new UnsupportedOperationException();
    }
}