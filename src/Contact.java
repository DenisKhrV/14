public class Contact {
    private final String nick;
    private String phone;

    public Contact(String nick, String phone) {
        this.nick = nick;
        this.phone = phone;
    }

    public String getNick() {
        return nick;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String toString() {
        return nick + ": " + phone;
    }
}
