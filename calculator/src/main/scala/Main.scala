package com.thiagoqvdo

import scala.io.StdIn.{readFloat, readLine}
import scala.util.control.Breaks.{break, breakable}

@main def main(): Unit = {
    def calculate(x: Float, y: Float, operation: String): Unit = {
        println(s"$x $operation $y = ${
            operation match
                case "+" => x + y
                case "-" => x - y
                case "*" => x * y
                case "/" => x / y
                case _ => println("Operação inválida")
        } ")
    }

    breakable {
        while true do {
            print("Digite um número:")
            val x: Float = readFloat
            print("\n")

            print("Digite outro número:")
            val y = readFloat
            print("\n")

            print("Operação:")
            val operation = readLine
            print("\n")

            calculate(x, y, operation)

            print("Deseja parar a aplicação? ")
            readLine match
                case "sim" | "s" | "Sim" | "SIM" => break
        }
    }

}
