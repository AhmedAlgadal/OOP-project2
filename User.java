public abstract class User {
    // add address
    int uId;
    String uName;
    String uEmail;
    String uPassword;
    double uBalance;
    boolean isActive = false;
    static int count=1;

    public User() {
        // count++;
    }

    public User(int uId, String uName, String uEmail, String uPassword, boolean isActive, double uBalance) {
        this.uId = uId;
        this.uName = uName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        this.isActive = isActive;
        this.uBalance = uBalance;
        // count++;
    }

    public User(int uId, String uName, String uEmail, String uPassword) {
        this.uId = uId;
        this.uName = uName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        // count++;
    }


    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
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

    public static int getCount() {
        return count++;
    }

    public double getuBalance() {
        return uBalance;
    }

    public void setuBalance(double uBalance) {
        this.uBalance = uBalance;
    }

}
