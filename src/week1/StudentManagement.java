package week1;  	
   
public class StudentManagement {
    public static Student[] student = new Student[100];
    public static int n = 7;
    public static int m;

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup() == null || s2.getGroup() == null)
            return false;
        else
            return (s1.getGroup().equals(s2.getGroup()));
    }

   public static void studentsByGroup(){
	   m=0;
    	String arr[] = new String[100];
    	arr[0]=student[0].getGroup();
    	for(int i=1;i<7;i++) {
    		boolean kiemtra=true;
           for(int j=i-1;j>=0;j--) {
        	   if(student[i].getGroup().equals(student[j].getGroup())) {
        		   kiemtra =false;
        		   break;
        	   }
           }
           if(kiemtra==true) {
        	   arr[m]=student[i].getGroup();
        	   m++;
           }
    	}
    	int dem=0;
    	for(int i=0;i<m;i++) {
    		for(int j=1;j<7;j++) {
    			if(student[i].getGroup().equals(student[j].getGroup())) {
    				System.out.println(student[j].getName());
    				System.out.println(student[j].getId());
    				System.out.println(student[j].getGroup());
    				System.out.println(student[j].getEmail());
    				dem++;
    			}
    		}
    		
    	}
    	
    }
   
 
   
    public static void removeStudent(String id) {
        if (id == null) {
            System.out.println("Id khong co trong danh sach");
        }
        else {
            for (int i = 0; i < n; i++) {
            	
                if (student[i].getId().equals(id)) {
                  student[i]=student[i+1];
                }
            }
        }
    }
   

    public static void main(String[] args) {
        student[0] = new Student();
        System.out.println("Thong tin sinh vien la: ");
        student[0].setName("LY TA MAY");
        student[0].setId("17020887");
        student[0].setGroup("IE5");
        student[0].setEmail("lytamayya@gmail.com");
        System.out.println("Ten SV1: " + student[0].getName());
        student[0].getInfo();

        student[1] = new Student();
        student[1].getInfo();

        student[2] = new Student("Nguyen Quang Thang", "11165121", "Quangthang.com");
        student[2].getInfo();

        student[3] = new Student(student[0]);
        student[3].getInfo();

        student[4] = new Student("Nguyen Duc Manh", "14121541", "manh.com");
        student[4].getInfo();
        student[5]=new Student("HO thi dung", "17020587", "k63", "hodung.com");
        student[5].getInfo();
        student[6]=new Student("Vu Thuy Duong", "17020555", "k63", "duong.com");
        student[6].getInfo();
        System.out.println("Danh sach sinh vien sau khi sap  xep la: ");
        studentsByGroup();

        if (sameGroup(student[5],student[6]))
           System.out.println(student[5].getName()+" cung lop voi "+student[6].getName());
        else
            System.out.println(student[5].getName()+" khong cung lop voi "+student[6].getName());

        removeStudent("17020887");
        
        System.out.println();
        System.out.println("Danh sach sinh vien sau khi tim kiem la: ");
        studentsByGroup();
    }
}
