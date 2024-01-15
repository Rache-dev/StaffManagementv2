package staff.management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StaffManager {
    private List<Staff> staffList;

    public StaffManager() {
        this.staffList = new ArrayList<>();
    }

    public void addStaff(String username, String email, int year, String Department) {
        Staff newStaff = new Staff(username, email, year, Department,LocalDate.now());
        staffList.add(newStaff);
        System.out.println("Staff added successfully");
    }

    public void viewMembers() {
        if (staffList.isEmpty()) {
            System.out.println("No staff members found");
        } else {
            for (Staff staff : staffList) {
                System.out.println("Staff member details: \nName: "+staff.getUsername()+"\nEmail: "+staff.getEmail()+"\nYear: "+staff.getYear()+"\nDepartment: "+staff.getDepartment());
            }
        }
    }

    public void deleteMembers(String email) {
        staffList.removeIf(staff -> staff.getEmail().equals(email));
        System.out.println("Staff deleted successfully");
    }

}
