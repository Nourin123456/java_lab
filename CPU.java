public class CPU{
    double price;
  
    CPU(double price){
	    this.price=price;
    }
    class Processor{
	    int cores;
	    String manufacturer;

    Processor(int cores,String manufacturer){
        this.cores=cores;
        this.manufacturer=manufacturer;
    }
    void display(){
        System.out.println("Processor Cores:"+cores);
        System.out.println("Processor manufacturer:"+ manufacturer);
    }
}
static class RAM{
    int memory;
    String manufacturer;

    RAM(int memory,String manufacturer){
        this.memory=memory;
        this.manufacturer=manufacturer;
    }

    void display(){
	    System.out.println("RAM memory:" + memory + "GB");
	    System.out.println("RAM menufacurer:" + manufacturer);
    }
}
public static void main(String[] args){
	CPU cpu = new CPU(500.00);
	CPU.Processor p = cpu.new Processor(8,"intel");
	CPU.RAM r =new CPU.RAM(16,"Corsair");

	System.out.println("CPU price:$" + cpu.price);
	p.display();
	r.display();
}
}
