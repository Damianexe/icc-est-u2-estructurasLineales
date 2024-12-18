package Materia.Models;

public class Contact <T,U>{
    private T name;
    private U phone;
    
    //Construvtorres
    public Contact(T name, U phone) {
        this.name = name;
        this.phone = phone;
    }

    // getters and setters
    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getPhone() {
        return phone;
    }

    public void setPhone(U phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", phone=" + phone + "]";
    }

    


}
