package `in`.ms.layoutbasic.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import `in`.ms.layoutbasic.R
import `in`.ms.layoutbasic.databinding.ActivityHorizontalBinding

class HorizontalActivity : AppCompatActivity() {

    private lateinit var bind:ActivityHorizontalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityHorizontalBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.recyclerviewH.adapter = DogglerAdapter(this,1)
        bind.recyclerviewH.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}