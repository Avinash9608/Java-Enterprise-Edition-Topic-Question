package Inheritance.examples;

public class Manager extends EMP {
            private double bonus;
            public void setBouns(double bonus)
            {
                this.bonus=bonus;
            }
            public double getBouns()
            {
                return bonus;
            }
            public double getIncome()
            {
                double income;
                income=getSal() + bonus;
                return income;
            }
        }
