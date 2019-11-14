public class Adult extends User{
    private boolean isTeacher;
    public Adult(){}
    public Adult(String userName, String password, int age, String address, String phoneNumb, boolean isTeacher){
        super(userName, password, age, address, phoneNumb);
        this.setTeacher(isTeacher);
    }
    public void setTeacher(boolean bool){
        this.isTeacher = bool;
    }
    public String toString(){
        return super.toString() + "Adult\nTeacher?: "+ isTeacher;
    }

    public void update(String update) {
        System.out.println(update+" for Adult");
    }
    public String getType(){
        return "Adult";
    }
    public void checkOut(Item item){
        if(item.getNumCopies() == 0) {
            System.out.println("There are no more copies.\nYou have been added to the wait list for " + item.getTitle()+"\n");
            item.addUser(this);
            return;
        }
        if(this.balance>100){
            System.out.println("Too much in fines!!");
            return;
        }
        if(item == null) {
            throw new IllegalArgumentException("The argument cannot be null");

        }
        if(items.size() >= 10 && !isTeacher){
            System.out.println("You cannot check out any more items");
            return;
        }
        if(items.size() >= 50){
            System.out.println("You cannot check out any more items");
            return;
        }
        items.add(item);
        item.setNumCopies(item.getNumCopies()-1);
        System.out.println("Due Data: " + item.getDueDate());

    }
}
