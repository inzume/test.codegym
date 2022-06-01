import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManageStudent  {
    ReaderAndWriter readerAndWriter = new ReaderAndWriter();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new  ArrayList();


    public ManageStudent() {
       students= readerAndWriter.reader();

    }

    public void menu(){

        System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ---");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1 xem danh sách sinh viên");
        System.out.println("2 thêm mới");
        System.out.println("3 cập nhật");
        System.out.println("4 xóa");
        System.out.println("5 sắp xếp");
        System.out.println("6 đọc từ file");
        System.out.println("7 ghi vào file");
        System.out.println("8 thoát");
        System.out.print("chọn chức năng:");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1: showStudent();
            break;
            case 2: addStudent();
            break;
            case 3:repair();
            break;
            case 4:delete();
            break;
            case 5:calculate();
            break;
            case 6:readFile();
            break;
            case 7:writeFile();
            break;

        }
    }
    public void showStudent() {
        try {
            for (Student s:students
                 ) {
                System.out.println(s);
            }
        }catch (Exception e){
            System.out.println("chưa có phần tử trong mảng");
            addStudent();
        }

        }

    public Student create(){
        System.out.println("thêm mới");
        System.out.println("1 Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("2 Nhập Họ và tên");
        String name = scanner.nextLine();
        System.out.println("3 Nhập Tuổi");
        String age = scanner.nextLine();
        System.out.println("4 Nhập Giới tính");
        String sex = scanner.nextLine();
        System.out.println("5 Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("6 Nhập điểm trung bình");
        String average = scanner.nextLine();
return new Student(id,name,age,sex,address,average);
    }
    public void addStudent(){
        students.add(create());
        readerAndWriter.write(students);

    }
    public void repair(){

        System.out.println("Bạn có muốn sua khong");
        System.out.println("chọn 1 để sua");
        System.out.println("chọn 2 để hủy");
        int choice = Integer.parseInt(scanner.nextLine());
      switch (choice){
          case 1: System.out.println("Nhập id cần sua");

              for (int i = 0; i < students.size(); i++) {
                  int id = Integer.parseInt(scanner.nextLine());
                  if (students.get(i).getId() == id){
                      students.set(i,create());
                  }
                  else {
                      System.out.println("khong ton tai");
                  }
              }

          case 2:
              break;


      }
    }
    public void delete(){
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <students.size(); i++) {
            if (students.get(i).id == id){
                students.remove(i);
            }

        }

    }
    public void calculate(){
        System.out.println("1 Sắp xếp từ trên xuống");
        System.out.println("2 Sắp xếp từ dưới lên");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                students.sort(new Student.Up());
                for (Student s:students) {
                    System.out.println(s);
                }
                break;
            case 2:
                students.sort(new Student.Down());
                for(Student s:students){
                    System.out.println(s);
                }
                break;

        }

    }
    public void readFile(){
        students=readerAndWriter.reader();

    }
    public void writeFile(){
        readerAndWriter.write(students);
    }
}

