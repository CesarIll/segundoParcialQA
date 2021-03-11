package resourcesJava.UI.todoLy;

import org.openqa.selenium.By;
import resourcesJava.UI.controls.Button;
import resourcesJava.UI.controls.TextBox;

public class LoginModal {
    public TextBox emailTextBox= new TextBox(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxEmail']"));
    public TextBox pwdTextBox= new TextBox(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxPassword']"));
    public Button loginButton= new Button(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$ButtonLogin']"));

    public LoginModal(){}

    public void loginAction(String user, String pwd){
        emailTextBox.set(user);
        pwdTextBox.set(pwd);
        loginButton.click();
    }

}
