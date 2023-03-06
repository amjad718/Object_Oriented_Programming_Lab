package newPackage;
import java.util.Scanner;

class CPU{
    int price;
    public class Processor{
        int cores;
        String promanu;
        public static class RAM{
            static int memory;
            static String rammanu;
        }
    }
}

public class Question5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CPU cpu1 = new CPU();
        CPU cpu2 = new CPU();
        CPU.Processor processor = cpu1.new Processor();
        System.out.println("Enter the No.of Cores, Manufacturer and price of the Processor:");
        processor.cores = sc.nextInt();
        processor.promanu = sc.next();
        cpu1.price = sc.nextInt();
        System.out.println("Enter the Memory Size, Manufacturer and price of the RAM:");
        CPU.Processor.RAM.memory = sc.nextInt();
        CPU.Processor.RAM.rammanu = sc.next();
        cpu2.price = sc.nextInt();
        System.out.println(".............................................................");
        System.out.println("Processor Details:");
        System.out.println(processor.cores);
        System.out.println(processor.promanu);
        System.out.println(cpu1.price);
        System.out.println(".............................................................");
        System.out.println("RAM Details:");
        System.out.println(CPU.Processor.RAM.memory);
        System.out.println(CPU.Processor.RAM.rammanu);
        System.out.println(cpu2.price);
    }
}