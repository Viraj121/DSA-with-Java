package oops;


class Student{

}

class pen{
    String color;
    String type;
    int price;

    pen(String color,int price){
        this.price=price;
        this.color=color;

    }

    public void Info(){
        System.out.println(this.color+" "+this.price);
    }

    public void Printcolor(){
     System.out.println("color: "+this.color);
    }

    public void type(){
        System.out.println("type:"+this.type);
    }
}

//this keyword se method ko pata chalega ke konse object ne call kiya hai yaa konsa object access kar reha hai.
public class classes {
    public static void main(String[] args) {
        pen pen1=new pen("aman",90);//pen() is a constructor which are is to create objects in java
        pen1.Info();
        // pen1.color="red";
        // pen1.Printcolor();

        pen pen2 =new pen("pink",10);
        pen2.type="ballpoint";
        pen2.Info();
        pen2.type();
    }
}


//new : memory ke ander ke jagha ban jayega waha per aapna object jaakar store hogaye ga.

//contructor never return anything, they are called only once when object is created 