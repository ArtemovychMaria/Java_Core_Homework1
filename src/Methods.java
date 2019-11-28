import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Methods {


    public static void serelize(File file,Object object) throws IOException {
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(object);}

    public static void deserelize(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
        Object o = objectInputStream.readObject();
        System.out.println(o);

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee=new Employee("Mariia",1,15000);

        File file=new File("Employee.txt");

        File file1=new File("ListSerelize.txt");

        serelize(file,employee);

        deserelize(file);


        List<Employee>employeeList=new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(new Employee("Ivan",2,13000));
        employeeList.add(new Employee("Igor",3,2000));
        employeeList.add(new Employee("Anna",4,35000));

        serelize(file1,employeeList);
        deserelize(file1);
    }
}
