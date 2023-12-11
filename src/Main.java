// Creacion de la clase de Nivel 1
class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

// creacion de la herencia al Nivel 2
class Mamifero extends Animal {
    protected int numeroPatas;
    protected String tipoPelaje;

    public Mamifero(String nombre, int edad, int numeroPatas, String tipoPelaje) {
        super(nombre, edad);
        this.numeroPatas = numeroPatas;
        this.tipoPelaje = tipoPelaje;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }
}

class Ave extends Animal {
    protected String tipoPlumaje;
    protected boolean habilidadVuelo;

    public Ave(String nombre, int edad, String tipoPlumaje, boolean habilidadVuelo) {
        super(nombre, edad);
        this.tipoPlumaje = tipoPlumaje;
        this.habilidadVuelo = habilidadVuelo;
    }

    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    public boolean puedeVolar() {
        return habilidadVuelo;
    }
}

// creacion del Nivel 3
class Felino extends Mamifero {
    protected int longitudCola;
    protected String tipoCaza;

    public Felino(String nombre, int edad, int numeroPatas, String tipoPelaje, int longitudCola, String tipoCaza) {
        super(nombre, edad, numeroPatas, tipoPelaje);
        this.longitudCola = longitudCola;
        this.tipoCaza = tipoCaza;
    }

    public int getLongitudCola() {
        return longitudCola;
    }

    public String getTipoCaza() {
        return tipoCaza;
    }
}

class Canido extends Mamifero {
    protected String raza;
    protected boolean habilidadOlfato;

    public Canido(String nombre, int edad, int numeroPatas, String tipoPelaje, String raza, boolean habilidadOlfato) {
        super(nombre, edad, numeroPatas, tipoPelaje);
        this.raza = raza;
        this.habilidadOlfato = habilidadOlfato;
    }

    public String getRaza() {
        return raza;
    }

    public boolean tieneBuenOlfato() {
        return habilidadOlfato;
    }
}

// creacion del Nivel 4
class Leon extends Felino {
    protected String melena;
    protected String territorioCaza;

    public Leon(String nombre, int edad, int numeroPatas, String tipoPelaje, int longitudCola, String tipoCaza,
                String melena, String territorioCaza) {
        super(nombre, edad, numeroPatas, tipoPelaje, longitudCola, tipoCaza);
        this.melena = melena;
        this.territorioCaza = territorioCaza;
    }

    public String getMelena() {
        return melena;
    }

    public String getTerritorioCaza() {
        return territorioCaza;
    }
}

class Perro extends Canido {
    protected String colorPelaje;
    protected String tamano;

    public Perro(String nombre, int edad, int numeroPatas, String tipoPelaje, String raza, boolean habilidadOlfato,
                 String colorPelaje, String tamano) {
        super(nombre, edad, numeroPatas, tipoPelaje, raza, habilidadOlfato);
        this.colorPelaje = colorPelaje;
        this.tamano = tamano;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public String getTamano() {
        return tamano;
    }
}

// creacion del Nivel 5
class GatoDomestico extends Felino {
    protected String comportamientoDomestico;
    protected String raza;

    public GatoDomestico(String nombre, int edad, int numeroPatas, String tipoPelaje, int longitudCola, String tipoCaza,
                         String comportamientoDomestico, String raza) {
        super(nombre, edad, numeroPatas, tipoPelaje, longitudCola, tipoCaza);
        this.comportamientoDomestico = comportamientoDomestico;
        this.raza = raza;
    }

    public String getComportamientoDomestico() {
        return comportamientoDomestico;
    }
}

class LabradorRetriever extends Perro {
    protected boolean habilidadNadar;
    protected String personalidad;

    public LabradorRetriever(String nombre, int edad, int numeroPatas, String tipoPelaje, String raza, boolean habilidadOlfato,
                             String colorPelaje, String tamano, boolean habilidadNadar, String personalidad) {
        super(nombre, edad, numeroPatas, tipoPelaje, raza, habilidadOlfato, colorPelaje, tamano);
        this.habilidadNadar = habilidadNadar;
        this.personalidad = personalidad;
    }

    public boolean puedeNadar() {
        return habilidadNadar;
    }

