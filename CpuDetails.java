class Cpu 
{
    double price=15000.0;
    class Processor
    {
        int cores=10;
        String manufacturer="Pentium";
    }
    static class RAM
    {
      double memory=64;
        String manufafacturer="Intel";
    }  
}
public class CpuDetails
{
    public static void main(String[] args) 
    {
        Cpu c=new Cpu();
        Cpu.Processor p=c.new Processor();
        Cpu.RAM r=new Cpu.RAM();
        System.out.println("Cpu class");
        System.out.println("----------------------");
        System.out.println("Cpu price="+c.price);
        System.out.println("\nProcessor inner class");
        System.out.println("----------------");
        System.out.println("No of cores="+p.cores);
        System.out.println("Manufacturer="+p.manufacturer);
        System.out.println("\nRAM static nested class");
        System.out.println("-----------------");
        System.out.println("Memory="+r.memory);
        System.out.println("Manufacturer="+r.manufafacturer);
    }
}
