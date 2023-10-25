package `in`.ms.layoutbasic.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import `in`.ms.layoutbasic.R

class GridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        val recyclerView:RecyclerView = findViewById(R.id.recyclerview_g)

        recyclerView.adapter = DogglerAdapter(this,0)

        recyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}