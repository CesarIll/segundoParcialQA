package ejercicios456;

import org.junit.Assert;
import org.junit.Test;
import resourcesJava.UI.todoLy.CenterSection;
import resourcesJava.UI.todoLy.LoginModal;
import resourcesJava.UI.todoLy.MainPage;
import resourcesJava.UI.todoLy.MenuSection;

public class Ejercicio5 extends BaseTodoLy{
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();
    CenterSection centerSection = new CenterSection();
    String user = "cesar3@illanes.com";
    String password = "password12345678";
    String name = "Cesar Illanes";


    @Test
    public void verify_signUp_todoly() throws InterruptedException {
        mainPage.signUp.click();
        mainPage.name.set(name);
        mainPage.email.set(user);
        mainPage.password.set(password);
        mainPage.checkBox.click();
        mainPage.signIn.click();

        this.waitOnSecond(2);
        Assert.assertTrue("ERROR",menuSection.logoutButton.controlIsDisplayed());


    }
}
