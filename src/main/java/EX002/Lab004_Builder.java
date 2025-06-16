package EX002;

public class Lab004_Builder {


    public Lab004_Builder Step1()
    {
        System.out.println("Step1");
        return this;
    }

    public Lab004_Builder Step2()
    {
        System.out.println("Step2");
        return this;
    }
    public Lab004_Builder Step3()
    {
        System.out.println("Step3");
        return this;
    }

    public static void main(String[] args)
    {

        Lab004_Builder LbN= new Lab004_Builder();
        LbN.Step1().Step2().Step3();

    }
}


