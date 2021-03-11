package resourcesJava.UI.todoLy;

import org.openqa.selenium.By;
import resourcesJava.UI.controls.*;

public class MainPage {

    public Image loginImage= new Image(By.xpath("//img[@src='/Images/design/pagelogin.png']"));

    public Button signUp = new Button(By.xpath("//div[@class='HPHeaderSignup']//a"));
    public TextBox name = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxFullName']"));
    public TextBox email = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxEmail']"));
    public TextBox password = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxPassword']"));
    public CheckBox checkBox = new CheckBox(By.xpath("//label[@class='HPLoginTerms']//input"));
    public Button signIn = new Button(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$ButtonSignup']"));

    public Button logout = new Button(By.xpath("//a[@id='ctl00_HeaderTopControl1_LinkButtonLogout']"));

    public MainPage(){}
}
