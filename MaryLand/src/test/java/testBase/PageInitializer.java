package testBase;


import pages.*;

public class PageInitializer extends BaseClass {
    public static LoginPage loginPage;
    public static DashBoardpage dashboardPage;
    public static SkillsPage skillsPage;
    public static AddEmployeeDetailsEmergensyContactsPage addEmployeeDetailsEmergensyContactsPage;
    public static AddEmployeeEmergencyContactPage addEmployeeEmergencyContactPage;
    public static ConfirmationEmployeeEmergencyContactPage confirmationEmployeeEmergencyContactPage;
    public static EmployeeEmergencyContactsPage employeeEmergencyContactsPage;
    public static EmployeeQuificationPage employeeQuificationPage;
    public static LicensePage licensePage;
    public static PersonalDetailsPage personalDetailsPage;
    public static PIMemployeeListPage piMemployeeListPage;
    public static PIMpage pimpage;





    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashBoardpage();
        skillsPage=new SkillsPage();
        addEmployeeDetailsEmergensyContactsPage = new AddEmployeeDetailsEmergensyContactsPage();
        addEmployeeEmergencyContactPage =new AddEmployeeEmergencyContactPage();
        confirmationEmployeeEmergencyContactPage=new ConfirmationEmployeeEmergencyContactPage();
        employeeEmergencyContactsPage =new EmployeeEmergencyContactsPage();
        employeeQuificationPage = new EmployeeQuificationPage();
        licensePage = new LicensePage();
        personalDetailsPage = new PersonalDetailsPage();
        piMemployeeListPage = new PIMemployeeListPage();
        pimpage = new PIMpage();

    }
}
