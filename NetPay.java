import java.util.Scanner;
public class NetPay
{
    int eid,TA,DA,HRA,Tax,netsal,basic;
    String ename;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Employee name,id,Basicpay,TA,DA,HRA,and Tax");
        ename=scan.nextLine();
        eid=scan.nextInt();
        basic=scan.nextInt();
        TA=scan.nextInt();
        DA=scan.nextInt();
        HRA=scan.nextInt();
        Tax=scan.nextInt();
    }
    void calc()
    {
        netsal=(basic+TA+DA+HRA)-Tax;
        System.out.println("Netsalary:"+netsal);
    }
    public static void main(String args[])
    {
        NetPay e1=new NetPay();
        e1.getdata();
        System.out.println("Employee detials");
        System.out.println("________________");
        System.out.println("Employee Id:"+e1.eid);
        System.out.println("Employee Name:"+e1.ename);
        e1.calc();

    }
}

