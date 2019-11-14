//will ask for age in the main
//only way child is related to parent is fines
//if child ages out, copy account to Adult class, and remove original child from UserDB
//TODO decorator comment
public class Child extends User{
    private User parent;
    public Child(String userName, String password, int age, String address, String phoneNumb, User adult){
        super(userName, password, age, address, phoneNumb);
        this.setParent(adult);
    }
    public User getParent(){
        return this.parent;
    }
    public void setParent(User adult){
        this.parent = adult;
    }
    public String toString(){
        return super.toString() + "Child\nParent: " + parent.getUsername();
    }
    public void checkOut(Item item){
        if(item.isMatureRating()==true)
        {
            System.out.println("You are too young");
            return;
        }
        if(item.getNumCopies() == 0) {
            System.out.println("You have been added to the wait list for " + item.getTitle());
            item.addUser(this);
            return;
        }
        if(parent.getBalance()>100){
            System.out.println("Too much in fines!!");
            return;
        }
        if(items.size() >= 10){
            System.out.println("You cannot check out any more items");
            return;
        }
        items.add(item);
        item.setNumCopies(item.getNumCopies()-1);
        System.out.println("Due Data: " + item.getDueDate()); //TODO
    }
    public void payFine(){
        System.out.println("Children cannot pay fines");
    }

    public void update(String update) {
        System.out.println(update+" for Child");
    }
    public String getType(){
        return "Child";
    }
    //TODO: every time fine is added, do parent.balance+=fine, never touch child.balance

}
