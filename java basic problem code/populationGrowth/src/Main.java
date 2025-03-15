import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long population = input.nextLong();
        byte year = input.nextByte();
        final double population_GrowthRate = 2.0/100;
        long predictPopulation = (long) (population * Math.pow((1 + population_GrowthRate),year));

        for(int i=0; i<year; i++){
            population += (long) (population * population_GrowthRate);
        }

        System.out.println("Predicted Population : " + population);
        System.out.println("Predicted Population (using formula, much accurate): " + predictPopulation);
    }
}