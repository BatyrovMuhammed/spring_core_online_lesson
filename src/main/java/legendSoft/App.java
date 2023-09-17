package legendSoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        Teacher teacher1 = new JavaStudent();
//
//        Teacher teacher2 = new JsStudent();
//
//        teacher1.code();
//        teacher1.speed();
//        System.out.println(" ");
//        teacher2.code();
//        teacher2.speed();

//        Teacher teacher = new JsStudent();
//
//        PythonStudent pythonStudent = new PythonStudent(
//                "Asan",18,"asan@gmail.com","+996777552244",teacher);
//

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        PythonStudent pythonStudent = context.getBean("myPythonStudent", PythonStudent.class);
        System.out.println(pythonStudent.getName());
        System.out.println(pythonStudent.getAge());
        System.out.println(pythonStudent.getEmail());
        System.out.println(pythonStudent.getPhoneNumber());
        pythonStudent.teacher.code();
        pythonStudent.teacher.speed();
        context.close();


    }
}
