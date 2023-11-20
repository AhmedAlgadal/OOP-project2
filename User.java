public abstract class User {
    // add address
    String uId;
    String uName;
    String uEmail;
    String uPassword;
    boolean isActive = false;

    public User() {
    }

    public User(String uId, String uName, String uEmail, String uPassword, boolean isActive) {
        this.uId = uId;
        this.uName = uName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        this.isActive = isActive;
    }

    public User(String uId, String uName, String uEmail, String uPassword) {
        this.uId = uId;
        this.uName = uName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuId() {
        return uId;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuName() {
        return uName;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getActive() {
        return isActive;

    }
}
