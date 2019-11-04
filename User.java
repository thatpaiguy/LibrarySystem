public class User {
    private String username;
    private String password;
    private int age;
    private String address;
    private long phoneNumb;
    private boolean isChild; //check to see if User is child or adult
    /**
     * Parameterized constructor
     * Not included: default constructor since creating a default user will not be needed
     * no setter for username because the check for this is in the database add method
     */
    public User(String userName, String password, int age, String address, long phoneNumb){
        this.username=userName;
        this.setPassword(password);
        this.setAge(age);
        this.setAddress(address);
        this.setPhoneNumb(phoneNumb);
    }
    /**
     * Getters
     */
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public long getPhoneNumb() {
        return phoneNumb;
    }
    public boolean childCheck(){
        return isChild;
    }

    /**
     * Setter for password
     * first checks to see if password is at least 8 characters
     * for loop checks if there's at least one digit(isDigit method) and one special character using ASCII numbers
     */
    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("This password doesn't meet the length requirement");
            return;
        }
        boolean digCheck = false;
        boolean specCheck = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)) == true) {
                digCheck = true;
            }
            if (password.charAt(i) < 48 || password.charAt(i) > 57 && password.charAt(i) < 65 || password.charAt(i) > 90 && password.charAt(i) < 97 || password.charAt(i) > 122) {
                specCheck = true;
            }
        }
        if (digCheck == true && specCheck == true)
            this.password = password;
        else
            System.out.println("Password needs to have at least one number and one special character");
    }

    /**
     * Setter for age
     * account is a child if age is between 5 and 16
     * accounts younger than 5 cannot be created
     */
    public void setAge(int age) {
        if(age<5) {
            System.out.println("You are too young to have an account");
            return;
        }
        if(age<=16){
            this.isChild = true;
        }
        this.age = age;
    }

    /**
     * Setter for address
     * didn't want to be too strict with parameters for address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Setter for phone number
     * type-casted long to String to make it easier to check the length
     */
    public void setPhoneNumb(long number) {
        if(Long.toString(number).length() > 0 && Long.toString(number).length() < 10){
            System.out.println("This is not a valid phone number");
            return;
        }
        this.phoneNumb = number;
    }

    /**
     * toString method for every attribute in User
     */
    public String toString(){
        return "Username: " + username + "\nPassword: " + password + "\nAge: " + age + "\nAddress: " + address +"\nPhone Number: " + phoneNumb+ "\nChild?: " + isChild;
    }
}
