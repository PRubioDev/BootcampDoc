def color = 'blanco'

def pregunta = '¿De qué color es el caballo de Santiago?'

println "Clase del objeto 'color': " + color.class
println 'Clase del objeto "pregunta": ' + pregunta.class

// Esto no nos cambia la clase, nos imprime el $, no interpola
pregunta = '¿De qué color es el caballo ${color} de Santiago?'
println 'Clase del objeto "pregunta": ' + pregunta.class
println "\n$pregunta"

// Da igual si le pones las llaves o no
pregunta = "¿De qué color es el caballo ${color} de Santiago?"
pregunta = "¿De qué color es el caballo $color de Santiago?"
println 'Clase del objeto "pregunta": ' + pregunta.class

println "\n$pregunta"

cs = new cowsay()

cs.main(color)
