public class LayBuy{
    private String laybuyNumber;
    private String customerId;
    private double total;
    private double Paid;

public LayBuy(String laybuyNumber, String customerId, double total, double Paid){
    this.laybuyNumber = laybuyNumber;
    this.customerId = customerId;
    this.total = total;
    this.Paid = Paid;
    this.Balance = total - Paid;
}  
//Calculate Balance
double Balance;

public String getLaybuyNumber(){
    return laybuyNumber;
}  
public String getCustomerId(){
    return customerId;
}
public double getTotal(){
    return total;
}
public double getPaid(){
    return Paid;
} 
public String toFileString(){
    return laybuyNumber +";"+ customerId + ";"+ total + ";"+ Paid + ";"+ Balance;
}
}