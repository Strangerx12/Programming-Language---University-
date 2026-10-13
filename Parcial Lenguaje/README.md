 Sistema de Gestión Académica (POO en Java)

Proyecto desarrollado en **Java** bajo los principios de la **Programación Orientada a Objetos (POO)**. Este sistema modela una jerarquía académica basada en una clase abstracta `Persona` de la cual heredan las clases `Estudiante` y `Profesor`, incorporando interacción mediante consola con `Scanner`.



Estructura de Carpetas del Proyecto

El proyecto se encuentra organizado en paquetes dentro del directorio `src` para garantizar una separación limpia de responsabilidades (Arquitectura en capas/paquetes):

```text
MiProyectoPOO/
├── src/
│   ├── modelo/
│   │   ├── Persona.java      # Clase abstracta principal
│   │   ├── Estudiante.java   # Clase derivada que hereda de Persona
│   │   └── Profesor.java     # Clase derivada que hereda de Persona
│   └── main/
│       └── Main.java         # Clase principal con lógica de ejecución e interfaz Scanner
└── README.md                 # Documentación del proyecto
