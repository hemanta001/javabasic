package datatypes.objectorientedprogramming;

public class PrimitiveAndWrapperExample {
    public static void main(String[] args) {
        PrimitiveExample primitiveExample = new PrimitiveExample();
        primitiveExample.primitiveByte = 99;
        primitiveExample.printPrimitiveInfo();

        WrapperExample wrapperExample = new WrapperExample();
        wrapperExample.wrapperByte = 99;
        wrapperExample.printWrapperInfo();
    }
}
