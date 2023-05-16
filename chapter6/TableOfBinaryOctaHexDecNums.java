package chapter6;

public class TableOfBinaryOctaHexDecNums {

    public static void main(String[] args) {

        System.out.println("Decimal  |   Binary  |   Octal  |   HexaDecimal");
        System.out.println("..................|...................|................|...............................");

        for (int index = 1; index < 256; index++){
            String binary = Integer.toBinaryString(index);
            String octal = Integer.toOctalString(index);
            String hexa = Integer.toHexString(index).toUpperCase();
            System.out.println(index+"          |     "+ binary+"        |     "+ octal+"       |    "+hexa );
        }
    }
}
