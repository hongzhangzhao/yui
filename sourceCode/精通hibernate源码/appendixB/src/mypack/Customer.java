package mypack;

public class Customer {
    private Long id;
    private String name;
    private int age;

    /** �����Ĺ��췽��*/
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** Ĭ�Ϲ��췽��*/
    public Customer() {}

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
