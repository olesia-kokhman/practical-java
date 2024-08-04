class Person {
    protected String childIDNumber;
    int age;
    String healthInfo;
    String name;
    
    public Person(int age, String healthInfo, String name, String childIDNumber) {
        this.age = age;
        this.healthInfo = healthInfo;
        this.name = name;
        this.childIDNumber = childIDNumber;
    };
    
     public Person(int age, String healthInfo, String name) {
        this.age = age;
        this.healthInfo = healthInfo;
        this.name = name;
    };
    
    public Person() {};
    
    public String getHealthStatus() {
        return name + " " + healthInfo;
    };
    
}

class Child extends Person {
    
    private String childIDNumber;
    
    public Child(int age, String healthInfo, String name, String childIDNumber) {
        super(age, healthInfo, name, childIDNumber);
    };
    
    public Child(int age, String healthInfo, String name) {
        super(age, healthInfo, name);
    };
    
}

class Adult extends Child {
    private String passportNumber;
    
    public Adult(int age, String healthInfo, String name, String passportNumber) {
        super(age, healthInfo, name);
        this.passportNumber = passportNumber;
    };
}