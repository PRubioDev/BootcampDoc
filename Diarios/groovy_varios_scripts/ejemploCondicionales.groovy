def valor01 = ( 1==1 ) ? 'OK' : 'KO'
def valor02 = ( 1==2 ) ? 'OK' : 'KO'
println "$valor01 $valor02" //Salida: OK KO

nodefinido=null
// nodefinido="null"
// Cuando es falsy, pues que no nos devuelva un false, null, 0, etc., le damos un valor y listo.
def nombre = nodefinido ?: "Anónimo"
println "$nombre" //Salida: Anónimo