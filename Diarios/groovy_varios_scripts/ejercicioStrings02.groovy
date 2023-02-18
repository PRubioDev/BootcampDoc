println '''Cadena de texto con comillas triples simples:
Segunda línea...
'''
println '''### Estamos imprimiendo la clase del texto anterior
''' + '''Cadena de texto con comillas triples simples:
Segunda línea...'''.class


println """Cadena de texto con comillas triples dobles:
Segunda línea..."""
println """Cadena de texto con comillas triples dobles:
Segunda línea...""".class


println '''Cadena de texto con comillas triples simples e interpolación:
Segunda línea...
Y la tercera.


Y la quinta

Hoy es ${new Date()}


Y Terminamos
'''
println '''Cadena de texto con comillas triples simples e interpolación:
Segunda línea...
Hoy es ${new Date()}'''.class


println """Cadena de texto con comillas triples dobles e interpolación:
Segunda línea...
Hoy es ${new Date()}"""
println """Cadena de texto con comillas triples dobles e interpolación:
Segunda línea...
Hoy es ${new Date()}""".class