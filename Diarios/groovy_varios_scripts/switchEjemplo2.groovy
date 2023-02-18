def person = 'Adam'

def partner = switch(person) {
    case 'Romeo'  -> 'Juliet'
    case 'Adam'   -> 'Eve'
    case 'Antony' -> 'Cleopatra'
    case 'Bonnie' -> 'Clyde'
}



println partner