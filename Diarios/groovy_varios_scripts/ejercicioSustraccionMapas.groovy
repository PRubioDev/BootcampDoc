def capitales=['España':'Madrid', 'Francia':'Paris', 'Alemania':'Berlín', 'Irlanda':'Dublín']

capitales.each {
  println it
}
def otrasCapitales=['Italia':'Roma', 'Reino Unido':'Londres']


capitales+=otrasCapitales


println ""


capitales.each {
  println it
}


otrasCapitales.each {
  capitales.remove(it.key)
}


println ""


capitales.each {
  println it
}
