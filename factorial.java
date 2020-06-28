package sahil.mulla.sahil;

public class DayZero {


    public static void main(String[] args) {
        int input = 5;
        int input1 = 5;
        int result=1;
        //For LOOP
        for (;input!=0;input--)
        {
            System.out.println("Before : "+result+":"+"Value :: "+input);
            result=result*input;
            System.out.println("After : "+result+":"+"Value :: "+input);
        }
        System.out.println("Factorial :FOR: "+result);
        System.out.println("Factorial :FOR THINK: "+input);
        //While LOOP
        int result1=1;
        while (input1!=0)
        {
            result1=result1*input1;
            input1--;
        }
        System.out.println("Factorial :WHILE: "+result1);
        System.out.println("Factorial :WHILE THINK: "+input1);



    }
}
