
enum Status{
    Running , Failed , Pending, Success, NoIdea;
}

public class EnumDemo{
    public static void main(String args[]){
        
        Status s = Status.NoIdea;
        System.out.println(s);
        System.out.println(s.ordinal());
        // System.out.println(Status.values()[0]);
        for (Status ss : Status.values()){
            System.out.println(ss + " : " + ss.ordinal());
        }
    }
}