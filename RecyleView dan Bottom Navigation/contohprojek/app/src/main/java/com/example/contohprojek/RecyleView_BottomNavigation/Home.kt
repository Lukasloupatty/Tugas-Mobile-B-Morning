package com.example.contohprojek.RecyleView_BottomNavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contohprojek.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var recyclerView: RecyclerView
    private lateinit var NewList : ArrayList<New>
    private lateinit var adapter: MyAdapter

    private lateinit var imageId : Array<Int>
    private lateinit var heading : Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        detailinitiallize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.list)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter (NewList)
        recyclerView.adapter = adapter
    }

    private fun detailinitiallize() {

        NewList = arrayListOf()

        imageId = arrayOf(
            R.drawable.bababa,
            R.drawable.kakaka,
            R.drawable.lalalal,
            R.drawable.mamama,
            R.drawable.kakaka,
            R.drawable.lalalal,
            R.drawable.mamama,

        )

        heading = arrayOf(
            "AAAA",
            "bbbbb",
            "ccccc",
            "dddd",
            "eeeee",
            "fffff",
            "gggg",

        )

        for (i in imageId.indices) {
            val New= New(imageId[i], heading[i])
            NewList.add(New)
        }
    }


}