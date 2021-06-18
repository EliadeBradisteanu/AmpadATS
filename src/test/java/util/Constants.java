package util;

public final class Constants {

    public static final String RED = "rgba(163, 0, 0, 1)";


    private Constants() {
        //this prevents even the native class from
        //calling the ctor as well:
        throw new AssertionError();
    }
}
