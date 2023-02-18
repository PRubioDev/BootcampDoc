// Closure con solo un parámetro
def saludaPlaneta = { nombre ->
    println "¡Hola ${nombre}!" }

saludaPlaneta 'Venus'

// Precarga de parámetro

def planeta = saludaPlaneta.curry('Mercurio')
planeta()

// Otro closure con solo un parámetro
def cuadrado = { factor ->
    factor * factor
}

println cuadrado(8)

// Otro closure con dos parametros
def multiplicar = { factor01, factor02 ->
    factor01 * factor02
}

println multiplicar(2, 3)

// Precarga de parametro
def doble = multiplicar.curry(2)
println doble(8)

def triple = multiplicar.curry(3)
println triple(8)

def multiplicacionPrecargada = multiplicar.curry(2, 5)

println multiplicacionPrecargada()

def multiplicarRaro = { factor01, factor02, factor03 ->
    factor01 * factor02 * factor03
}

def multiplicacionPrecargadaRara = multiplicarRaro.curry(2, 3)

println multiplicacionPrecargadaRara(5)

def multiplicacionPrecargadaRara2 = multiplicarRaro.curry(2, 3, 5)

println multiplicacionPrecargadaRara2()

// Ejemplo closure como parametro
def saludaPlaneta2 = { nombre ->
    println "¡Hola ${nombre}!" }

def ssolar = ['Mercurio', 'Venus', 'Tierra', 'Marte', 'Júpiter', 'Saturno', 'Urano',
'Neptuno', '¿Plutón?']

// Funciona tanto con Closure como sin Closure
def mensajePlanetas(sistema, Closure mensaje) {
    for (cceleste in sistema) {
        mensaje cceleste
    }
}

mensajePlanetas(ssolar, saludaPlaneta2)

def despidePlaneta = { nombre ->
println "¡Adios ${nombre}!" }

mensajePlanetas(ssolar, despidePlaneta)
