package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;

import static org.example.ParseToJSON.pojoToJsonString;
import static org.example.ParseToObject.JsonToPojo;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        Client client = new Client("Максим", "kutakovnax@gmail.com", "89999999999");
        System.out.println(pojoToJsonString(client)); //вывод объекта Client в виде JSON
        System.out.println(JsonToPojo(client).toString()); //вывод всех данных из JSON

        /*
        Вывод в консоль:
        {"name":"Максим","email":"kutakovnax@gmail.com","phone":"89999999999"}
        Name: Максим
        Email: kutakovnax@gmail.com
        Phone: 89999999999
         */
    }
}