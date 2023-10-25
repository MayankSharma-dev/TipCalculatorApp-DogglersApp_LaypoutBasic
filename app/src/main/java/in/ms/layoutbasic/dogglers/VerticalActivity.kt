package `in`.ms.layoutbasic.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import `in`.ms.layoutbasic.R
import `in`.ms.layoutbasic.databinding.ActivityVerticalBinding

class VerticalActivity : AppCompatActivity() {

    private lateinit var bind:ActivityVerticalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityVerticalBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.recyclerviewV.adapter = DogglerAdapter(this,1)
        bind.recyclerviewV.setHasFixedSize(true)


    }
}