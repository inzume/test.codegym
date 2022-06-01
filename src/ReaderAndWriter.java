import java.io.*;
import java.util.ArrayList;

class ReaderAndWriter {
    public void write(ArrayList<Student> students) {
        File file = new File("students.csv");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.err.println("IOException!");
        }
    }
    public ArrayList<Student> reader() {
        File file = new File("students.csv");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Student>) objectInputStream.readObject();
        } catch (IOException e) {
            System.err.println("File not found");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }
}
