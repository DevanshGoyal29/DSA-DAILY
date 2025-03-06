public class cube
{
    private double sidelength;
    private boolean dumflag;
    public cube()
    {
        this(1.0);
        System.out.println("Default cONSTRUCTOR CALLED");
    }

    public cube(double sidelength)
    {
        this.sidelength=sidelength;
        System.out.println("Single parameter");
    }

    public cube(double sidelength,boolean dumflag)
    {
        this.sidelength=sidelength;
        this.dumflag=dumflag;
        System.out.println("Two parameteres ");
    }

    public double getsidelength()
    {
        return sidelength;
    }
    public double calculatevol()
    {
        return Math.pow(sidelength,3);
    }

    public static void main(String args[])
    {
        cube cube1=new cube(4.0,true);
        System.out.println("Cube 1 side length is:"+cube1.getsidelength());
        System.out.println("Cube1 volume:"+cube1.calculatevol());
    }

    

}
