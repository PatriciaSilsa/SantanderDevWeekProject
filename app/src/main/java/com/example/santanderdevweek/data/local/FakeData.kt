package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente("Olá, Paty")
        val cartao = Cartao("41111111")
        return Conta(
            "445655-40",
            "6552",
            "R$ 2.345,65",
            "R$ 3.567,45",
             cliente,
             cartao
        );

    }
}