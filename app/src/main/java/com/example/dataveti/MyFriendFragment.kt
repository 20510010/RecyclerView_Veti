package com.example.dataveti

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*
import java.util.zip.Inflater

class MyFriendFragment : Fragment(){
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(
            MyFriend("Indah Imuet", "perempuan", "indah@gmail.com", "0877777717727", "jakarta")
        )
        listTeman.add(
            MyFriend("Indah Imuet", "perempuan", "indah@gmail.com", "0877777717727", "jakarta")
        )
        listTeman.add(
            MyFriend("Indah Imuet", "perempuan", "indah@gmail.com", "0877777717727", "jakarta")
        )
        listTeman.add(
            MyFriend("Indah Imuet", "perempuan", "indah@gmail.com", "0877777717727", "jakarta")
        )
        listTeman.add(
            MyFriend("Indah Imuet", "perempuan", "indah@gmail.com", "0877777717727", "jakarta")
        )
        listTeman.add(
            MyFriend("Indah Imuet", "perempuan", "indah@gmail.com", "0877777717727", "jakarta")
        )
        listTeman.add(
            MyFriend("Indah Imuet", "perempuan", "indah@gmail.com", "0877777717727", "jakarta")
        )
        listTeman.add(
            MyFriend("Indah Imuet", "perempuan", "indah@gmail.com", "0877777717727", "jakarta")
        )
        listTeman.add(
            MyFriend("Indah Imuet", "perempuan", "indah@gmail.com", "0877777717727", "jakarta")
        )
        listTeman.add(
            MyFriend("Indah Imuet", "perempuan", "indah@gmail.com", "0877777717727", "jakarta")
        )
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}