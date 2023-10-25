package `in`.ms.layoutbasic

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import `in`.ms.layoutbasic.databinding.ActivityMainBinding
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //View binding = removes findViewById usage
        //val binding = ActivityMainBinding.inflate(layoutInflater)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // \\
        //setContentView(R.layout.activity_main) // R.layout.activity_main is replaced with 'binding.root' for viewBinding

        // for hiding the keyboard after pressing enter button
        binding.cos.setOnKeyListener { view, keyCode, _ ->
            handleKeyEvent(view, keyCode)
        }

        binding.bt.setOnClickListener {
            calculateTip()
        }

    }

    private fun calculateTip() {
        if (binding.cos.text.toString().isBlank()) {
            Toast.makeText(applicationContext, "Please Enter the Amount", Toast.LENGTH_SHORT).show()
        } else if (binding.tipOption.checkedRadioButtonId == -1) {
            Toast.makeText(
                applicationContext, "Please Select Tip percentage", Toast.LENGTH_SHORT
            ).show()
        } else {

            Log.d("data", "" + binding.tipOption.checkedRadioButtonId)

            val tipPercentage = when (binding.tipOption.checkedRadioButtonId) {
                R.id.rb1 -> 0.20
                R.id.rb2 -> 0.18
                else -> 0.15
            }

            if (binding.switchButton.isChecked) {

                var total = binding.cos.text.toString().toDouble() * tipPercentage

                total = ceil(total)

                binding.tip.text = total.toString()

                binding.cos.text.clear()

            } else {

                val total = binding.cos.text.toString().toDouble() * tipPercentage

                binding.tip.text = total.toString()

                binding.cos.text.clear()

            }

        }
    }

    /*
The handleKeyEvent() is a private helper function that hides the onscreen keyboard if the keyCode input parameter is equal to KeyEvent.KEYCODE_ENTER.
The InputMethodManager controls if a soft keyboard is shown, hidden, and allows the user to choose which soft keyboard is displayed.
The method returns true if the key event was handled, and returns false otherwise.
*/
    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            Log.d("Pressed", "buttonPressed")
            // Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }


}

