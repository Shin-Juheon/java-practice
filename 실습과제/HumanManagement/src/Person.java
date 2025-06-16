public class Person {
    protected String id;
    protected String name;
    protected String status;
    protected String brithDate;
    protected String contact;

    public Person()
    {
        id = "";
        name = "";
        status = "";
        brithDate = "";
        contact = "";
    }

    public Person(String id, String name, String status, String brithDate, String contact)
    {
        this.id = id;
        this.name = name;
        this.status = status;
        this.brithDate = brithDate;
        this.contact = contact;
    }

    public void printInfo()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
        System.out.println("Brith Date: " + brithDate);
        System.out.println("Contact: " + contact);
    }


}
