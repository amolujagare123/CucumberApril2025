package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before ("@valid")
    public void getMyMethod1()
    {
        System.out.println("getMyMethod1");
    }

    @After ("@valid")
    public void getMyMethod2()
    {
        System.out.println("getMyMethod2");
    }
}
