fun main(args: Array<String>) {

    var soma =  0
    var maior = 0
    var menor = 0
    var cont = 0

    do{
        println("Informe um numero se deseja finalizar insira o numero zero: ")
        var numero= readLine()!!.toInt()

        if(cont==0){
            menor=numero
            maior=numero
        }
        if(menor>numero && numero!= 0){
            menor=numero
        }
        if(maior<numero){
            maior=numero
        }
        soma += numero
        cont++

    }while(numero!=0)
        var media = (soma / (cont - 1)).toDouble()
        println(
            "A quantidade de numeros inseridos foram: $cont \n " +
                    "A media deles é igual a: $media " +
                    "\n A soma deles é igual a: $soma" +
                    "\n O maior deles é o: $maior" +
                    "\n O menor é: $menor"
        )

}