package `in`.ms.layoutbasic.affirmations

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView
import `in`.ms.layoutbasic.R

class ItemAdapter(private val context:Context, private val dataSet: List<Affirmation>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)

        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = item.stringResourceId.toString()
        holder.image.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


    class ItemViewHolder(view:View): RecyclerView.ViewHolder(view){
        val textView:MaterialTextView =view.findViewById(R.id.item_textview)
        val image:ShapeableImageView = view.findViewById(R.id.item_image)
    }

}