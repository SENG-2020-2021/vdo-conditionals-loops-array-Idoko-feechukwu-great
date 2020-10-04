class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration

   //declare an array variable and assign the days of the month debtor defaulted,
   byte daysOfTheMonthDebtorDefaulted [] = { 1,2,3,4,5}; 

   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
        float amounttheDebtorPaysPerDay = 500f; 
        float amountAlreadyPaid = 1800f;

      
   // declare all the variables needed for your calculations
  float totalAmount = 0f; 
  byte actualElement = 0;
  float AP =amountAlreadyPaid;
  byte daysDebtorAlreadyPaidFor=0;
  float leftToPay;
  float extra;


   // calculate and print total amount the debtor is to pay using for each loop
  
   for(byte i: daysOfTheMonthDebtorDefaulted) {
   totalAmount += amounttheDebtorPaysPerDay;  
   actualElement++; 
  }

  System.out.println("Elements in array are " + actualElement); 
   
  System.out.println("The total amount for debtor to pay is #" + totalAmount);

   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
 
for(int i=0; i<actualElement; i++) {
  
  if(AP>=amounttheDebtorPaysPerDay){
    AP = AP - amounttheDebtorPaysPerDay; 
    daysDebtorAlreadyPaidFor++;
    
  }
  else if(AP<amounttheDebtorPaysPerDay){
    break;
  }
}  
for(int i=0; i<daysDebtorAlreadyPaidFor;i++){
  System.out.println("The debtor has paid for day " + daysOfTheMonthDebtorDefaulted[i]);
}

if(amountAlreadyPaid%amounttheDebtorPaysPerDay>0 && amountAlreadyPaid<totalAmount){
  System.out.println("The day that was not completely paid for is day " + daysOfTheMonthDebtorDefaulted[daysDebtorAlreadyPaidFor]);
  
  System.out.println("The amount debtor needs to pay for day " + daysOfTheMonthDebtorDefaulted[daysDebtorAlreadyPaidFor] +" is #" + (amounttheDebtorPaysPerDay - (amountAlreadyPaid%amounttheDebtorPaysPerDay)));
}


   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise

   if(amountAlreadyPaid<totalAmount) {
     leftToPay= totalAmount-amountAlreadyPaid;
     System.out.println("The amount left to pay is #" + leftToPay);
   }
  else if(amountAlreadyPaid>totalAmount){
    extra = amountAlreadyPaid-totalAmount;
    System.out.println("The amount you are being owed is #" + extra);
  }
  else if(amountAlreadyPaid == totalAmount) {
    System.out.println("You have paid the exact amount!!");
  }

   //kindly remove the statement below when you are done with the assignment
    
  }
}