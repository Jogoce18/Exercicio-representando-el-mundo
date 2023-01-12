package org.example;
import java.util.ArrayList;
import java.util.List;
public class Curso {

    private String name;
    private String teacher;
    private String categoria;

    //contrutor
    public Curso( String name,String teacher,String categoria) {
        this.name = name;
        this.teacher = teacher;
        this.categoria = categoria;

    }

    //metodos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
