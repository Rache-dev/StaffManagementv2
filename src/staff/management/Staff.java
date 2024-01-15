package staff.management;

import java.time.LocalDate;

public class Staff {
    private String username;
    private String email;
    private int year;
    private String Department;
    private LocalDate date;

    public Staff( String username, String email,int year, String Department, LocalDate date){
        this.username = username;
        this.email = email;
        this.year = year;
        this.Department = Department;
        this.date = date;
    }

    //getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
