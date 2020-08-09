# Estructura de datos
> Life is like ride biclyercule. To keep you need
Nos preguntaremos ¿Que son las estructuras de datos y porque son tan importantes en CS?
Una computadora solo puede manejar bits y el conjuntos de bits le llamamos datos, y al conjunto de datos 
le llamamo información. En alguna parte todo la informacion que existe debe ser guardado en alguna para que
despues sea procesada por el procesador. Recordemos que para que la computadora ejecute un programa por diversas fases, una de ellas es cargar primero todos los programas en memoria principal(Memoria RAM) para despues pasar al CPU donde sera procesada.

---
Title: Data structure with Java articule and summerizer on boook(ideas
Autor: Guilllermo Gerardo Andres Urbano (son metadatos,no se veran)
Date: Agusth 8th 20120

# Note of the Data Structure

Utiliy Java like programming langugue for our data structures, one consideration is that we refer _collectio_ the same way like _data estructure_, in the world java is very commun related collection with data structure.

A collection is an object that gathers and organizes other objects.

Collections can be separated into two broad caregories:

* Linear
* NonLinear

The organization of the elements in a collection, relative to each other, is usually determined by one of two things:

* The order in which they were added to the collection
* Some inherent relationship among the elements themselves


### Abstract Data Types
An abstraction hide certain details at certain time. Dealing with an abstraction is easier than dealing with too many details at one time. For example, we drieve a car, instead we can focues on the **interface** to the car.

A collection, like any well-designed object, is an abstraction. A collection defines the **interface operation** throught which the user can manage the objets in the collection, such as **adding** and **remove** elements.

A class that implements the collection's interface must fullfill the conceptual definition of the collection, but it can do so in many ways.

![ADT's operations]("./img/ADT_operations.png")

> Frank M. Carrano, Timothy Henry,  Data Abstraction & Problem Solving with C++:Walls and Mirrors, Person, 2012.

In large software systems, it is virtually impossible for any one person to grasp all the datails of the system at once. Instead, the system is divided into *abstract subsystem* such that the purpose of an the intectactions amog those subsystems can be specified.

An **object** is the perfec mechanism ofr creating a **collection** thanks a **encapsulated**.

These are question is fundamentally wondering every time tha we build a collection:

1. How does the collection operate, conceptually?
2. How do we formally define the interface to the collection?
3. What kind of problems does the collection help us solve?
4. What support is already available to us for this type of collection?
5. In which various ways might we implement the collection?
6. What are the benefits and costs of each implementation?
    
You might ask why we should learn how to **design** and **implement** collections if a set of collections has already been provided for us.
* First, the Java Collection API provides only a subset of the collections you may want to use.
* Second, the classses that are provides may not implement the collections in the ways you desire.
* Third, and perhaps most important, **the study of software development requires a deep understanding of the issues involved in the design of data structure used to implement them.**


### Glosary 
#### Data type
A data type is a group of **values** and the **operations** defined on those values.
#### Abstract data type
An abstract data type (ADT) is a data type whose **values** and **operations** are not inherently defined within a programming language. It is **abstract** only in that the details of its implementation *must be defined* nad should be hidden from the user.



