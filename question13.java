package javaassignment;



class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double rate) {
        this.name = name;
        this.salaryRate = rate;
    }

    public double pay(int hours) {
        return 0;
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double rate) {
        super(name, rate);
    }

    public double pay(int days) {
        return days * salaryRate;
    }
}


class SalariedWorker extends Worker {
	
    public SalariedWorker(String name, double rate) {
        super(name, rate);
    }

    public double pay(int hours) {
        return 40 * salaryRate;
    }

}
public class question13{
    public static void main(String[] args) {
        DailyWorker d=new DailyWorker("Ravi", 500);
        SalariedWorker s=new SalariedWorker("Anu", 400);

        System.out.println("DailyWorker Pay: " + d.pay(5));
        System.out.println("SalariedWorker Pay: " + s.pay(45));
    }
}


/*
 * 
 * DailyWorker Pay: 2500.0
SalariedWorker Pay: 16000.0
*/
 */

