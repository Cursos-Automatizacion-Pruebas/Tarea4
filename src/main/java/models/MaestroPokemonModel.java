package models;

import com.github.javafaker.Faker;

public class MaestroPokemonModel {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final double peso;
    private final String pais;
    private final String email;
    private final boolean esHombre;


    public MaestroPokemonModel() {
        var faker = new Faker();
        nombre = faker.name().firstName();
        apellido = faker.name().lastName();
        edad = faker.number().randomDigitNotZero();
        peso = faker.random().nextDouble();
        pais = faker.address().country();
        email = faker.internet().emailAddress();
        esHombre=faker.bool().bool();
    }

}
