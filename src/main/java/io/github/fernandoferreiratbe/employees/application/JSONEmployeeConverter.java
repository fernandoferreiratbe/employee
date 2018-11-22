package io.github.fernandoferreiratbe.employees.application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.github.fernandoferreiratbe.employees.domain.Employee;

import java.util.List;

public class JSONEmployeeConverter {
    private Gson gson;

    public JSONEmployeeConverter() {
        this.gson = new GsonBuilder().create();
    }

    public String toJSON(List<Employee> employees) {
        JsonArray jarray  = this.gson.toJsonTree(employees).getAsJsonArray();
        JsonObject jobject = new JsonObject();

        jobject.add("employees", jarray);

        return jobject.toString();
    }
}