    public String getPersonalidad() {
        return personalidad;
    }
}
public class Main {
    public static void main(String[] args) {
        // Nivel 1
        Animal animal = new Animal("AnimalGenerico", 5);
        System.out.println("Animal - Nombre: " + animal.getNombre() + ", Edad: " + animal.getEdad());

        // Nivel 2
        Mamifero mamifero = new Mamifero("Tigre", 8, 4, "Rayado");
        System.out.println("Mamífero - Nombre: " + mamifero.getNombre() + ", Edad: " + mamifero.getEdad() +
                ", Patas: " + mamifero.getNumeroPatas() + ", Pelaje: " + mamifero.getTipoPelaje());

        Ave ave = new Ave("Águila", 3, "Dorado", true);
        System.out.println("Ave - Nombre: " + ave.getNombre() + ", Edad: " + ave.getEdad() +
                ", Plumaje: " + ave.getTipoPlumaje() + ", Puede Volar: " + ave.puedeVolar());

        // Nivel 3
        Felino felino = new Felino("Leopardo", 6, 4, "Manchado", 1, "Carnívoro");
        System.out.println("Felino - Nombre: " + felino.getNombre() + ", Edad: " + felino.getEdad() +
                ", Patas: " + felino.getNumeroPatas() + ", Pelaje: " + felino.getTipoPelaje() +
                ", Cola: " + felino.getLongitudCola() + ", Tipo de Caza: " + felino.getTipoCaza());

        Canido canido = new Canido("Lobo", 7, 4, "Gris", "Gris", true);
        System.out.println("Canido - Nombre: " + canido.getNombre() + ", Edad: " + canido.getEdad() +
                ", Patas: " + canido.getNumeroPatas() + ", Pelaje: " + canido.getTipoPelaje() +
                ", Raza: " + canido.getRaza() + ", Buen Olfato: " + canido.tieneBuenOlfato());

        // Nivel 4
        Leon leon = new Leon("Simba", 10, 4, "Dorado", 1, "Carnívoro", "Melena Exuberante", "Sabana");
        System.out.println("León - Nombre: " + leon.getNombre() + ", Edad: " + leon.getEdad() +
                ", Patas: " + leon.getNumeroPatas() + ", Pelaje: " + leon.getTipoPelaje() +
                ", Cola: " + leon.getLongitudCola() + ", Tipo de Caza: " + leon.getTipoCaza() +
                ", Melena: " + leon.getMelena() + ", Territorio de Caza: " + leon.getTerritorioCaza());

        Perro perro = new Perro("Buddy", 4, 4, "Negro", "Labrador", true, "Café", "Mediano");
        System.out.println("Perro - Nombre: " + perro.getNombre() + ", Edad: " + perro.getEdad() +
                ", Patas: " + perro.getNumeroPatas() + ", Pelaje: " + perro.getTipoPelaje() +
                ", Raza: " + perro.getRaza() + ", Buen Olfato: " + perro.tieneBuenOlfato() +
                ", Color de Pelaje: " + perro.getColorPelaje() + ", Tamaño: " + perro.getTamano());

        // Nivel 5
        GatoDomestico gatoDomestico = new GatoDomestico("Whiskers", 2, 4, "Atigrado", 0, "Caza con Juguetes",
                "Doméstico", "Siamés");
        System.out.println("Gato Doméstico - Nombre: " + gatoDomestico.getNombre() + ", Edad: " + gatoDomestico.getEdad() +
                ", Patas: " + gatoDomestico.getNumeroPatas() + ", Pelaje: " + gatoDomestico.getTipoPelaje() +
                ", Cola: " + gatoDomestico.getLongitudCola() + ", Tipo de Caza: " + gatoDomestico.getTipoCaza() +
                ", Comportamiento Doméstico: " + gatoDomestico.getComportamientoDomestico() +
                ", Raza: " + gatoDomestico.raza);

        LabradorRetriever labrador = new LabradorRetriever("Max", 3, 4, "Dorado", "Labrador", true, "Amarillo", "Grande",
                true, "Amigable");
        System.out.println("Labrador Retriever - Nombre: " + labrador.getNombre() + ", Edad: " + labrador.getEdad() +
                ", Patas: " + labrador.getNumeroPatas() + ", Pelaje: " + labrador.getTipoPelaje() +
                ", Raza: " + labrador.getRaza() + ", Buen Olfato: " + labrador.tieneBuenOlfato() +
                ", Color de Pelaje: " + labrador.getColorPelaje() + ", Tamaño: " + labrador.getTamano() +
                ", Puede Nadar: " + labrador.puedeNadar() + ", Personalidad: " + labrador.getPersonalidad());
    }
}
