// total amount borrowed

print "Input the total amount borrowed: "; 
int totalAmountBorrowed = Integer.parseInt(System.console().readLine());

// number of years to pay it back

print "Input the number of years to pay it back: "; 
int numberOfYears = Integer.parseInt(System.console().readLine());


// interest rate

print "Input the interest rate in percent: "; 
int interestRate = Integer.parseInt(System.console().readLine());



// total amount to be paid


int total = totalAmountBorrowed * ( 1 + (interestRate/100) );


int totalAmountPaid = numberOfYears * (total - totalAmountBorrowed)+totalAmountBorrowed;


println "The total amount to be paid back is: " + totalAmountPaid; 

// money to be paid back every year


int paidBackYear = totalAmountPaid/ numberOfYears;

println "The amount to be paid back every year is: " + paidBackYear


// number of years til only the capital remains


int yearsTillCapital = (totalAmountPaid - totalAmountBorrowed)/paidBackYear



println yearsTillCapital;



println "The number for years till the interest is paid is: " + yearsTillCapital;
println "The number has been rounded to a period of whole years"; 


