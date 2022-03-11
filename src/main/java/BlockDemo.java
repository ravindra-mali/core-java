public class BlockDemo {

    static int counter;

    int tempCounter;

    BlockDemo() {
        counter++;
        System.out.println("Constructor : counter increased by one");
    }

    @Override
    public String toString() {
        return "{ Static Counter : "+counter+", Non Static Counter : "+tempCounter+" }";
    }

    protected void increaseCounter(){
        this.tempCounter++;
    }

    static {
        System.out.println("Static block Initializer Counter : " + counter);
        counter = 0;
    }

    {
        System.out.println("Non Static Block called for object : "+BlockDemo.counter);
    }


    public static void main(String args[]) {
        System.out.println("Main Method ");
        BlockDemo blockDemo = new BlockDemo();
        System.out.println(blockDemo);
        blockDemo.increaseCounter();
        System.out.println(blockDemo);
        BlockDemo blockDemo1 = new BlockDemo();
        System.out.println(blockDemo1);
        blockDemo1.increaseCounter();
        System.out.println(blockDemo1);
        BlockDemo blockDemo2 = new BlockDemo();
        System.out.println(blockDemo2);
        blockDemo2.increaseCounter();
        System.out.println(blockDemo2);

        main();
    }

    public static void main() {
        System.out.println("Overloaded Static method " + counter);
    }
}
