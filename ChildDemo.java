class Parent
{
    int pid;
    Parent(int id)
    {
        pid=id;
    }
}
class Child extends Parent
{
    String course;
    Child(int pid,String course1)
    {
        super(pid);
        course=course1;
    }
    void putdata()
    {
        System.out.println("ParentID:"+pid);
        System.out.println("Course:"+course);
    }
}
class ChildDemo 
{
    public static void main(String[] args)
    {
        Child ob=new Child(35,"MCA");
        ob.putdata();
    }
}
