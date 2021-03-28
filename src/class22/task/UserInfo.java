package class22.task;

public class UserInfo extends UserClass {
    String address;
    UserInfo(String name,String mobileNumerb,String address){
        super(name,mobileNumerb);
        this.address=address;

    }
    void userDetail(){
        System.out.println("name "+super.name+" Mobile Number "+mobileNumber+" Address "+address);
    }

    public static void main(String[] args) {
        UserInfo userInfo=new UserInfo("Alec","12345567","bla bla bla");
        userInfo.userDetail();
    }
}
