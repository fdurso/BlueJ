import java.util.ArrayList;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }
   
   public double avgLoan()
   {
       double sum = 0;
       for(Loan loan : data)
       {
           sum += loan.getLoanAmount();
       }
       return sum / data.size();
   }
   
   public double largestLoan()
   {
       double max = Double.MIN_VALUE;
       for(Loan loan : data)
       {
           if (loan.getLoanAmount() > max)
           {
               max = loan.getLoanAmount();
           }
       }
       return max;
   }
   
   public double smallestLoan()
   {
       double min = Double.MAX_VALUE;
       for(Loan loan : data)
       {
           if (loan.getLoanAmount() < min)
               min = loan.getLoanAmount();
       }
       return min;
   }
   
   public String largestLoanCountry()
   {
       int maxIndex = 0;
       for(int i = 0; i < data.size(); i++)
       {
           if (data.get(i).getLoanAmount() > data.get(maxIndex).getLoanAmount())
           {
               maxIndex = i;
           }
       }
       return data.get(maxIndex).getCountry();
   }
   
   public String smallestLoanCountry()
   {
       int minIndex = 0;
       for(int i = 0; i < data.size(); i++)
       {
           if (data.get(i).getLoanAmount() < data.get(minIndex).getLoanAmount())
           {
               minIndex = i;
           }
       }
       return data.get(minIndex).getCountry();
   }
   
   public double avgDaysToFund()
   {
       double sum = 0;
       for(Loan loan : data)
       {
           sum += loan.getDaysToFund();
       }
       return sum / data.size();
   }
   
   public double largestLoanKenya()
   {
       double max = Double.MIN_VALUE;
       for(Loan loan : data)
       {
           if ((loan.getCountry().equals("Kenya")) && (loan.getLoanAmount() > max))
           {
               max = loan.getLoanAmount();
           }
       }
       return max;
   }
   
   public double avgLoanPhilippines()
   {
       double sum = 0;
       int loans = 0;
       for(Loan loan : data)
       {
           if (loan.getCountry().equals("Philippines"))
           {
               sum += loan.getLoanAmount();
               loans++;
           }
       }
       return sum / loans;
   }
   
   public String longestToFundCountry()
   {
       int maxIndex = 0;
       for(int i = 0; i < data.size(); i++)
       {
           if (data.get(i).getDaysToFund() > data.get(maxIndex).getDaysToFund())
           {
               maxIndex = i;
           }
       }
       return data.get(maxIndex).getCountry();
   }
   
   public String mostLoansFunded()
   {
       int kenyaLoans = 0;
       int elSalvadorLoans = 0;
       for(Loan loan : data)
       {
           if (loan.getCountry().equals("Kenya"))
           {
               kenyaLoans++;
           } else if (loan.getCountry().equals("El Salvador"))
           {
               elSalvadorLoans++;
           }
       }
       
       if (kenyaLoans > elSalvadorLoans)
       {
           return "Kenya";
       } else
       {
           return "El Salvador";
       }
   }
   
   public double variance()
   {
       double sigma = 0;
       double avg = avgLoan();
       
       for(Loan loan : data)
       {
           sigma += Math.pow((avg - loan.getLoanAmount()), 2);
       }
       
       return sigma / data.size();
   }
   
   public double standardDeviation()
   {
       return Math.pow(variance(), 0.5);
   }
   
   public boolean empiricalRule()
   {
       int sum = 0;
       
       double min = avgLoan() - standardDeviation();
       double max = avgLoan() + standardDeviation();
       
       for(Loan loan : data)
       {
           if((loan.getLoanAmount() >= min) && (loan.getLoanAmount() <= max))
            sum++;
       }
       
       if(((double)sum / data.size() * 100) >= 68)
        return true;
       
       return false;
   }
}