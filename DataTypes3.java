/*
Data Types : 
a) Primitive => Integer(byte, short, int , long) , Float(double , hoat) , Characters , Boolean 
Interger(int) -> 
                int - 4 bytes
                short - 2 bytes
                long - 8 bytes
                byte - 1 bytes -> -2^7 to 2^7-1 -> -128 to 127 
                        ex : byte num = 8 

Float => 
                float - 4 bytes (must mention f at the end of value)
                double - 8 bytes (default by JVM)
                ex : double num = 5.6;
                     float num = 5.6f;

Char => 
                char = 2 bytes
                Java follows UNICODE 
                char c = 'b'; 

Boolean => 
                boolean - true or false
                boolean c = true;

*/

public class DataTypes3{

    public static void main(String a[]){
        
        int num1 = 1293;
        byte num2 = 123;
        short sh = 558;

        long num3 = 33103;

        float f = 3.7f;
        double d = 12.4;

        char c = 'k';

        boolean b = true;
    }
}