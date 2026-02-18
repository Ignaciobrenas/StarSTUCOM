# 🖖 StarTucom Census App

<div align="center">

![Star Trek GIF](https://media.giphy.com/media/3ohs7KViF6rA4aan5u/giphy.gif)

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)](https://netbeans.apache.org/)
[![MVC](https://img.shields.io/badge/Pattern-MVC-blueviolet?style=for-the-badge)](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)
[![OOP](https://img.shields.io/badge/OOP-Herencia%20%26%20Polimorfismo-success?style=for-the-badge)](https://en.wikipedia.org/wiki/Inheritance_(object-oriented_programming))

> *"Space: the final frontier..."* — El rey **Kert Rats** del multiverso StarTucom necesita censar a su pueblo. ¡Y tú eres el encargado!

</div>

---

## 🌌 ¿Qué es esto?

Aplicación de consola en **Java** para gestionar el censo de planetas y seres del multiverso **StarTucom**. Desarrollada con patrón **Modelo-Vista-Controlador**, herencia y polimorfismo.

Práctica de **M03 Programación · UF4** — DAW · STUCOM

---

## 👾 Especies del multiverso

| Especie | Nivel Civ. | Característica especial |
|---------|-----------|------------------------|
| 🧑 **Humano** | I | Edad (0-130) y género |
| 🖖 **Vulcaniano** | III | Índice de meditación (0-10) |
| 🔵 **Andoriano** | II | Rango + puede ser Aenar |
| ✨ **Nibiriano** | II | Vegetariano o come peces |
| ⚔️ **Klingon** | III | Nivel de fuerza (50-350) |
| 💰 **Ferengi** | I | Cantidad de Latinum |

---

## ⚠️ Reglas de convivencia

```
🧑 Humanos        →  Pueden vivir en CUALQUIER planeta
🖖 Vulcanianos    →  NO pueden coincidir con Andorianos
🔵 Andorianos     →  NO pueden coincidir con Vulcanianos
⚔️ Klingon        →  NO pueden vivir en planetas de clima CÁLIDO
✨ Nibiriano veg.  →  Solo en planetas con FLORA ROJA
✨ Nibiriano peces →  Solo en planetas con SERES ACUÁTICOS
💰 Ferengi        →  NO pueden vivir en planetas FRÍOS
```

---

## 🗂️ Estructura del proyecto

```
StarTucom/
└── src/
    ├── Main.java
    ├── model/
    │   ├── Ser.java           ← Clase abstracta base
    │   ├── Humano.java
    │   ├── Vulcaniano.java
    │   ├── Andoriano.java
    │   ├── Nibiriano.java
    │   ├── Klingon.java
    │   ├── Ferengi.java
    │   └── Planeta.java
    ├── controller/
    │   └── CensusController.java
    └── view/
        └── Menu.java
```

---

## 🧬 Diagrama de herencia

```
                        Ser (abstract)
                           │
        ┌──────┬───────┬───┴───┬─────────┬────────┐
        │      │       │       │         │        │
     Humano Vulcan. Andor. Nibirian.  Klingon  Ferengi
```

---

## 📋 Funcionalidades

- [x] **1.** Registrar planeta *(con validación de clima, capacidad, flora y fauna)*
- [x] **2.** Censar un ser *(validando reglas de convivencia)*
- [x] **3.** Borrar un ser del censo
- [x] **4.** Listado de seres agrupados por planeta
- [x] **5.** Modificar propiedades numéricas de un ser
- [x] **6.** Mostrar todos los seres de una especie
- [x] **0.** Salir
- [x] 💾 Persistencia de datos en `Planetas.txt` *(serialización en tiempo real)*

---

## 🖥️ Ejemplo de salida

```
**********************************************
************ SERES POR PLANETA ***************
**********************************************
Planeta: Vulcano
[ Galaxia: Cuadrante Beta - Capacidad: 20 - Clima: Cálido - Flora Roja ]
--->  Población  <---
Vulcaniano: Spock - Nivel de meditación: 10
Ferengi: Quark - Latinum: 100
**********************************************
Planeta: Andor
[ Galaxia: Cuadrante Alfa - Capacidad: 10 - Clima: Frío ]
--->  Este planeta no tiene seres registrados <---
**********************************************
```

---

## 🚀 Cómo ejecutarlo

### Con NetBeans
1. Abre NetBeans → `File > Open Project`
2. Selecciona la carpeta `StarTucom`
3. Click derecho en el proyecto → `Set as Main Project`
4. Pulsa **Run** (F6) 🎮

### Con terminal
```bash
# Compilar
javac -d out src/model/*.java src/controller/*.java src/view/*.java src/Main.java

# Ejecutar
java -cp out Main
```

---

## 🛠️ Tecnologías

- **Java** (JDK 8+)
- **NetBeans IDE**
- Serialización con `ObjectOutputStream` / `ObjectInputStream`
- Patrón **MVC**
- **Herencia y Polimorfismo**

---

## 👨‍💻 Autor

<div align="center">

**ignac** · DAW · STUCOM Barcelona

![Star Trek Bye](https://media.giphy.com/media/l4FB5yXHoVSheWQ5a/giphy.gif)

*"Un Ferengi sin riqueza no es un Ferengi"*

</div>
