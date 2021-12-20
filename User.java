import p1.Helper;
class User implements Helper{
    public void desc(){
        System.out.println("Helper Interface imported from package p1.");
    }
    public void msg(){
        System.out.println("Hello Helper interface.");
    }
    public static void main(String []args){
        User obj = new User();
        obj.desc();
        obj.msg();
    }
}
