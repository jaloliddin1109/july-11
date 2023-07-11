package uz.pdp.springframeworkcore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    private String fullName;
    private int age;
    private List<String> nicknames = new ArrayList<>();
    private Map<String,String> nicknamesWithMap = new HashMap<>();

    private Person() {
    }

    public static Person getInstance(){
        System.out.println("Inside Factory method");
        return new Person();
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public Map<String, String> getNicknamesWithMap() {
        return nicknamesWithMap;
    }

    public void setNicknamesWithMap(Map<String, String> nicknamesWithMap) {
        this.nicknamesWithMap = nicknamesWithMap;
    }

    public void setNicknames(List<String> nicknames) {
        this.nicknames = nicknames;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", nicknames=" + nicknames +
                ", nicknamesWithMap=" + nicknamesWithMap +
                '}';
    }

    private void init() {
        System.out.println("(Person) ... Bean initialized");
    }

    private void destroy() {
        System.out.println("(Person) ... Bean destroyed");
    }
}
