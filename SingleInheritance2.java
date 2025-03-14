class InheritanceDemo
{
    int id=35;
    String name="Malu";
}
class ChildInheritance extends InheritanceDemo
{
    int age=22;
    void putdata()
    {
        System.out.println("ID"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class SingleInheritance2 
{
    public static void main(String[] args) 
    {
        ChildInheritance ob=new ChildInheritance();
        ob.putdata();
    }  
}
