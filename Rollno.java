  class Student
{
    void getData(int rollno)
    {
        System.out.println("Rollno:"+rollno);
    }
}
  class Rollno
{
    public static void main(String args[])
    {
     Student st=new Student();
     st.getData(20);   
    }
}