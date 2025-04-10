class Student_management {

    public String name;
    public String regNo;
    public String email;
    public String branch;
    public String dob;
    public int phone;
    public String marks;
    public String type;

    Student_management(String data) {
        String[] info = data.split(",");
        name = info[0];
        regNo = info[1];
        email = info[2];
        branch = info[3];
        dob = info[4];
        phone = Integer.parseInt(info[5]);
        marks = info[6];
        type = info[7];
    }

    void showDetails() {
        System.out.println("Student Name :" + name);
        System.out.println("RegNumber : " + regNo);
        System.out.println("Email ID : " + email);
        System.out.println("Branch :" + branch);
        System.out.println("Date-of-birth :" + dob);
        System.out.println("Mobile : " + phone);
        System.out.println("Mark: " + marks);
        System.out.println("Stduent Type :" + type);
    }

    public static void main(String[] args) {
        String[] rawStudents = args[0].split("_");

        for (int i = 0; i < rawStudents.length; i++) {
            Student s = new Student(rawStudents[i]);
            s.showDetails();
            System.out.println("===============");
        }
    }
}

