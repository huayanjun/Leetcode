package lambdatest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author :huayanjun
 * @Data: 2019/9/18 16:34
 */
public class PrintList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张三");
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张翠山");
        //找到所以姓张的
        List<String > zhanglist = new ArrayList<>();
        for(String s:list){
            if(s.startsWith("张")){
                zhanglist.add(s);
            }
        }
        //张里面3个字的人
        List<String> threeZhang =new ArrayList<>();
        for(String s :zhanglist){
            if(s.length()==3){
                threeZhang.add(s);
            }
        }

        for (String s:threeZhang){
            System.out.println(s);
        }

        System.out.println("=========================================");

        /**
         * 使用lambda表达式
         */
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s-> System.out.println(s));
        System.out.println("=========================================");
        //为每个元素加上你好
        list.stream().map(s -> s+"你好")
                .forEach(s -> System.out.println(s));


        Person person1  = new Person("张飞",21);
        Person person2  = new Person("刘备",23);
        Person person3  = new Person("关羽",22);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        System.out.println("=========================================");
        //将所有person类的姓名组成一个新的集合
        List<String> namelist = personList.stream().map(Person::getName).collect(Collectors.toList());
        for (String s:namelist){
            System.out.println(s);
        }
        System.out.println("=========================================");
        personList.stream().map(Person::getAge).forEach(integer -> System.out.println(integer));

    }
}
