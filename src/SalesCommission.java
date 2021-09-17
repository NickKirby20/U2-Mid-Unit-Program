/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */
/*
get inputs
calculate commission
calculate hourly  wage
display results
 */

import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    public static void main(String[] args) {
        double hourlyRate = getInput("What is your hourly wage: ");
        double hoursWorked = getInput("How many hours did you work this week: ");
       double commissionPercentage = getInput("Commission percent is: ");
        double sales = getInput("How many sales did you make: ");

        double hourlyPay = hourlyPay(hourlyRate,hoursWorked);
        double commissionPercentage =commissionPercentage(sales,commissionPercentage);


        outPut(totalEarnings );
    }



    public static double getInput(String prompt){

        return Double.parseDouble(JOptionPane.showInputDialog(prompt));


    }




    public static double hourlyPay(double hourlyRate, double hoursWorked){
        return (hourlyRate * hoursWorked );


 }



    public static double commissionPercentage( double commissionPercentage, double sales ){

        return (sales * commissionPercentage/100.0);


    }


    public static void outPut(double totalEarnings){

        DecimalFormat round = new DecimalFormat("#,##.00");
            JOptionPane.showMessageDialog(null, "Your total earning is: " + round.format(totalEarnings));

    }



}
