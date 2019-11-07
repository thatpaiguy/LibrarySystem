public class Adult extends User{
    private boolean isTeacher;
    public Adult(String userName, String password, int age, String address, String phoneNumb, boolean isTeacher){
        super(userName, password, age, address, phoneNumb);
        this.setTeacher(isTeacher);
        this.items = new Item[10];
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
}
