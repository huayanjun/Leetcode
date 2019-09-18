package leetcode;

/**
 * @Author :huayanjun
 * @Data: 2019/9/2 13:19
 */
public class Student {

    private static Student student;

    private Student(){

    }

    public static Student createStudent(){
        if(student==null)
           student =new Student();
        return student;
    }
}
