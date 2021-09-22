public class bikers {
    public static void main(String[] args)
    {
        float r1=100,r2=200,r3=150,r4=130,r5=125,average;
        average = (r1+r2+r3+r4+r5)/5;
        System.out.println("Average is "+average);
        if (r1 > average)
            System.out.println(" R1 is qualified ");
        if (r2 > average)
            System.out.println(" R2 is qualified ");
        if (r3 > average)
            System.out.println(" R3 is qualified ");
        if (r4 > average)
            System.out.println(" R4 is qualified ");
        if (r5 > average)
            System.out.println(" R5 is qualified ");
    }

}
