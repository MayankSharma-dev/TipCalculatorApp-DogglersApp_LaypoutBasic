package `in`.ms.layoutbasic.dogglers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView
import `in`.ms.layoutbasic.R

class DogglerAdapter(private val context:Context,private val layout:Int): RecyclerView.Adapter<DogglerAdapter.ItemHolder>() {

    private val dataList= Source().load()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val viewMain =  when (layout) {
            0 -> {
                LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item,parent,false)
            }
            else -> {
                LayoutInflater.from(parent.context).inflate(R.layout.dogglers_list_items,parent,false)
            }
        }

        return ItemHolder(viewMain)

    }



    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        val current = dataList[position]

        holder.imageView.setImageResource(current.image)
        holder.dName.text = current.name
        holder.age.setText(current.age.toString())
        holder.hobby.text = current.hobby

    }

    override fun getItemCount(): Int {
        return dataList.size
    }


    class ItemHolder(view:View):RecyclerView.ViewHolder(view){
       val imageView: ShapeableImageView = view.findViewById(R.id.d_img)
       val dName:MaterialTextView = view.findViewById(R.id.d_name)
       val age:MaterialTextView = view.findViewById(R.id.d_age)
       val hobby:MaterialTextView = view.findViewById(R.id.d_hobby)
    }

}