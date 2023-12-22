public class User {
    protected String userId;
    protected String name;
    protected String email;

    // Constructor
    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters for each attribute
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Other common methods
    public void updateProfile(String name, String email) {
        setName(name);
        setEmail(email);
    }

    // You might also add additional common methods that make sense for your application context.
    // For instance, methods for password management (if applicable), or for printing user details.

    // Example method to print user details
    public void printUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

