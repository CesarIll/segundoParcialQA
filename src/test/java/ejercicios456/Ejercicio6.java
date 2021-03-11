package ejercicios456;

import org.junit.Assert;
import org.junit.Test;
import resourcesJava.UI.todoLy.CenterSection;
import resourcesJava.UI.todoLy.LoginModal;
import resourcesJava.UI.todoLy.MainPage;
import resourcesJava.UI.todoLy.MenuSection;

public class Ejercicio6 extends BaseTodoLy{
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();
    CenterSection centerSection = new CenterSection();
    String user = "cesar2@illanes.com";
    String password = "password12345678";


    @Test
    public void verify_logout_todoly() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTextBox.set(user);
        loginModal.pwdTextBox.set(password);
        loginModal.loginButton.click();
        Assert.assertTrue("Error en loggeo", menuSection.logoutButton.controlIsDisplayed());
        this.waitOnSecond(2);

        mainPage.logout.click();
        this.waitOnSecond(2);
        Assert.assertTrue("Error en desloggeo", mainPage.signUp.controlIsDisplayed());
    }
}
