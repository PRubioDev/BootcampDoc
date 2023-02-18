def cadena = """La razón de la sinrazón que a mi razón se hace, de tal manera mi razón enflaquece, que con razón me quejo de la vuestra fermosura...
Con estas razones perdía el pobre caballero el juicio..."""


def exp = /\s([a-z|A-Z|0-9])*raz(o|ó)n[a-z]*/

def matcher = cadena =~ exp

println "La cantidad de coincidencias es: " + matcher.size()
println ""
println "Estas son las coincidencias encontradas:"
println ""



matcher.eachWithIndex { it, index ->
    println index+1 + ". Ocurrencia: " + it
}