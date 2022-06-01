import java.io.Serializable;
import java.util.Comparator;

public class Student implements Serializable {
    int id;
    String name;
    String age;
    String sex;
    String address;
    String average;

    public Student() {
    }

    public Student(int id, String name, String age, String sex, String address, String average) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.average = average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", average=" + average +
                '}';
    }
    public String write(){
        return id + "," + name + "," +age + "," +sex + "," +address+ "," +average;
    }




    static class Up implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getId()> o2.getId()){
                return 1;
            }
            else {return -1;}
        }
    }
    static class Down implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getId()< o2.getId()){
                return 1;
            }
            else {
                return -1;
            }
        }
    }

}
