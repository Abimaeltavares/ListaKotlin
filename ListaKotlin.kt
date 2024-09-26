/**
 * Compilação
 * Kotlin -include-runtime -d ListaKotlin.jar ListaKotlin.kt
 * 
 * execução
 * java -jar ListaKotlin.jar
 *
 */
var lista: MutableList<String> = mutableListOf()

fun adicionarItem(){
    while (true){
        print("Digite o item a ser adicionado (ou 'sair' para voltar ao menu): ")
        val item = readLine()
        if(item != null) {
            if (item.lowercase() == "sair") {
                break
            }else{
                lista.add(item)
                println("$item adicionado com sucesso!")
            }
        } else {
        println("Erro ao ler item!")
        }
    }
    showMenu()
}

fun listarItens(){
    if(lista.isEmpty()) {
        println("Lista vazia!")
    } else {
        println("Itens da lista:")
        lista.forEachIndexed { index, item ->
            println("${index + 1} - $item")
        }
    }
}

fun removerItem(){
    if(lista.isEmpty()) {
        println("Lista vazia!")
    } else {
        print("Digite o item a ser removido: ")
        val item = readLine()
        if(item != null) {
            if(lista.contains(item)){
                lista.remove(item)
                println("$item removido com sucesso!")
            } else {
                println("Item não encontrado!")
            }
        } else {
            println("Erro ao ler item!")
        }
    }
}

fun showMenu(){

     println("Menu")
     println("1 - Adicionar item")
     println("2 - Listar Itens")
     println("3 - Remover itens")
     println("0 - Sair")
     print("Opção: ")
     val opcao = readLine()
     when(opcao){
         "1" -> adicionarItem()
         "2" -> listarItens()
         "3" -> removerItem()
         "0" -> return
         else -> println("Opção inválida")
        
    }
}

fun main(){
    showMenu()
}