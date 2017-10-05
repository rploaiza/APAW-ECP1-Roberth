# APAW. ECP1. Patrones de Diseño

[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=es.upm.miw:APAW.ECP1.Roberth)](https://sonarcloud.io/dashboard/index/es.upm.miw:APAW.ECP1.Roberth)

[![Build Status](https://travis-ci.org/rploaiza/APAW-ECP1-Roberth.svg?branch=master)](https://travis-ci.org/rploaiza/APAW-ECP1-Roberth)

***

Asignatura: Arquitectura y Patrones para Aplicaciones Web.
 
***
# Descripción

Desarrollo de la práctica ECP1. Patrones de Diseño.

***
# Patron Strategy

* Este patron permite dinamizar la ejecución de un algoritmo especifico en base a un parametro dado; permitiendo así que la aplicación decida en tiempo de ejecución que algoritmo ejecutar.

* El objetivo de este patrón es encapsular diversas formas de ejecución de un mismo método, que son derivaciones de un método base común, para poder alternar la forma  de ejecución del método dependiendo del objeto que lo solicite.

# Este patrón debe utilizarse cuando:
Un programa tiene que proporcionar múltiples variantes de un algoritmo o comportamiento.
Es posible encapsular las variantes de comportamiento en clases separadas que proporcionan un modo consistente de acceder a los comportamientos.
Permite cambiar o agregar algoritmos, independientemente de la clase que lo utiliza.

# Strategy: declara una interfaz común a todos los algoritmos soportados.
* StrategyConcreto: implementa un algoritmo utilizando la interfaz Strategy. Es la representación de un algoritmo.
* Context: mantiene una referencia a Strategy y según las características del contexto, optará por una estrategia determinada..
* Context / Cliente: solicita un servicio a Strategy y este debe devolver el resultado de un StrategyConcreto. 

![UML](https://danielggarcia.files.wordpress.com/2014/05/051214_2126_patronesdec1.png?w=620)

# Aplicación del patrón

Aplicativo que permita realizar las 4 operaciones basicas como suma, resta, multiplicacion y division, donde la estrategia sera la operación que el usuario desee aplicar.