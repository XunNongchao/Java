import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Internationalization {
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");

//        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.Language.info",locale);//不加Locale默认为本机中文
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.Language.info");

        System.out.println(resourceBundle.getString("system.name"));
        System.out.println(resourceBundle.getString("input.username"));
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        System.out.println(resourceBundle.getString("input.password"));
        String password = input.next();

        if ("admin".equals(userName) && "123".equals(password)) {
            System.out.println(resourceBundle.getString("login.success"));
            String str = resourceBundle.getString("welcome");
            str = MessageFormat.format(str,userName);//配置动态welcome,{0}
            System.out.println(str);
        } else {
            System.out.println(resourceBundle.getString("login.error"));
        }
    }
}
