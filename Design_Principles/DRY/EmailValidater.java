package Design_Principles.DRY;

public class EmailValidater {
    public boolean isValidEmail(String email)
    {
        return email!=null &&
                email.contains("@") &&
                email.contains(".") &&
                (email.endsWith("com")||email.endsWith("org"));
    }
}
