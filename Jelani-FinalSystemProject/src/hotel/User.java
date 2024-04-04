/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author ACER NITRO 5
 */
public class User {
    private String name, gender, municipality, province, street, baranggay;
    private int contactno, age, idcustomer, idlogin;
    private String username, password, email;

    public String getBaranggay() {
        return baranggay;
    }

    public void setBaranggay(String baranggay) {
        this.baranggay = baranggay;
    }
    
    
    
    public int getCustomer_id() {
        return idcustomer;
    }

    public void setCustomer_id(int idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMunicipality() {
        return municipality;
    }

    public String getProvince() {
        return province;
    }

    public String getStreet() {
        return street;
    }

    public int getContactno() {
        return contactno;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setContactno(int contactno) {
        this.contactno = contactno;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdlogin() {
        return idlogin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
