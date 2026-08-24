import java.io.*;
import java.util.Scanner;

public class LayBuyManager{
    @SuppressWarnings("resource")
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter input file name:");
        String inputFileName = keyboard.nextLine();

        LayBuy[] laybuys = new LayBuy[100];
        int count = 0;

    //1.  read input file 
    try{
        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        String line;
        while ((line = br.readLine())!= null){
            String[] parts = line.split(";");
    //Make sure line has 4 values         
           
            if (parts.length != 4){
                System.out.println("Invalid line: + line");
                continue;
            }
    //Prevent array overflow
            if (count >= laybuys.length){
            System.out.println("Maximum of 100 records reached"); 
            break;   
            }
            String laybuyNumber = parts[0];
            String customerId = parts[1];
            double total = Double.parseDouble(parts[2]);
            double Paid = Double.parseDouble(parts[3]);

            laybuys[count] = new LayBuy(laybuyNumber, customerId, total, Paid);
            count++;
        }
        br.close();
    } catch (IOException e){
        System.out.println("Error reading file: "+ e.getMessage());
        return;
    }
    //Write output files
    try{
        PrintWriter latestWriter = new PrintWriter(new FileWriter("latest.txt"));
        PrintWriter concernWriter = new PrintWriter(new FileWriter("concern.txt"));

        latestWriter.println("laybuyNumber, customerId, total, Paid, Balance");
        concernWriter.println("laybuyNumber, customerId, total, Paid, Balance");
   
        for (int i = 0; i < count; i++){
            LayBuy lb = laybuys[i];
            //Calculate balance
        Double Balance = lb.Balance;

            latestWriter.println(lb.toFileString());

            if (Balance > 0.5 * lb.getTotal()){
                concernWriter.println(lb.toFileString());
            }
        }
        latestWriter.close();
        concernWriter.close();
        System.out.println("Files created successfully");

    }catch (IOException e){
        System.out.println("Error writing file:" + e.getMessage());
    }
    keyboard.close();
    }
}