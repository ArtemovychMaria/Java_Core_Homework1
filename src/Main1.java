import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) throws IOException {

        List<String> bookList=new ArrayList();

        Class<Book> bookClass = Book.class;

        Field[] fields = bookClass.getDeclaredFields();
        for (Field field:fields) {
            if (field.getAnnotation(BookAnnotation.class) instanceof BookAnnotation) {
                bookList.add("Field" + field.getName() + "with type" + field.getType().getSimpleName() + "has annotation BookAnnotaton with value" + field.getAnnotation(BookAnnotation.class).value());
            }
        }

        File file=new File("BookAnnotation.txt");
        writeToFile(file,bookList);

    }

    private static void writeToFile(File file,Object object) throws IOException {
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }
}
