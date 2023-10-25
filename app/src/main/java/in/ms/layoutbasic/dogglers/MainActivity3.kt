package `in`.ms.layoutbasic.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.imageview.ShapeableImageView
import `in`.ms.layoutbasic.R
import `in`.ms.layoutbasic.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding:ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.d1.setOnClickListener {
            val intent = Intent(this,VerticalActivity::class.java)
            startActivity(intent)
        }

        binding.d2.setOnClickListener {

            val intent = Intent(this,HorizontalActivity::class.java)
            startActivity(intent)

        }

        binding.d3.setOnClickListener {
            val intent = Intent(this,GridActivity::class.java)
            startActivity(intent)
        }

    }
}