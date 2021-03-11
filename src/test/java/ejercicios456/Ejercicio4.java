package ejercicios456;

import org.junit.Assert;
import org.junit.Test;
import resourcesJava.UI.todoLy.CenterSection;
import resourcesJava.UI.todoLy.LoginModal;
import resourcesJava.UI.todoLy.MainPage;
import resourcesJava.UI.todoLy.MenuSection;

public class Ejercicio4 extends BaseTodoLy{
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();
    CenterSection centerSection = new CenterSection();
    String user = "cesar@illanes.com";
    String password = "password12345678";
    String nameToChange = "Cesar Illanes Updated";

    @Test
    public void verify_update_fullname_todoly() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTextBox.set(user);
        loginModal.pwdTextBox.set(password);
        loginModal.loginButton.click();
        Assert.assertTrue("Error en loggeo", menuSection.logoutButton.controlIsDisplayed());

        centerSection.opciones.click();
        centerSection.fullName.clear();
        this.waitOnSecond(3);
        centerSection.fullName.set(nameToChange);
        centerSection.okButton.click();
        this.waitOnSecond(3);

        Assert.assertTrue("Cambio no realizado", menuSection.logoutButton.controlIsDisplayed());
    }
}
