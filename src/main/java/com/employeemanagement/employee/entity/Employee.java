package com.employeemanagement.employee.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Employee {
@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;
    public String firstName;
    public String lastName;
    public String email;
   
 
    public Employee() {
}
 
public Employee(Long id, String firstName, String lastName, String email) {
this.id = id;
this.firstName = firstName;
this.lastName = lastName;
this.email = email;
}
 
public Long getId() {
return id;
}
 
public void setId(Long id) {
this.id = id;
}
 
public String getfirstName() {
return firstName;
}
 
public void setfirstName(String firstName) {
this.firstName = firstName;;
}
 
public String getlastName() {
return lastName;
}
 
public void setlastName(String lastName) {
this.lastName = lastName;
}
 
public String getemail() {
return email;
}
 
public void setemail(String email) {
this.email = email;
}
 
@Override
public String toString() {
return "Employee [id=" + id + ", firstName;=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
}
}