import java.util.Scanner;
abstract class Person{
    protected String name;
    protected int age;
    protected String city;
    Person(){
        name="\0";
        age=0;
        city="\0";
    }
    Person(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    Person(Person p){
        this.name=p.name;
        this.age=p.age;
        this.city=p.city;
    }
}
class Student extends Person{
    static int student_count;
    int regno;
    float cgpa;
    int no_of_projects;
    double Eff;
    Student(){
        super();
        cgpa=0;
        no_of_projects=0;
        Eff=0;
    }
    Student(String name,String city,int age,float cgpa,int no_of_projects){
        super(name,age,city);
        regno=student_count+1;
        student_count++;
        this.no_of_projects=no_of_projects;
        this.cgpa=cgpa;
        Eff=cgpa*no_of_projects;
    }
    Student(Student s){
        super(s.name,s.age,s.city);
        this.no_of_projects=s.no_of_projects;
        this.cgpa=s.cgpa;
        Eff=s.cgpa*s.no_of_projects;
    }
    Student SOTY(Student[] list){
        Student Topper=new Student(list[0]);
        System.out.println(""+student_count);
        for(int i=0;i<student_count;i++){
            if(list[i].Eff>Topper.Eff){
                Topper=new Student(list[i]);
            }
        }
        return Topper;
    }
    public String toString(){
            return "\nStudent\n"+"\nName :"+super.name+"\nAge :"+super.age+"\nCity :"+super.city+"\nReg no"+regno+"\nCGPA :"+cgpa+"\nProjects :"+no_of_projects+"\nEfficiency Points :"+Eff;
    }
}
class Faculty extends Person{
    int no_of_pub;
    int no_of_patents;
    double Eff;
    static int fac_count;
    Faculty(){
        super();
        no_of_pub=0;
        no_of_patents=0;
        Eff=0;
    }
    Faculty(String name,String city,int age,int no_of_pub,int no_of_patents){
        super(name,age,city);
        this.no_of_patents=no_of_patents;
        this.no_of_pub=no_of_pub;
        Eff=no_of_patents*no_of_pub;
        fac_count++;
    }
    Faculty(Faculty f){
        super(f.name,f.age,f.city);
        no_of_patents=f.no_of_patents;
        no_of_pub=f.no_of_pub;
        Eff=f.no_of_patents*f.no_of_pub;
    }
    Faculty FOTY(Faculty[] list){
        Faculty Topper=new Faculty(list[0]);
        System.out.println(""+fac_count);
        for(int i=0;i<fac_count;i++){
            if(list[i].Eff>Topper.Eff){
                Topper=new Faculty(list[i]);
            }
        }
        return Topper;
    }
    public String toString(){
        return "\nFaculty\n"+"\nName :"+super.name+"\nAge :"+super.age+"\nCity :"+super.city+"\nNo. of Publications :"+no_of_pub+"\nNo. of patents :"+no_of_patents+"\nEfficiency Points :"+Eff;
    }
}

class PersonDemo {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int ns,nt,op;
        System.out.println("Enter no. of students :");
        ns=scan.nextInt();
        System.out.println("Enter no. of faculty :");
        nt=scan.nextInt();
        Student[] lists=new Student[ns];
        Faculty[] listf=new Faculty[nt];
        for(int i=0;i<ns;i++){
            System.out.println("Enter name,city,age,cgpa and no. of projects done by student "+(i+1)+" :");
            lists[i]=new Student(scan.next(),scan.next(),scan.nextInt(),scan.nextFloat(),scan.nextInt());
            System.out.println("Student added successfully to database");
        }
        for(int j=0;j<nt;j++){
            System.out.println("Enter name,city,age,No. of publications and projects by faculty "+(j+1)+" :");
            listf[j]=new Faculty(scan.next(),scan.next(),scan.nextInt(),scan.nextInt(),scan.nextInt());
            System.out.println("Faculty details added successfully to database");
        }
        do{
            System.out.println("Enter option  (Student->2,faculty->1):");
            int opt;
            opt=scan.nextInt();
            switch(opt){
                case 1: for(int i=0;i<nt;i++){
                            System.out.println(""+listf[i]+"\n");    
                        }
                        System.out.println("Faculty of the year is"+listf[0].FOTY(listf));
                        break;
                case 2: for(int i=0;i<ns;i++){
                            System.out.println(""+lists[i]+"\n");
                        }
                        System.out.println("Student of the Year is"+lists[0].SOTY(lists));
                        break;
                default: System.out.println("Invalid choice, choose either 1 or 2.");
            }
            System.out.println("Do you want to continue ?(1 to continue)");
            op=scan.nextInt();
        }while(op==1);
        scan.close();
    }

}
