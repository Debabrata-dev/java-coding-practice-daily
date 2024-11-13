class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
}

public class Mainclass1 {
    
    public static void main(String[] args) {
        MyEmployee obj=new MyEmployee();
         obj.setName("DONKEY DONKEY");
         System.out.println(obj.getName());
         obj.setId(676);
         System.out.println(obj.getId()); 
    }
}
