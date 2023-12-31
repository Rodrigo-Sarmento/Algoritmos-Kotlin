fun pesquisaBinaria(lista: List<Int>, item: Int): Int? {
    var menor = 0
    var maior = lista.size - 1

    while (menor <= maior) {
        val meio = (maior + menor) / 2
        val tentativa = lista[meio]

        if (tentativa == item) {
            return meio
        } else if (tentativa > item) {
            maior = meio - 1
        } else {
            menor = meio + 1
        }
    }

    return null
}

fun main() {
    val minhaLista = listOf(1, 2, 4, 7, 9)
    val resultado = pesquisaBinaria(minhaLista, 9)

    if (resultado != null) {
        println("Item encontrado na posição $resultado") // Saída: Item encontrado na posição 4
    } else {
        println("Item não encontrado na lista")
    }
}
