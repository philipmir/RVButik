package com.example.rv_butik

object DataManager {
    val varor = mutableListOf<Vara>()


    init {
        createMockData()
    }



    fun createMockData() {
        varor.add(Vara("agg", 22, R.drawable.agg))
        varor.add(Vara("mjol", 33, R.drawable.mjol))
        varor.add(Vara("lakrits", 43, R.drawable.lakrits))
        varor.add(Vara("kaffe", 12, R.drawable.kaffe))
        varor.add(Vara("energi", 5, R.drawable.energi))
        varor.add(Vara("juice", 55, R.drawable.juice))
        varor.add(Vara("mjolk", 15, R.drawable.mjolk))
        varor.add(Vara("revben", 67, R.drawable.revben))
        varor.add(Vara("skinka", 90, R.drawable.skinka))
        varor.add(Vara("brod", 200, R.drawable.brod))



    }
}