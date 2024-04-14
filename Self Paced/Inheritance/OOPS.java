public class OOPS
{
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        BankAccount myAccount=new BankAccount();
        myAccount.username = "Susahnt"; 
        myAccount.setPassword("123");

    }
}



class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}


class Pen
{
    String color;
    int tip;
    String getColor()
    {
        return this.color;
    }
    void setColor(String newColor)
    {
        color=newColor;
    }

    void setTip(int newTip){
    tip = newTip;
    }
}




// class student{
//     String name;
//     int age;
//     float percentage;

//     void calcPercent(int phy, int chem, int math)
//     {
//         percentage = (phy+chem+math)/3;
//     }
// }