public class Method_p {
    public static void main(String[] args) {




        Tv obj1=new Tv(false,1);
        obj1.printDetail();



      boolean value;
        value= oddEven(45);
     boolean   value1= oddEven(44);
     boolean   value2= oddEven(7);
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);


       // System.out.println(oddEven(45));
double areaOfRec=areaOfRactangle(23,5);
        System.out.println(areaOfRec);
    }



    public static boolean oddEven(int num){
        if(num%2==0){
            return true;
        }
        else return false;
    }



    public static double areaOfRactangle(double length,double width){
        double area=length * width;
        return area;
    }
}
