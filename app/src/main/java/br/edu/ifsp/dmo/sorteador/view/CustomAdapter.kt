package br.edu.ifsp.dmo.sorteador.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import br.edu.ifsp.dmo.sorteador.R

class CustomAdapter(context: Context, private val numbers: List<Int>) :
    ArrayAdapter<Int>(context, 0, numbers) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.layout_list_item, parent, false)

        val textViewSequence = view.findViewById<TextView>(R.id.textview_sequence)
        val textViewNumber = view.findViewById<TextView>(R.id.textview_number)

        // Define o texto da sequência e do número sorteado
        textViewSequence.text = "${position + 1}º sorteado = "
        textViewNumber.text = String.format("%03d", numbers[position]) // Exibe com três dígitos

        return view
    }
}
