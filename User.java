import java.util.LinkedList;

public abstract class User{
    protected String username;
    protected String password;
    protected int age;
    protected String address;
    protected String phoneNumb;
    protected Item[] items;
    protected double balance;
    /**
     * Parameterized constructor
     * Not included: default constructor since creating a default user will not be needed
     * no setter for username because the check for this is in the database add method
     * if User is a teacher, they are allowed 15 items, if not, they are allowed 10
     */
    public User(String userName, String password, int age, String address, String phoneNumb){
        this.username=userName;
        this.setPassword(password);
        this.setAge(age);
        this.setAddress(address);
        this.setPhoneNumb(phoneNumb);
        this.items = new Item[10];
        balance =0;
    }
    public User(){}
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
    public String getPhoneNumb() {
        return phoneNumb;
    }
    public double getBalance(){return balance;}
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
    public void setPhoneNumb(String number) {
        if(number.length() > 0 && number.length() < 10){
            System.out.println("This is not a valid phone number");
            return;
        }
        for(int i=0; i<number.length(); i++){
            if(Character.isDigit(number.charAt(i)) == false)
            {
                System.out.println("This is not a valid phone number.");
                break;
            }
        }
        this.phoneNumb = number;
    }

    /**
     * toString method for every attribute in User
     */
    public String toString(){
        return "Username: " + username + "\nPassword: " + password + "\nAge: " + age + "\nAddress: " + address +"\nPhone Number: " + phoneNumb + "\nAccount type: ";
    }
    //TODO comment
    public void checkOut(Item item){
        if(item.getNumCopies() ==0) {
            item.addUser(this);
            System.out.println("You have been added to the waitlist for " + item.getTitle());
            return;
        }
        if(this.balance>100){
            System.out.println("Too much in fines!!");
            return;
        }
        int i =0;
        while(i<items.length){
            if(items[i] == null)
                break;
            i++;
        }
        if(items[i]==null) {
            items[i] = item;
            item.setNumCopies(item.getNumCopies()-1);
        }

        else {
            System.out.println("You can't checkout anymore books");
        }
        System.out.println("Due Data: " + item.getDueDate()); //TODO
    }
    public void payFine(double payment){
        if(payment>balance){
            System.out.println("You don't have to pay that much!");
            return;
        }
        this.balance-=payment;
    }
    public void notifyObservers(LinkedList<User> list, String alert){}
    public void addBalance(double i){
        balance +=i;
    }
    public void update(String test){}
    public void writeReview(Item item, int rating, String review){
        Rating newRating = new Rating(rating,review);
        item.addRating(newRating); //adds rating to items list
    }
    public void viewRatings(Item item){
        item.getRatingList().toString();
    }
    public String getType(){
        return null;
    }
    public Item getItems(int i){
        return items[i];
    }
    public int itemSize(){
        return items.length;
    }
}
