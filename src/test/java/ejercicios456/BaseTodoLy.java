package ejercicios456;

import org.junit.After;
import org.junit.Before;
import resourcesJava.UI.singletonSession.Session;

import java.io.IOException;

public class BaseTodoLy {

    @Before
    public void open(){
        Session.getSession().getDriver().get("http://todo.ly");
    }

    @After
    public void close() throws IOException {
        Session.getSession().closeSession();
        this.killChromeDriver();
    }

    public void waitOnSecond(int seconds) throws InterruptedException{
        Thread.sleep(seconds*1000);
    }

    public void killChromeDriver() throws IOException{
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
    }
}
