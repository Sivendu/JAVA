class SuperParent
{
    int rollno;
    SuperParent(int rno)
    {
        rollno=rno;
    }
}
class SuperChild extends SuperParent
{
    String name;
    SuperChild(int rno,String name1)
    {
        super(rno);
        name=name1;
    }
    void display()
    {
        System.out.println("Rollno:"+rollno);
        System.out.println("Name:"+name);
    }
}
class SuperDemo 
{
    public static void main(String[] args)
    {
        SuperChild ob=new SuperChild(35,"Malu");
        ob.display();
    }
}
