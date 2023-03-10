def String x = "bar"
def result = ""

switch (x) {
    case "foo":
        result = "found foo"
        // lets fall through

    case "bar":
        println "Muajajaj"
        result += "bar"

    case [4, 5, 6, 'inList']:
        println result + result.class
        result = "list"
        break

    case 12..30:
        result = "range"
        break

    case Integer:
        result = "integer"
        break

    case Number:
        result = "number"
        break

    case ~/fo*/: // toString() representation of x matches the pattern?
        result = "foo regex"
        break

    case { it < 0 }: // or { x < 0 }
        result = "negative"
        break

    default:
        result = "default"
}

// assert result == "bar"