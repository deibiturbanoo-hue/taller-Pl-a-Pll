 ```mermaid
classDiagram
    class Persona {
        -String nombre
        -Date fechaNacimiento
        +getNombre() String
        +getFechaNacimiento() Date
        +setFechaNacimiento(Date) void
        +calcularEdad() int
    }

    class Vehiculo {
        -String marca
        -String modelo
        -String placa
        -int anioFabricacion
        +encender() void
        +apagar() void
    }

    Persona "1" --> "0..*" Vehiculo : posee
```