package day07_ifStatementsTA;

public class BrowserTA {
    public static void main(String[] args) {

        String browserName = "Chrome";
        String result = "";
        if(browserName=="Chrome"||browserName=="firefox"||browserName=="opera"||browserName=="safari"||browserName=="edge"){
            if(browserName=="Chrome"){
                result = browserName+" is selected";
            } else if (browserName=="firefox") {
                result = browserName+" is selected";
            } else if (browserName=="opera") {
                result = browserName+" is selected";
            } else if (browserName=="safari ") {
                result = browserName+"is selected";
            }else {
                result= browserName+" is selected";
            }

        }else {
            result = "invalid browser";
        }

        System.out.println(result);









        /*
 1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */











    }
}
