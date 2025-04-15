import java.util.HashMap;

public class IDandPassword {
    // hashmap stores two value pair
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPassword(){
        loginInfo.put("morris", "password123");
        loginInfo.put("teacher", "teacher123");
        loginInfo.put("sudent", "student123");

    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
