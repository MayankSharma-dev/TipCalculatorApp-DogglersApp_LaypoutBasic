package `in`.ms.layoutbasic.dogglers

import `in`.ms.layoutbasic.R

class Source {
    fun load(): List<Pojo>{
        return listOf<Pojo>(
            Pojo("Bella",1,"walking", R.drawable.bella),
            Pojo("Faye",1,"walking", R.drawable.faye),
            Pojo("Frankie",1,"walking", R.drawable.frankie),
            Pojo("Leroy",1,"walking", R.drawable.leroy),
            Pojo("Nox",1,"walking", R.drawable.nox),
            Pojo("Tzeitel",1,"walking", R.drawable.tzeitel) )
    }
}