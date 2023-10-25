package `in`.ms.layoutbasic.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import `in`.ms.layoutbasic.databinding.ActivityMain2Binding
import `in`.ms.layoutbasic.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataSet = DataSource().loadData()

        binding.recyclerView.adapter = ItemAdapter(this,dataSet)

        binding.recyclerView.setHasFixedSize(true)

    }
}