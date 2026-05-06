class CuentaBancaria(
    val titular : String,
    var saldo : Double,
) {
    fun depositar(monto: Double) {
        this.saldo += monto
    }
    fun retirar(monto: Double): Boolean {
        return if (monto <= this.saldo) {
            this.saldo -= monto
            true
        } else false

    }
}

