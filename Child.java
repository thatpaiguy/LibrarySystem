//will ask for age in the main
//only way child is related to parent is fines
//if child ages out, copy account to Adult class, and remove original child from UserDB
//TODO decorator comment
public class Child extends User{
    private User parent;
    public Child(String userName, String password, int age, String address, String phoneNumb, Adult adult){
        super(userName, password, age, address, phoneNumb);
        this.setParent(adult);
        this.items = new Item[10];
    }
    public User getParent(){
        return this.parent;
    }
    public void setParent(Adult adult){
        this.parent = adult;
    }
    public String toString(){
        return super.toString() + "Child\nParent: " + parent.getUsername();
    }
    public void checkOut(Item item){
        //if parent has over 100 in fines, child cannot check out books
        if(parent.getBalance() > 100) {
            int i = 0;
            while (i < items.length) {
                if (items[i] == null)
                    break;
                i++;
            }
            if (items[i] == null)
                //TODO: check for R rated books
                items[i] = item;
            else {
                System.out.println("You can't checkout anymore books");
            }
        }
    }
    public void payFine(){
        System.out.println("Children cannot pay fines");
    }

    public void update(String update) {
        System.out.println(update+" for Child");
    }
    //TODO: every time fine is added, do parent.balance+=fine, never touch child.balance

}
