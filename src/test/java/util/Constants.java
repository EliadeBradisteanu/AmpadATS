package util;

public final class Constants {

    public static final String RED = "rgba(163, 0, 0, 1)";

    public static final String LOGGEDIN_USER = "ams-support@ampada.com";




    private Constants() {
        //this prevents even the native class from
        //calling the ctor as well:
        throw new AssertionError();
    }
}
