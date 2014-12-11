class Person
{
    private String name;
    private String idStr;
    public Person() {}
    public Person(String name, String idStr)
    {
        this.name = name;
        this.idStr = idStr;
    }
    public String getIdStr()
    {
        return idStr;
    }
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == Person.class) {
            Person personObj = (Person)obj;
            if (this.getIdStr().equals(personObj.getIdStr())) {
                return true;
            }
        }
        return false;
    }
}

public class OverrideEqualsRight
{
    public static void main(String [] args)
    {
        Person p1 = new Person("孙悟空", "12343433433");
        Person p2 = new Person("孙行者", "12343433433");
        Person p3 = new Person("孙悟饭", "9992939");
        System.out.println("p1 equals p2?" + p1.equals(p2));
        System.out.println("P2 equals p3?" + p2.equals(p3));
    }
}

/*
output:
p1 equals p2?true
P2 equals p3?fals
*/

