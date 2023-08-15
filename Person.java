public class Person{
    public String name;
    public String address;
    public String phone;
    public Person(String newName, String address, String phone){
        this.name = newName;
        this.address = address;
        this.phone = phone;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public String toString(){
        return "Name: " + getName() + ", Address: " + getAddress() + ", Phone: " + getPhone();
    }
}