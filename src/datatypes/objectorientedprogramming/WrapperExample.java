package datatypes.objectorientedprogramming;

public class WrapperExample {
    Byte wrapperByte = 100;
    Short wrapperShort = 20000;
    Integer wrapperInt;
    Long wrapperLong = 10L;
    Float wrapperFloat;
    Double wrapperDouble;
    Boolean wrapperBoolean;
    Character wrapperChar = 'A';
    String stringExample = "This is Java Session";                                               // though this is not wrapper

    public void printWrapperInfo() {
        System.out.println("wrapperByte " + wrapperByte);
        System.out.println("wrapperShort " + wrapperShort);
        System.out.println("wrapperInt " + wrapperInt);
        System.out.println("wrapperLong " + wrapperLong);
        System.out.println("Wrapper Long Value " + wrapperLong.longValue());
        System.out.println("wrapperFloat " + wrapperFloat);
        System.out.println("wrapperDouble " + wrapperDouble);
        System.out.println("wrapperBoolean " + wrapperBoolean);
        System.out.println("wrapperChar " + wrapperChar);
        System.out.println("wrapper Char Value " + wrapperChar.charValue());
        System.out.println("String Example "+stringExample);
    }
}
