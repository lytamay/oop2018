package week1;

public class Student {

    private String name , id,group, email; // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName (String n){
        return n;
    }
    public void setName(String n){
        name=n
    }
    public void setId(String id){
        id=id;
    }
    public String getId(String id){
        return id;   
    }
    public void setId(String Group ){
        group=Group;
    }
    public String getId(String Group){
        return  Group;
    }
    public void setId(String Email){
        email=Email;
    }
    public String getId(String Email){
        return Email;   
    }
    public Student(){
         name = “Student”; id=“000”; group=“INT22041”; email=”uet@vnu.edu.vn”;
    }
    public Student(String n, String sid, String em){
        name =n;
        id=sid;
        email=em;
         group= “INT22041”
    }
    public Student(Student s)
    {
        name=s.name;
        id=s.id;
        group=s.group;
        email=s.email;
    }
    /**
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        Student studen= Student();
        System.out.println("TenSV: "+studen.name);
        System.out.println("ma so sv: "+studen.id);
        System.out.println("lop: "+studen.group);
        System.out.println("Email: "+studen.email);   
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
public class  StudentManagement(){
    public static void main(String[] args){
        Student student1= new Student();
        student1.setName("ly ta may");
        student1.setId("17020887");
        student1.setGroup("IE");
        Student student2= new Student();
        student2.Student("nguyen qunag thang","56121","quangthang.com");
        student1.setEmail("lytamay@gmail.com");
        System.out.println("Ten sv la: "+ student1.getName());
        System.out.println("Thong tin sv la : "+student1.getInfo());
        System.out.println("thong tin sv : "+student1.Student());
         System.out.println("thong tin sv : "+student1.Student("ho thi dung","1451142124"),"hothidung.com");
        System.out.println("thong tin sv a: "+student1.Student(student2));
        public boolean sameGroup(Student s1,Student s2){
           if(student1.getGroup()==student2.getGroup()}
              {
                  System.out.println("cung lop");
              }
              else System.out.println("Khong cung lop");
        }
         Student student2= new Student();
         Student student2= new Student();
         Student student2= new Student();
          
