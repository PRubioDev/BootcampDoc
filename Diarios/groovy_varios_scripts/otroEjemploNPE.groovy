class unObjeto {
    int valor = 10
}
miObjeto = new unObjeto()
//unObjeto = "soy un string"
//println unObjeto
//println unObjeto.class
//unObjeto = 10
//println unObjeto.class

def concatenar (mivalor) {
    otrovalor = mivalor + 10
    println otrovalor
}

println concatenar(miObjeto.valor)
println concatenar?(miObjeto?.numero?)
// concatenar(miObjeto.valor?)